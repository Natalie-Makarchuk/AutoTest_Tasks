package Task_05;

/* Написать программу принимающую на вход с клавиатуры список задач на день с приоритетами и сложностью.
Приоритет может быть Высокий, Средний и Низкий.
Сложность может быть Сложная, Средняя и Легкая.
Время выполнения сложной задачи - 4 часов, средней задачи - 2 часа, легкой задачи - 1 час.

Вывести на печать:
- сколько всего времени нужно для выполнения всех задач
- список задач заданного приоритета (приоритет ввести с клавиатуры)
- какие задачи возможно сделать за N дней с учетом приоритета (N ввести с клавиатуры) */

import java.util.Scanner;
import static java.lang.System.*;

public class TasksList {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int tasksAmount = 0;
        out.print("Enter amount of the tasks:");
        tasksAmount = reader.nextInt();


        Task[] tasks = new Task[tasksAmount];

        for (int i = 0; i <= tasksAmount - 1; i++) {

            out.println("Enter the task name");
            String taskName = reader.next();

            out.print("Enter the task #" + i + " and define the priority: High: 1, Medium: 2, Low: 1 " + "\n");
            int currentPriority = reader.nextInt();

            out.print("Enter the task #" + i + " complexity: ComplexTask: 4, MediumTask: 2, EasyTask: 1" + "\n");
            int currentComplexity = reader.nextInt();

            tasks[i] = new Task(taskName, currentPriority, currentComplexity);
        }


//        // Сумма врeмени для выполнения всех задач

        int sumComplexityHours = 0;
        for (int i = 0; i <= tasksAmount - 1; i++) {

            Complexity currentTaskComplexity = tasks[i].getComplexity();
            sumComplexityHours = sumComplexityHours + currentTaskComplexity.ordinal();
        }
        out.println("Sum of hours for all tasks is " + sumComplexityHours);


        //  Cписок задач заданного приоритета (приоритет ввести с клавиатуры)

        /*out.print("Set the priority for the tasks to be shown" + "\n");
        int definedPriority = reader.nextInt();

        for (int i = 0; i <= tasksAmount - 1; i++) {

            if (definedPriority == (int) tasks[i].getComplexity() )
               {
                out.println(tasks[i].getTaskName());
               }
        }*/

//        // какие задачи возможно сделать за N дней с учетом приоритета (N ввести с клавиатуры)
//
//        out.print("Set the amount of available days" + "\n");
//        int daysAvailable = reader.nextInt();
//
//        int timeAvailable = daysAvailable * 8;
//
//        while ()
//

    }

    }
