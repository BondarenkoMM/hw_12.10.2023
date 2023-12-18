import java.util.Random;

//task 1
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//Числа могут быть, как целочисленные, так и дробные.

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        double m = rnd.nextDouble(0, 21);
        double n = rnd.nextDouble(0, 21);
        double m1 = m;
        double n1 = n;
        System.out.printf("There is a two random numbers: %s and %s\n", m, n);
        m = (m < 10 ? (10 - m) : (m - 10));
        n = (n < 10 ? (10 - n) : (n - 10));
        System.out.printf("1.    %s\n2.    %s\n", m, n);
        System.out.print("The number closest to 10 is ");
        System.out.println(m < n ? m1 : n1);

        /*Признаться честно, эта задачка заставила меня сильно подумать,
        возможно в силу усталости, но решал я её сильно дольше чем решал вре предыдущие задания.
        Если есть вариант решения этой задачи который намного
        проще моего - буду благодарен если пришлёте его в дискорд:)*/
    }
}