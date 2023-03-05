/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;

import java.util.Scanner;

public class Kalkulator {
    private String kalkulator;
    private double hasil;

    public Kalkulator(String kalkulator) {
        this.kalkulator = kalkulator;
    }

    public double hitung() {
        String[] angka = kalkulator.split("[+\\-*/]");
        String[] operasi = kalkulator.split("[0-9]+");

        hasil = Double.parseDouble(angka[0]);
        int i = 1;

        while (i < angka.length) {
            double num = Double.parseDouble(angka[i]);

            switch (operasi[i]) {
                case "*" -> hasil *= num;
                case "/" -> hasil /= num;
                case "+" -> hasil += num;
                case "-" -> hasil -= num;
            }
            i++;
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan operasi hitung: ");
        String kalkulator = input.nextLine();

        Kalkulator k = new Kalkulator(kalkulator);
        double result = k.hitung();
        System.out.println("Hasil: " + result);
    }
}

