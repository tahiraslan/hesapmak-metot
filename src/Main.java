import java.awt.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        char topla = '+', cikart = '-', carp = '*', bol = '/';

        int sayi1, sayi2;
        Scanner gelendeger = new Scanner(System.in);

        System.out.print("Birinci Sayiyi giriniz: ");
        sayi1 = gelendeger.nextInt();

        System.out.print("ikinci Sayiyi giriniz: ");
        sayi2 = gelendeger.nextInt();

        System.out.print("islemi giriniz +-*/: ");
        String islem = gelendeger.next();

        hesaplama(sayi1, sayi2, islem);

    }

    public static void hesaplama(int sayi1, int sayi2, String islem) {
        double sonuc;
        switch (islem) {
            case "+":
                sonuc = (sayi1 + sayi2);
                System.out.println(sonuc);
                break;
            case "-":
                sonuc = (sayi1 - sayi2);
                System.out.println(sonuc);
                break;
            case "*":
                sonuc = (sayi1 * sayi2);
                System.out.println(sonuc);
                break;
            case "/":
                sonuc = (sayi1 * sayi2);
                System.out.println(sonuc);
                break;

            default:
                System.out.println("Deger tanimlanmadi");
                break;

        }
    }
}