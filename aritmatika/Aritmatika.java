/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aritmatika;

import java.util.Scanner;


public class Aritmatika {
    double a;
    double b;

    public double pertambahan(){
        double tambah;
        tambah = this.a + this.b;
        return tambah;
    }
    
    public double pengurangan(){
        double kurang;
        kurang = this.a - this.b;
        return kurang;
    }
    
    public double perkalian(){
        double kali;
        kali = this.a * this.b;
        return kali;
    }
    
    public double pembagian(){
        double bagi;
        bagi = this.a / this.b;
        return bagi;
    }
    
    public double modulus(){
        double modul;
        modul = this.a % this.b;
        return modul;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aritmatika kalkulator = new Aritmatika();
        System.out.print("Masukkan angka 1: ");
        kalkulator.a = scanner.nextDouble();
        System.out.print("Masukkan angka 2: ");
        kalkulator.b = scanner.nextDouble();
        
        System.out.println("penjumlahan dari "+kalkulator.a+" + "+kalkulator.b+" adalah "+kalkulator.pertambahan());
        System.out.println("pengurangan dari "+kalkulator.a+" - "+kalkulator.b+" adalah "+kalkulator.pengurangan());
        System.out.println("perkalian dari "+kalkulator.a+" * "+kalkulator.b+" adalah "+kalkulator.perkalian());
        System.out.println("pembagian dari "+kalkulator.a+" / "+kalkulator.b+" adalah "+kalkulator.pembagian());
        System.out.println("modulus dari "+kalkulator.a+" % "+kalkulator.b+" adalah "+kalkulator.modulus());
    }
 
}
