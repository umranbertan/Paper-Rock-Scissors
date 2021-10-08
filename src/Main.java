import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int user_point = 0; //Ekstar
        int comp_point = 0;
        int count=0;

        System.out.println("Taş kağıt makas oyununa hoş geldiniz!");
        System.out.println("1-Taş 2-Kağıt 3-Makas");
        System.out.print("Program kaç defa oynatılmalı: ");
        int n = s.nextInt();
        while (count!=n) { //Kullanıcının girmiş olduğu sayı kadar oyun oynasın.

            count++;
            System.out.println("Seçiminiz: ");
            int select = s.nextInt();
            int bil_secim = (int) (Math.random() * 3); //Math.random()*3 diyerek bilgisayara 0 ile 3 arasında bir rastgele sayı
            // ürettiriyoruz. Ve seçimimiz ile bilgisayarın seçimini karşılaştırıp sonuçlarını yazıyoruz.
            if (select == 1) {
                if (bil_secim == 1) {
                    System.out.println("Sizin seçiminiz: Taş");
                    System.out.println("Bilgisayarın seçimi: Taş Sonuç: Berabere");
                    System.out.println("Puanınız: " + user_point + " Bilgisayarın puanı:" + comp_point);
                } else if (bil_secim == 2) {
                    System.out.println("Sizin seçiminiz: Taş");
                    System.out.println("Bilgisayarın seçimi: Kağıt, Sonuç: Kaybettiniz, Kağıt tası sarar!");
                    comp_point++;
                    System.out.println("Puanınız: " + user_point + " Bilgisayarın puanı:" + comp_point);
                } else {
                    System.out.println("Sizin seçiminiz: Taş");
                    System.out.println("Bilgisayarın seçimi: Makas, Sonuç: Kazandınız, Taş makası kırar!!");
                    user_point++;
                    System.out.println("Puanınız: " + user_point + " Bilgisayarın puanı:" + comp_point);
                }
            } else if (select == 2) {
                if (bil_secim == 1) {
                    System.out.println("Sizin seçiminiz: Kağıt");
                    System.out.println("Bilgisayarın seçimi: Taş, Sonuç: Kazandınız, Kağıt taşı sarar!!");
                    user_point++;
                    System.out.println("Puanınız: " + user_point + " Bilgisayarın puanı:" + comp_point);
                } else if (bil_secim == 2) {
                    System.out.println("Sizin seçiminiz: Kağıt");
                    System.out.println("Bilgisayarın seçimi: Kağıt, Sonuç: Berabere");
                    System.out.println("Puanınız: " + user_point + " Bilgisayarın puanı:" + comp_point);
                } else {
                    System.out.println("Sizin seçiminiz: Kağıt");
                    System.out.println("Bilgisayarın seçimi: Makas, Sonuç: Kaybettiniz, Makas kağıdı keser.");
                    comp_point++;
                    System.out.println("Puanınız: " + user_point + " Bilgisayarın puanı:" + comp_point);
                }
            } else if (select == 3) {
                if (bil_secim == 1) {
                    System.out.println("Sizin seçiminiz: Makas");
                    System.out.println("Bilgisayarın seçimi: Taş, Sonuç: Kaybettiniz, Taş makası kırar!!");
                    comp_point++;
                    System.out.println("Puanınız: " + user_point + " Bilgisayarın puanı:" + comp_point);
                } else if (bil_secim == 2) {
                    System.out.println("Sizin seçiminiz: Makas");
                    System.out.println("Bilgisayarın seçimi: Kağıt, Sonuç: Kazandınız, Makas kağıdı keser!!");
                    user_point++;
                    System.out.println("Puanınız: " + user_point + " Bilgisayarın puanı:" + comp_point);
                } else {
                    System.out.println("Sizin seçiminiz: Makas");
                    System.out.println("Bilgisayarın seçimi: Makas, Sonuç: Berabere");
                    System.out.println("Puanınız: " + user_point + " Bilgisayarın puanı:" + comp_point);
                }
            } else {
                System.out.println("Hatalı giriş yaptınız - 1,2,3 rakamlarından birini seçiniz");
                continue;
            }
            if (user_point > comp_point) {   // Aldığımız puan bilgisayarın puanından yüksek ise kazandınız yazdırsın.
                System.out.println("Oyunu " + user_point + "-" + comp_point + " kazandınız");
                break;
            } else if (comp_point  > user_point) {  // Aldığımız puan bilgisayarın puanından düşük ise kaybettiniz yazdırsın.
                System.out.println("Oyunu " + comp_point + "-" + user_point + " kaybettiniz");
                break;
            }
        }
    }
}

