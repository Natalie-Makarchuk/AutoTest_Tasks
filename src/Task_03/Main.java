package Task_03;

import java.util.Scanner;
import static java.lang.System.* ;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);                //reading from System.in

        out.print("Enter positive ArrayMin value:");
        int ArrayMin = reader.nextInt();

        out.print("Enter positive ArrayMax value (<= ArrayMin):");
        int ArrayMax = reader.nextInt();

        reader.close();


        if (ArrayMin + 10 >= ArrayMax) {
            out.println("Incorrect interval entered");
            System.exit(-1);
        }


        int[] ValuesArray = new int[(ArrayMax - ArrayMin+1)];
        int counter = 0;
        for (int i = ArrayMin ; i <= ArrayMax; i++)
        {
            out.print("current Value is: "+i+ "\n");
            ValuesArray[counter] = i;
            counter++;
        }

        //output of the Array
        for (int j = 0; j< ValuesArray.length; j++){
            System.out.println("Array element with address "+j+" has value "+ ValuesArray[j]);
        }

        int sum = 0;
        for (int j = 0; j< ValuesArray.length; j++) {

            if (ValuesArray[j] % 3 == 0 && ValuesArray[j] % 5 != 0) {
                System.out.println("Condition match for element "+j+" with value " + ValuesArray[j]);
                sum = sum + ValuesArray[j];
            };

            }

        System.out.println("Sum = " + sum);

    }
}
