package Task_03;

import java.util.Scanner;
import static java.lang.System.* ;

 public class TwoArrays {

    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);                //reading from System.in

        out.print("Enter positive ArrayMin value:");
        int arrayMin = reader.nextInt();

        out.print("Enter positive ArrayMax value (> ArrayMin):");
        int arrayMax = reader.nextInt();

        reader.close();


        if (arrayMin + 10 >= arrayMax) {
            out.println("Incorrect interval entered");
            System.exit(-1);
        }

        int[] valuesArray = new int[(arrayMax - arrayMin+1)];
        int counter = 0;
        for (int i = arrayMin ; i <= arrayMax; i++)
        {
            out.print("current Value is: "+i+ "\n");
            valuesArray[counter] = i;
            counter++;
        }

        //output of the Array
        for (int j = 0; j< valuesArray.length; j++){
            System.out.println("Array element with address "+j+" has value "+ valuesArray[j]);
        }

        int sum = 0;
        for (int j = 0; j< valuesArray.length; j++) {

            if (valuesArray[j] % 3 == 0 && valuesArray[j] % 5 != 0) {
                System.out.println("Condition match for element "+j+" with value " + valuesArray[j]);
                sum = sum + valuesArray[j];
                }
            }

        System.out.println("Sum = " + sum);

    }
}
