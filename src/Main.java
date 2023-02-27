import java.util.Scanner;

public class Main {


    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz :");
        int b_sayi=scan.nextInt();
        System.out.print("2.sayıyı giriniz :");
        int i_sayi=scan.nextInt();

        int modhesabi=b_sayi%i_sayi;
        System.out.println(b_sayi+" sayısının "+i_sayi+" sayısına göre modu:"+modhesabi);
    }


    static void alanvecevre(){
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Uzun kenarı giriniz :");
            int uzun = scan.nextInt();
            System.out.print("Kısa kenarı giriniz:");
            int kisa = scan.nextInt();

            if (uzun != 0 && kisa != 0) {
                System.out.println("Dikdörtgenin çevresi:" + (2 * (uzun + kisa)));
                System.out.println("Dikdörtgenin alanı:" + (kisa * uzun));
                break;


            }
            else {
                System.out.println("Geçersiz giriş.");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                case 8:
                    alanvecevre();
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}







    //videodaki kodlar
/**
    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam:"+result);
        return result;
    }

    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma:"+result);
        return result;
    }

    static int times(int a,int b){
        int result=a*b;
        System.out.println("Çarpım:"+result);
        return result;
    }

    static int divided(int a,int b){
        if (b==0)
            return 0;
        int result=a/b;
        System.out.println("Bölüm:"+result);
        return result;
    }

    static int power(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }

    static int mod(int a,int b){

        return a%b;
    }

    static void calc(int a,int b){
        System.out.println("çevresi:"+(2*(a+b)));
        System.out.println("Alanı:"+(a*b));
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int select;

        String menu= "1.Toplama işlemi\n"
                +"2.Çıkarma işlemi\n"
                +"3.Çarpma işlemi\n"
                +"4.Bölme işlemi\n"
                +"5.Üslü sayı hesaplama\n"
                +"6.Mod alma\n"
                +"7.Dikdortgen lan ve hesabı\n"
                +"0.Çıkış yap\n";


        while (true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz:");
            select=input.nextInt();

            if (select==0) {
                break;
            }

            System.out.print("1.Sayı:");
            int a=input.nextInt();
            System.out.print("2.Sayı:");
            int b=input.nextInt();

            switch (select){
                case 1:
                   sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if (divided(a,b)==0){
                        System.out.println("İkinci sayı sıfırdan farklı olmalı.");
                    }
                case 5:
                    System.out.println("üs hesabı:"+power(a,b));
                    break;
                case 6:
                    System.out.println("Mod hesabı:"mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz işlem");

            }

        }
*/


