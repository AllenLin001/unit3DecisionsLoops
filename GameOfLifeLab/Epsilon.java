import java.util.Scanner;

/**
 * Write a description of class Epsilon here.
 * 
 * @Allen Lin (your name) 
 * @10/13 (a version number or a date)
 */
public class Epsilon
{
   public static void main(String [] args )
   {
       final double EPSILON = 1e-14;
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a floating point number: ");
       double num = in.nextDouble();
       String magnitude = "";
       
       if (Math.abs(num)<1.0)
       {
           magnitude = "Small";
        }
       if (Math.abs(num)>10000000.0)
       {
           magnitude = "large";
       }
         
     
       if (Math.abs(num-0)<EPSILON)// num== 0
       { 
           System.out.println("It's a zero: ");
       }
       
       else if (num>0)
       {
           System.out.println("It's a "+ magnitude+" + num");
       }
       
       else 
       {
           System.out.println("It's a "+magnitude+" - num");
       }
        
    }
}
