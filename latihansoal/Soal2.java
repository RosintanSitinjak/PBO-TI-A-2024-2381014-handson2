package latihansoal;

import java.util.Scanner;

public class Soal2 {
    // mencari nilai maksimum dari 3 bilangan

    public static void main(String[] args) {
        int[] bil = new int[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < bil.length; i++) {
            System.out.println("Masukan Bilangan ke - " + (i + 1) + " : ");
            bil[i] = input.nextInt();
        }

        int largestNumber = bil[0];
        for (int i = 1; i < bil.length; i++) {
            if (largestNumber < bil[i]) {
                largestNumber = bil[i];
            }
        }
        System.out.println(largestNumber);

//        input.close();
    }
}
