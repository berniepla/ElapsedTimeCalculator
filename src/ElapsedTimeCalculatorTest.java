import javax.swing.JOptionPane;

/**
 *
 * @author bernardopla
 */
public class ElapsedTimeCalculatorTest
{
    int startTime;
    int endTime;
    

    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Input Start Time");
        int startTime = Integer.parseInt(input);
        
        String twoInput = JOptionPane.showInputDialog("Input End Time");
        int endTime = Integer.parseInt(twoInput);
        
        ElapsedTimeCalculator Racecar = new ElapsedTimeCalculator(startTime, endTime);
        
        System.out.printf( " Start Time: %d" , startTime);
        System.out.printf("\n End Time: %3d", endTime);
        
        System.out.println("\nElapsed Time: " + Racecar.elapsedHours() + " hour(s) and " + Racecar.minElapsed() + " minute(s)" );
        
        System.out.println("\n Minutes elapsed: " + Racecar.timeElapsed());
        System.out.println(" Hours elapsed: " + Racecar.timeTwo()) ;
    }
}
       
    
    
   