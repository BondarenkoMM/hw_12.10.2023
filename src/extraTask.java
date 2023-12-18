import java.util.Scanner;

public class extraTask {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of the week day: ");
        int weekDayNum = scn.nextInt();
        String result = (
                weekDayNum == 7 ? "It`s sunday" :
                        (weekDayNum == 6 ? "It`s saturday" :
                                (weekDayNum == 5 ? "It`s fridaay daaay, it`s saturday sunday - WHAT?!" :
                                        weekDayNum == 4 ? "It`s thursday" :
                                                weekDayNum == 3 ? "It`s wednesday" :
                                                        weekDayNum == 2 ? "It`s tuesday" :
                                                                weekDayNum == 1 ? "It`s monday" : "Oops! There is no such day in the week!"))
                );
        System.out.println(result);
        /* Насколько помню не совсем правильно писать столько вложений,
        но так как тернарными операторами владею намного хуже чем if`ом, как оказалось, решил выполнить задание так*/
    }
}
