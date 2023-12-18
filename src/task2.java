import java.util.Random;
import java.util.Scanner;

//Необходимо написать программу, которая проверяет пользователя на знание таблицы умножения.
//Программа генерирует два целых однозначных числа. Программа задаёт вопрос:
//результат умножения первого числа на второе?
//Пользователь должен ввести ответ и увидеть на экране правильно он ответил или нет.
//Если пользователь ответил неправильно, то программа должна показать правильный ответ.

public class task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        int num1 = rnd.nextInt(1, 10);
        int num2 = rnd.nextInt(1, 10);
        System.out.printf("%s * %s = ", num1, num2);
        int result = scn.nextInt();
        if (result != (num1 * num2)){
            System.out.println("Oops! You have a mistake! Try again!");
            System.out.printf("Correct answer is %s", (num1 * num2));
        } else {
            System.out.printf("Excellent! It`s really %s", result);
        }
    }
}
