package Loops.ForLoop;

import java.util.Scanner;

public class NewYearCountDown {

    public static void main(String a[]) throws InterruptedException {

        String startCount;
        int start;

        Scanner scan = new Scanner(System.in);

        System.out.println("Start New Year Count Down?: Yes or No");
        startCount = scan.next();
        startCount.toLowerCase();

        System.out.println("How Many Seconds To Count Down From?");
        start = scan.nextInt();

        if (startCount.contains("yes") || startCount.contains("yeah") || startCount.contains("yah")
                || startCount.contains("ya")) {

            for (int i = start; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);

            }

            System.out.println("Happy New Year!!!");

        } else {
            System.out.println("Maybe Next Time");
        }

        scan.close();

    }

}
