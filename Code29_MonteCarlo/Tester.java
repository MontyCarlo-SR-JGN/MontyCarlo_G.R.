import java.io.*;
import java.util.*;
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{

    static int cirCount = 0;
    static int sqrCount = 0;
    static MonteCarlo monteCarlo = new MonteCarlo(5, 3, 2);

    public static void main (String[] args) 
    {

        for (int i=0; i<=1000000; i++) 
        {
            double randx = monteCarlo.nextRainDrop_x();
            double randy = monteCarlo.nextRainDrop_y();

            if(monteCarlo.insideCircle(randx, randy))
            {

                cirCount++;
            }
            sqrCount++;
        }

        System.out.println("Pi = "+cirCount*Math.pow((2*monteCarlo.r), 2)/(sqrCount*Math.pow(monteCarlo.r, 2)));
    }

}