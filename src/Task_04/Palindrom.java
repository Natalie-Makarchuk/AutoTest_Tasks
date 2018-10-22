package Task_04;

/* Указать с клавиатуры произвольное слово. Вывести является ли это слово палиндромом(да/нет),
т.е. дает то же самое слово при переставлении букв в обратном порядке.
Пример: шалаш - полиндром, чашка - не полиндром
*/

import java.util.Scanner;
import static java.lang.System.*;

public class Palindrom {
    public static void main(String[] args) {

        boolean isPalindrome = false;

        Scanner reader = new Scanner(System.in);
        out.print("Enter a word:");
        String enteredWord = reader.next();

        int z = enteredWord.length();
        for (int i = 0; i <= enteredWord.length()/2; i++) {
            if (enteredWord.charAt(i) == enteredWord.charAt(--z)) {
                isPalindrome = true;
            }
        }
        /*
        return str.equals(new StringBuilder(str)
                .reverse()
                .toString()
        );*/

        if (isPalindrome) {
            out.print("Yahooo - palindrome");
        } else {
            out.print("Nope - not palindrome");
        }
    }
}

