import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        for (int stopper = 0; stopper < 3; stopper++) { //Kullanıcı maksimum işlem sayısı ile sınırlandırıldı.

            try {

                Scanner scan = new Scanner(System.in);
                System.out.print("Ilk sayiyi giriniz: ");
                int sayi1 = scan.nextInt();
                System.out.print("Ikinci sayiyi giriniz: ");
                int sayi2 = scan.nextInt();

                System.out.println("Yapmak istediginiz islemi bir sayi ile soyler misiniz? :)");
                System.out.println("1. TOPLAMA");
                System.out.println("2. CIKARMA");
                System.out.println("3. CARPMA");
                System.out.println("4. BOLME");

                System.out.print("Secimininizi giriniz: ");
                int secim = scan.nextInt();

                if (secim == 1) {
                    System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
                } else if (secim == 2) {
                    System.out.println("Cıkarma isleminin sonucu = " + (sayi1 - sayi2));
                } else if (secim == 3) {
                    System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
                } else if (secim == 4) {
                    System.out.println("Bolme isleminin sonucu = " + (float) sayi1 / sayi2);
                } else {
                    System.out.println("Yanlıs secim yaptınız. Seciminizi kontrol ediniz.");
                }
            }
            //CATCH KISMINI BURAYA YAZACAĞIM.
            catch (Exception ali) {
                System.out.println("Gecerli bir tam sayi girmediniz...");
            }
        }
        System.out.println("Allahin hakki 3'tur.");
    }
}



