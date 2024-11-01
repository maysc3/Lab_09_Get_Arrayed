import java.util.Random;
import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double arraySum = 0;
        double arrayAvg = 0;



        int[] dataPoints = new int[101];
        Random rng = new Random();
        for(int d = 0; d < dataPoints.length; d++){
            dataPoints[d] = rng.nextInt(100)+1;
        }
        for(int c = 0; c < dataPoints.length; c++){
            System.out.print(dataPoints[c] + " | ");
        }
        for(int c = 0; c < dataPoints.length; c++) {
            arraySum += dataPoints[c];
        }

        System.out.println();

        arrayAvg = arraySum/dataPoints.length;
        String avg = String.format("%.2f", arrayAvg);
        System.out.println("The random data array dataPoints has a total sum of " + arraySum + " with an average value of " + avg);

        System.out.println();

        int target = SafeInput.getRangedInt(in,"Enter a value",1,100);
        int tOccurrence=0;
        for(int c = 0; c < dataPoints.length; c++) {
            if(dataPoints[c]==target){
                tOccurrence++;
            }
        }
        System.out.println("The value " + target + " appears " + tOccurrence + " times in the set dataPoints");
        System.out.println();

        target = SafeInput.getRangedInt(in,"Enter a value",1,100);
        int tDex = -1;
        for(int c = 0; c < dataPoints.length; c++)
        {
            if(dataPoints[c]==target)
            {
                tDex = c;
                System.out.println("The value " + target + " was found at array index " + tDex);
                break;

            }
            if (c == dataPoints.length-1)
                System.out.println("The value " + target + " did not appear in the random set dataPoints");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int c = 1; c < dataPoints.length; c++)
        {
            if(dataPoints[c]< min)
                min = dataPoints[c];
            if(dataPoints[c]> max)
                max = dataPoints[c];
        }
        System.out.println();
        System.out.println("The minimum and maximum values of the set dataPoints respectively are " + min + " and " + max);
        // double valued array avg testing

        double testAvg = getAverage(dataPoints);
        System.out.println("Average value of dataPoints is: " + getAverage(dataPoints));


    }
    public static double getAverage(int values[]){
        double retVal = 0;
        double arraySum = 0;

        for(int c = 0; c < values.length; c++) {
            arraySum += values[c];
        }

        System.out.println();

        retVal = arraySum/values.length;

        return retVal;
    }

}