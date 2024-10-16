 package com.company;

import java.util.Scanner;

public class Main {
    private static Card[][] kartlar = new Card[4][4];
    public static void main(String[] args)
    {
        kartlar[0][0] = new Card('E');
        kartlar[0][1] = new Card('A');
        kartlar[0][2] = new Card('B');
        kartlar[0][3] = new Card('F');
        kartlar[1][0] = new Card('G');
        kartlar[1][1] = new Card('A');
        kartlar[1][2] = new Card('D');
        kartlar[1][3] = new Card('H');
        kartlar[2][0] = new Card('F');
        kartlar[2][1] = new Card('C');
        kartlar[2][2] = new Card('D');
        kartlar[2][3] = new Card('H');
        kartlar[3][0] = new Card('E');
        kartlar[3][1] = new Card('G');
        kartlar[3][2] = new Card('B');
        kartlar[3][3] = new Card('C');
        while( oyunBittimi() == false)
        {
            oyunTahtasi();
            tahminEt();

        }
        oyunTahtasi();
        System.out.println("Tebrikler oyun bitti");

    }

    public static void oyunTahtasi()
    {
        for(int i = 0 ; i < 4 ; i++)
        {
            System.out.println("___________________");
            for(int j = 0 ; j < 4 ; j++)
            {
                if(kartlar[i][j].isTahmin())
                {
                    System.out.print(" |"+kartlar[i][j].getKarakter()+ "|");

                }
                else{
                    System.out.print(" | | ");

                }
            }
            System.out.println("");
        }
        System.out.println("-------------------");
    }
    public static boolean oyunBittimi()
    {
        for(int i = 0 ; i < 4 ;i++)
        {
            for(int j = 0 ; j < 4 ; j++)
            {
                if(kartlar[i][j].isTahmin() == false )
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void tahminEt()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci tahmin ( i ve j değerlerini boşluk bırakarak giriniz) : ");
        int i1= scanner.nextInt();
        int j1 = scanner.nextInt();

        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();
        System.out.print("İkinci tahmin(i ve j değerlerini boşluk bırakarak giriniz) : ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        if(kartlar[i1][j1].getKarakter() == kartlar[i2][j2].getKarakter())
        {
            System.out.println("Tebrikler doğru tahmin");
            kartlar[i2][j2].setTahmin(true);
        }
        else{
            System.out.println("Yanlış tahmin :(");
            kartlar[i1][j1].setTahmin(false);
        }
    }
}