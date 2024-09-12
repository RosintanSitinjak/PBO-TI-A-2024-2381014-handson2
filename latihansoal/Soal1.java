package latihansoal;

import java.util.Scanner;

public class Soal1 {
    // mencari nilai maksimum dari 2 bilangan

    public static void main(String[] args) {
        int[] number = new int[2];
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Bilangan Pertama: ");
        number[0] = input.nextInt();

        System.out.println("Masukan Bilangan Kedua: ");
        number[1] = input.nextInt();

        if (number[1] > number[0]) {
            System.out.println(number[1]);
        } else {
            System.out.println(number[0]);
        }
    }
}
