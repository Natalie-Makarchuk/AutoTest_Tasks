package Tasks_01_02;

import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    static final double PI = Math.PI;

    public static void main(String[] args) {

        /* Task 01
        Написать программу, которая будет вычислять площадь круга и квадрата.
        Дополнительные условия:
        - входные данные должны вводиться с клавиатуры
        - должны использоваться constants и custom methods */

        Scanner reader = new Scanner(System.in);                //reading from System.in

        double circleRadius = 0;
        double squareSide = 0;

        out.print("Enter Circle Radius, mm:");
        try {
            circleRadius = reader.nextDouble(); }
        catch (java.util.InputMismatchException e) {
                System.err.println("Caught Exception" + e);
                out.println("Entered value is not numeric");
                System.exit(-1);
        }

        out.print("Enter Square Side size, mm:");
        try {
            squareSide = reader.nextDouble(); }
            catch (java.util.InputMismatchException e) {
                    out.print("Entered value is not numeric");
                    System.exit(-1);
        }


        reader.close();


        double circleArea = calculateCircleSize(circleRadius);
        out.println("Circle Area: " + circleArea);

        double squareArea = calculateSquareSize(squareSide);
        out.println("Square Area: " + squareArea);


        /*Task02
        C предыдущей задачи нам известны площади круга и квадрата. Определить:
        - уместится ли круг в квадрате
        - уместится ли квадрат в круге */

        double calculatedRadius = Math.pow((circleArea/PI), 0.5);
               out.println("R calculated = " + calculatedRadius);

        double calculatedSquareSide = Math.pow(squareArea, 0.5);
               out.println( "SqSide calculated = " + calculatedSquareSide);

        double calculatedSquareDiagonal = Math.pow((2 * Math.pow(calculatedSquareSide, 2)), 0.5);
        out.println( "Calc_Square_diagonal calculated = " + calculatedSquareDiagonal);


        // Уместится ли круг к квадрате?
        if ((calculatedRadius * 2) <= calculatedSquareSide) {
            out.println("The Circle can be located inside the Square");
        } else out.println("The Circle can not be located inside the Square");


        // уместится ли квадрат в круге?
        if ((calculatedRadius * 2) >= calculatedSquareDiagonal) {
            out.println("The Square can be located inside the Circle");
        } else out.println("The Square can not be located inside the Circle");

    }

    static double calculateSquareSize(double squareSide)
    {
        return Math.pow(squareSide, 2);
    }

    static double calculateCircleSize(double circleRadius)
    {
        return PI * Math.pow(circleRadius, 2);
    }

}
