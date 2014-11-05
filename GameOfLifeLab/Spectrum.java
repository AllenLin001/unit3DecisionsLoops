import.java.util.Scanner;


/**
 * Write a description of class Spectrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spectrum
{
    public static void main(String args[])
    {
        Scanner.in = new Scanner(System.in);
        System.out.print("wavelength: ");
        double wlength= in.nextDouble();
        if (wlength>10.0e-1)
        {
            System.out.println("Type: Radio Waves   Frequency: <3*10e9");
        }
        if (wlength > 10.0e03 && wlength < 10.0e-1)
        {
            System.out.println("Type: Microwaves    Frequency: 3.0e9 to 3.0e11");
        }
        if (wlength> 10)
        
        
   

    }
}