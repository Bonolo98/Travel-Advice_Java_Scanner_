package Loops.WhileLoop;

public class WeekCounter {

    public static void main(String[] args) throws InterruptedException {
        int days = 1;

        while (days <= 7) {
            System.out.println("Day " + days);
            days++;
            Thread.sleep(1000);

            int hour = 1;
            while (hour <= 24) {
                System.out.println("Hour: " + hour);
                hour++;
                Thread.sleep(1000);
            }
        }
    }

}
