package sorular;

import java.util.Scanner;

public class soru01 {
    public static void main(String[] args) {
        /*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */


        Scanner input = new Scanner(System.in);

        System.out.println("Taksimetre Tutarını Hesaplama");
        double toplamTutar = 0, mesafe = 0, km = 2.2, ilkTutar = 10;

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextDouble();

        toplamTutar = ilkTutar + mesafe * km;
        toplamTutar = (toplamTutar < 20) ? 20 : toplamTutar;
        System.out.format("Toplam Tutar: %.2f TL\n", toplamTutar);

    }
}
