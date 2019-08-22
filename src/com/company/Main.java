package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int a;
        String data[]=new String [100];
        String baca[]=new String[100];

        int h;
        do {
        System.out.println("Aplicatiom Data ");
        System.out.println("1. Masukkan Data");
        System.out.println("2. Lihat dan Edit data ");
        System.out.println("3. Exit ");
        a=scan.nextInt();

            System.out.println("masukkan jumlah data kalian ");
            h = scan.nextInt();
            if (a == 1) {

                for (int i = 0; i < h; i++) {
                    System.out.println("masukkan nama " + i + 1);
                    data[i] = scan.next();
                    System.out.println("masukkan nim" + i + 1);


                }

            }
            if (a == 2) {
                for (int i = 0; i < h; i++) {
                    System.out.println(data[i]);
                    System.out.println(baca[i]);
                }
            }
            if(a==3) {
                System.out.println("terima kasih");
            }

        }while(a!=3);
    }
}
