package SelfStudy;

import java.util.Scanner;

public class MayinTarlasiMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, column;

        System.out.println(" Mayin Tarlasi Oyunuma Hosgeldiniz!!!");
        System.out.println("Oyun icin boyutlari giriniz!!!");
        System.out.println("Satir Sayisi: ");
       row = scan.nextInt();
       System.out.println("Sutun Sayisi");
       column=scan.nextInt();

        MayinTarlasi mayin = new MayinTarlasi(row,column);
        mayin.run();




    }
}
