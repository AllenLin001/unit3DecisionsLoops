import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @Allen Lin
 * @version 23 Nov 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;

    // the game board will have 10 rows and 10 columns
    private final int ROWS = 10;
    private final int COLS = 10;
    // constants for the location of the nine cells initially alive

    private final int X1 = 1, Y1 = 1;
    private final int X2 = 1, Y2 = 2;
    private final int X3 = 1, Y3 = 3;
    private final int X4 = 2, Y4 = 0;
    private final int X5 = 2, Y5 = 1;
    private final int X6 = 2, Y6 = 3;
    private final int X7 = 2, Y7 = 4;
    private final int X8 = 3, Y8 = 1;
    private final int X9 = 3, Y9 = 3;


    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);

        // create a world based on the grid
        world = new ActorWorld(grid);

        // populate the game
        populateGame();

        // display the newly constructed and populated world
        world.show();

    }

    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    public void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();


        // create and add rocks (a type of Actor) to the nine intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);

        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);

        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);

        Rock rock4 = new Rock ();
        Location loc4 = new Location (X4,Y4);
        grid.put(loc4,rock4);

        Rock rock5 = new Rock ();
        Location loc5 = new Location (X5,Y5);
        grid.put(loc5,rock5);

        Rock rock6 = new Rock ();
        Location loc6 = new Location (X6,Y6);
        grid.put(loc6,rock6);

        Rock rock7 = new Rock ();
        Location loc7 = new Location (X7,Y7);
        grid.put(loc7,rock7);

        Rock rock8 = new Rock ();
        Location loc8 = new Location (X8,Y8);
        grid.put(loc8,rock8);

        Rock rock9 = new Rock ();
        Location loc9 = new Location (X9,Y9);
        grid.put(loc9,rock9);

    }
    
    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */

    public void createNextGeneration()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid2 = new BoundedGrid<Actor>(ROWS, COLS);
        // in this example, an alive cell has a non-null actor and a dead cell has a null actor
        Grid<Actor> grid1 = world.getGrid();
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // insert magic here...
                Location loca = new Location(row,col);
                if(grid1.get(loca)== null
                && grid1.getOccupiedAdjacentLocations(loca).size()==3)
                {
                    Rock rock = new Rock();
                    grid2.put(loca, rock);
                }

                else if (grid1.get(loca)!= null
                && (grid1.getOccupiedAdjacentLocations(loca).size()>3
                    || grid1.getOccupiedAdjacentLocations(loca).size() < 2))
                {
                    grid2.remove(loca);
                }

                else if (grid1.get(loca)!= null
                && (grid1.getOccupiedAdjacentLocations(loca).size()==3
                    || grid1.getOccupiedAdjacentLocations(loca).size()==2))
                {
                    Rock rock = new Rock();
                    grid2.put(loca,rock);
                }
                world.setGrid(grid2);
            }
        }
    }

    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }

    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }

    /**
     * Creates an instance of this class. Provides convenient execution.
     * Make the createNextGeneration method run four times to generate the four fourth generation of the initial pattern.
     * Sleep 2 seconds after each generation.
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
        
        try {
            for (int i = 0; i<4; i++)
            {
                Thread.sleep(2000); 
                game.createNextGeneration();
            }
        } catch (Exception e) {
            System.out.println("Nah"); 
        }
    }
}
