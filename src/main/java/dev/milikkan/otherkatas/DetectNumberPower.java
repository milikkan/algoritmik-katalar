package dev.milikkan.otherkatas;

public class DetectNumberPower {
    public static void main(String[] args) {
        // log(3, 27) -> log(e, 27) / log(e, 3)
        // log(taban, sayı) -> log(e, sayı) / log(e, taban)

        int taban = 3;
        int sayi = 81;


        long start = System.nanoTime();
        isPowerOfUsingLoop(sayi, taban);
        long elapsed = System.nanoTime() - start;

        System.out.println("Loop time: " + elapsed);

        start = System.nanoTime();
        isPowerOfUsingLog(81, 3);
        elapsed = System.nanoTime() - start;

        System.out.println("Log time: " + elapsed);
    }

    private static boolean isPowerOfUsingLog(int num, int pow) {
        double result = Math.log(num) / Math.log(pow);
        return Math.floor(result) == result;
    }

    private static boolean isPowerOfUsingLoop(int num, int pow) {
        int result = 1;
        while (result <= num) {
            result = result * pow;
            if (result == num) return true;
        }
        return false;
    }
}
