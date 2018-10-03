package Tasks_01_02;

import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    static final double Pi = Math.PI;

    public static void main(String[] args) {


        /* Task 01
        Написать программу, которая будет вычислять площадь круга и квадрата.
        Дополнительные условия:
        - входные данные должны вводиться с клавиатуры
        - должны использоваться constants и custom methods */

        Scanner reader = new Scanner(System.in);                //reading from System.in
        out.print("Enter Circle Radius, mm:");
        double CirR = reader.nextDouble();

        out.print("Enter Square Side size, mm:");
        double SqSide = reader.nextDouble();

        reader.close();


        double CirA = calculateCircleSize(CirR);
        out.println("Circle Area: " + CirA);

        double SqA = calculateSquareSize(SqSide);
        out.println("Square Area: " + SqA);


        /*Task02
        C предыдущей задачи нам известны площади круга и квадрата. Определить:
        - уместится ли круг в квадрате
        - уместится ли квадрат в круге */

        double CalcR = Math.pow(CirA/Pi, 0.5);
             //  out.println("R calculated = " + CalcR);

        double CalcSqSide = Math.pow(SqA, 0.5);
             //  out.println( "SqSide calculated = " + CalcSqSide);

         double CalcSqDiag = Math.pow(2 * Math.pow(CalcSqSide, 2), 0.5);


        // Уместится ли круг к квадрате?
        if ((CalcR * 2) >= CalcSqDiag) {
             out.println("The Circle can be located inside the Square");
         } else out.println("The Circle can not be located inside the Square");


        // уместится ли квадрат в круге?
        if ((CalcR * 2) >= CalcSqSide) {
            out.println("The Square can be located inside the Circle");
        } else out.println("The Square can not be located inside the Circle");

    }

    static double calculateSquareSize(double SqSide)
    {
        return Math.pow(SqSide, 2);
    }

    static double calculateCircleSize(double circleRadius)
    {
        return Pi * Math.pow(circleRadius, 2);
    }

}



