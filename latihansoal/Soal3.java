package latihansoal;

import java.util.Scanner;

public class Soal3 {
    // kalkulator sederhana

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aplikasi Kalkulator Sederhana");
        System.out.println("Pilihlah operasi yang kamu inginkan: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.println("Masukan pilihan operasi (No. 1-4): ");
        int select = input.nextInt();

        System.out.println("Masukan bilangan pertama: ");
        int num1 = input.nextInt();

        System.out.println("Masukan bilangan kedua: ");
        int num2 = input.nextInt();

        int result = 0;

        switch (select) {
            case 1:
                result = num1 + num2;
                System.out.println("Hasil dari penjumlahan = " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Hasil dari pengurangan = " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Hasil dari perkalian = " + result);
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Hasil dari pembagian = " + result);
                } else {
                    System.out.println("Terjadi Kesalahan!! pembagian dengan nol tidak diperbolehkan");
                }
                break;
            default:
                System.out.println("Pilihan tidak ada!");
        }
        input.close();
    }
}
