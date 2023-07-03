package day16arraysforeachloop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {

        /*




        String stdNames[] = new String[5];

        stdNames[2] = "Benna";
        stdNames[3] = "Abdullah";
        stdNames[4] = "Recep";
        stdNames[0] = "Ekim";
        stdNames[1] = "Busra";

        System.out.println(Arrays.toString(stdNames));

        //Ornek 1: Arraydeki her elemanin sonuna "!" isareti koyarak ekrana yazdiriniz

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "!");

        }

        //Ornek 1 : String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin icerdigi character sayilari
        //          toplamini ekrana yazdirin


        String arr[] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println((arr[0].length() + arr[arr.length - 1].length()));



        // Ornek 2 : String bir array olusturun, icine 5 tane eleman ekleyin, tum elemanlarim icerdigi character sayisi
        //           toplamini ekrana yazdiriniz


        String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "Adana";
        brr[2] = "Newyork";
        brr[3] = "Canada";
        brr[4] = "Van";

        System.out.println(Arrays.toString(brr));

        int totalChar = 0;
        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar + brr[i].length();


        }

        System.out.println(totalChar);


        //2.yol

        int sum = 0;
        for (String w : brr) {
            sum = sum + w.length();

        }
        System.out.println(sum);


        //Ornek 3: Notlar adinda Integer bir array olusturunuz icine 6 tane not yerlestiriniz ve not ortalamsini ekrana yazdiriniz

       int notes[]=new int[6];

        notes[0] = 50;
        notes[1] = 60;
        notes[2] = 70;
        notes[3] = 40;
        notes[4] = 90;
        notes[5] = 30;

        System.out.println(Arrays.toString(notes)); //[50, 60, 70, 40, 90, 30]


        int toplam=0;
        for ( int w : notes) {
            toplam =toplam+w;
        }
        System.out.println(toplam/notes.length);



        //Ornek 1 : Integer bir array olusturunuz, icine 6 tane eleman yerlestiriniz. Bu elemanlarin en kucugu ile
        //          en buyugu toplamini ekrana yazdiriniz.


        int ages[] = new int[6];

        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=33;

        System.out.println(Arrays.toString(ages));  //[20, 23, 19, 44, 15, 33]

        Arrays.sort(ages);

        System.out.println(ages[0] + ages[ages.length - 1]);


        //Ornek 2: String bir array olusturunuz 6 eleman ekleyiniz, yellow dan onceki elemanlari yazdiriniz

        String colors[] = new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        System.out.println(Arrays.toString(colors));

        for ( String w : colors) {
            if (w.equals("Yellow")){
                break;
            }
            System.out.println(w);
        }



        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages));// [20, 23, 19, 44, 15, 32]

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages)); //[15, 19, 20, 23, 32, 44]


        System.out.println((ages[0] + ages[ages.length - 1]));
*/


        // +, -, /, % islemlerini yapabilen bir hesap makinesi yapiniz
        //Kullanici "q" ya basmadigi surece islem secip yapabilsin

        /*
        1) Kullanicidan data almak icin Scanner object olustur
        2) Kullanicidan yapacagi islemi almaliyiz
        3) Kullanicidan 2 tane sayi almaliyiz
        4) Tekrar tekrar islem yapabilmek icin loop kullanmaliyiz
         */

        Scanner scan = new Scanner(System.in);
        char opr = ' ';

        do {

            System.out.println("yapmak istediginiz islemi secin : +, -, *, /, %");
            opr = scan.next().toLowerCase().charAt(0);


            System.out.println("Enter the first number");
            int n1 = scan.nextInt();

            System.out.println("Enter the second number");
            int n2 = scan.nextInt();


            switch (opr) {
                case '+':
                    System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
                    break;
                case '-':
                    System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
                    break;

                case '*':
                    System.out.println(n1 + "x" + n2 + "=" + (n1 * n2));
                    break;
                case '/':
                    System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
                    break;
                case '%':
                    System.out.println(n1 + "%" + n2 + "=" + (n1 * n2) / 100);
                    break;
            }


        } while (true);


    }


}

