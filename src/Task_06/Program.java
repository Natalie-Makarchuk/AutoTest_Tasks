package Task_06;

/* В качестве элементов гирлянды использовать класс Лампочка и Цветная Лампочка.
        Цветная лампочка имеет цвет который может быть красным, желтым, синим или зеленым.
        Для цветной лампочки должно быть возможно установить цвет с помощью типа Цвет, и получить цвет в виде строки
        Для цветной гирлянды при создании установить цвет лампочки в зависимости от кратности порядкового номера
        (1 - красная, 2 - желтая, 3 - зеленая, 4 - синяя, 5 - красная, и тд.)
        Количество лампочек гирлянды задается пользователем.

        Состояние лампочки(вкл-выкл) вычисляется от ее порядкового номера в гирлянде и текущей минуты времени.
        В случае если текущая минута четная - горят только лампочки с четным номером в гирлянде.
        В случае если текущая минута нечетная - горят лампочки с нечетным номером.

        Для обоих гирлянд создать метод выводящий на печать текущее состояние лампочек(включена-выключена)
        и цвет в случае цветной гирлянды.

        Вывести на консоль текущее состояние обоих гирлянд.    */

import java.util.Scanner;
import static java.lang.System.*;

public class Program {
    public static void main(String[] args) {

// Количество лампочек гирлянды задается пользователем

        Scanner reader = new Scanner(System.in);

        int bulbsNumberSimpleGarland = 0;
        out.print("Enter amount of the bulbs for Simple Garland:");
        bulbsNumberSimpleGarland = reader.nextInt();

        int bulbsNumberColourGarland = 0;
        out.print("Enter amount of the bulbs for Colour Garland:");
        bulbsNumberColourGarland = reader.nextInt();


    }

}
