package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        //Verilen bir String i ters ceviren kodu yaziniz     -->interview sorusu
        // "Java" --> "avaJ"



        //1.yol
        String t = "Java";                                                 //     Ne zaman ki yeni bir data elde edeceksek bunun icin yeni bir kap olustururuz.
        String ters = "";                                                  //--> Burada zaten String kabimiz var. 1 tane ters kabi olusturucam.


                                                                           // *Nereden baslayacak *hangi sartlar icin calismaya devam etsin --> for loop
        for ( int i = t.length()-1  ; i>=0   ;i--    ){                    // (t) stringi (Java) icinden ters kabina datayi sondan alip koyacagim.Tersten yazmami istiyor


            ters= ters+t.substring(i,i+1);                                // Simdi tek tek gidip t sepetiindeki characterleri alip ters sepetine koyucam.
                                                                          // t.substring(i,i+1) ile son characteri aliriz cunku baslangic noktasina length()-1 demistik.
                                                                          // Sondaki a yi aldim bunu ters sepetine concatenation yapicam. Ters sepetinde hiclik vardi
                                                                          // a yi hiclige ekledim. Daha sonra ters kutusuna koydum. Bu islem hepsi icin tek tek calisacak
        }
        System.out.println(ters);                                         // sout u {} for body icine yazdirirsam adimlari tek tek gosterir.




        //2.yol charAt() yontemi

        String u ="Java";                                                // Ayni mantik. Tersten baslayarak a, v, a, J i sagdan sola dogru alarak,
        String ters2 = "";                                               // soldan saga dogru yerlestiricem.


        for(int i = u.length()-1 ; i>=0 ; i-- ){

            ters2 = ters2 + u.charAt(i);                                 // substring ve charAt ayni islemi yapiyor.Her ikisinde de index girerek String in belli bir
                                                                        //  kismini aliyoruz. Sonra ters2 sepetiyle concatenation yapip ters2 sepetine aticaz
        }                                                               //  Eger "ters2 + u.charAt(i)" ters2 sepetine eklemezsem loop defalarca calisir ama en son
                                                                        //  ne atadiysaniz onu gorursunuz. ters2 kavanozunda biriktirme yapamazsiniz bu durumda
        System.out.println(ters2);



        //Ornek 2: Size verilen bir String in "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        //  nalan, ey edip adanada pide ye, 404

        //Logic : String i ters cevir duz hali ile ters halini karsilastir, ayni ise "Palindrome"

        String duz = "ey edip adanada pide ye";
        String ters3="";

        for (int i = duz.length()-1 ; i>=0 ; i--){
            ters3 = ters3+duz.substring(i,i+1);

        }
        if(duz.equals(ters3)){                                            // 2 senaryom oldugu icin if else kullanirim.
            System.out.println("Palindrome dur");

        }else{
            System.out.println("Palindrome degildir");

        }


    }
}
