questions that your requirements should address:

how large is the grid? is it boundless?
The grid will be 10 X 10. It will not be boundless. 

what do live cells look like?
The live cells will be represented by rocks.

what do dead cells look like?
The dead cells will be represented by nothing, so leave them as blank spaces. 

what pattern is displayed? are multiple patterns available? are patterns chosen in code, chosen randomly, chosen by user
how long does the game run? does it run forever? does it prompt the user to continue?
The pattern displayed is pre-chosen by the maker of this program. It will run six generations, and it does not prompt the user 
to continue. The pattern displayed is a simple that I created that represents harmony. 

what is the time interval between generations?
The time interval between each generation will be 2 seconds. 

what about edge cases? does it wrap around?
If cells run out of edge, then they will be dead and not be displayed. 

reflection: 
     Due to the lack of time my gameoflife lab is not perfect. It barely meets the functional requirements and could 
     difinitely be improved upon. I did not deal with the edge issue or make any awesome pattern.
     Next time I will start the lab as soon as possible and do my best to avoid the last minitue rush. Also I will try 
     my best to get java installed at home, as the course gets more challenging, it is no longer an option.

Introduction

The goal of this lab is to apply your understanding of decision and loop
	structures to implement a complex algorithm within the context of an
	unfamiliar and significant software framework (GridWorld). In addition,
	you will implement a unit test for your program using the JUnit framework
	and create documentation for your program using JavaDoc.


Requirements

Write a program that plays Conway’s Game of Life. Conway’s Game of Life is a
	cellular automaton. From Wikipedia:

The universe of the Game of Life is an infinite two-dimensional orthogonal
	grid of square cells, each of which is in one of two possible states,
	alive or dead. Every cell interacts with its eight neighbours, which are
	the cells that are horizontally, vertically, or diagonally adjacent. At
	each step in time, the following transitions occur:

* Any live cell with fewer than two live neighbours dies, as if caused by
	underpopulation.
* Any live cell with two or three live neighbours lives on to the next generation.
* Any live cell with more than three live neighbours dies, as if by overcrowding.
* Any dead cell with exactly three live neighbours becomes a live cell, as if
	by reproduction.
* The initial pattern constitutes the seed of the system. The first
	generation is created by applying the above rules simultaneously to every
	cell in the seed—births and deaths occur simultaneously, and the discrete
	moment at which this happens is sometimes called a tick (in other words,
	each generation is a pure function of the preceding one). The rules
	continue to be applied repeatedly to create further generations.


Nonfunctional Requirements:

* the program must be implemented in Java and utilize the GridWorld platform
* I recommend not use GridWorld’s execution engine to produce subsequent
	generations. It will be easier to implement the unit test if you directly
	produce and display subsequent generations.


Artifacts to Produce:

* Requirements Document: Many functional and nonfunctional requirements needs
	to be defined. You must define additional requirements that are
	reasonable and document them in a requirements document. I must review
	your requirements document before you start the design document or test
	plan. You may change the requirements document throughout development.
* Design Document: You must do some design activity before starting
	implementation. This may consist of a flow cart, pseudocode, or other
	design artifact. I must review your design document before you start
	implementing code. You may change your design document throughout
	development.
* Test Plan: You must create a test plan with specific test cases (at least
	two) before starting implementation. I must review your test plan before
	you start implementing your test class. You may change your test plan
	throughout development. The provided code in GitHub is an example of
	implementing an initial test case.
* GameOfLifeTest Test Class: JUnit-compatible test class that implements the
	test plan.
* GameOfLife class: You must produce a working class the meets the
	requirements and is verified and validated by your test plan.
* Reflection Document: This is a significant and challenging lab. Please
	reflect on this experience and share your feedback with me. What did you
	like or dislike and why? What was surprising or unexpected? What did you
	learn? What questions do you still have? What advice would you offer next
	year's students?


Submission:

* Ensure the following artifacts have been committed to GitHub in addition to your code:
    * requirements document
    * design document (pseudocode, flow charts, etc.)
    * test plan (with specific test cases)
    * HTML documentation generated by JavaDoc
    * reflection document
* Submit a pull request in GitHub and submit a link to the request with this assignment.
