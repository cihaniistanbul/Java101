package day12nestedternaryswitchloops;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
        1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
       */


        //ilk basta 100 e bolunup bolunmedigine, daha sonra 400e de bolunmeli ve 4 e bolunmeli

        //kullanicidan almis gibi year sepetine 1600 u koydum
        int year = 1600;
        // c ? T : F    --> ternary bundan ibaret
        // c ?  (c ? T : F ) : ( c ? T : F );

        String result = year % 100 == 0 ? (year % 400 == 0 ? "Leap" : "Not Leap") : (year % 4 == 0 ? "Leap" : "Not Leap");


    }
}
       /*
         -->Once sartlara karar vermeliyim. 2 sartim var. 100 bolunurse ve bolunemezse. 100 e bolunme sartini ben ilk
            condition a veriyorum --> c
            Eger 100 e bolunurse T kismi calisacak, bolunemezse F kismi.

          [1.sart]
                      c           ?           T               :              F
            100 e bolunme kurali  ?  bolurse calisacak kisim  :  bolunmezse calisacak kisim


          [2.sart]

              c       ?                T
          condition      400e bolunuyor mu bolunmuyor mu



          ----------

                         year % 100 == 0                 ?          year % 400 == 0           :             year % 4 == 0   ;
          (yilin 100 ile bolumundan kalan 0 a esit mi)        ( year sepetindeki sayinin            (year sepetindeki sayi 4 ile
           burasi condition. Eger true cikarsa bu defa         400 ile bolumundan kalan              bolumunden kalan 0 a esit
           400 e bolunmeyi kontrol edicem.Yani hemen           0 a esit mi) Eger true ise            ise Leap, degilse Not Leap)
           yanindaki parantez ici. Eger burasi false           "Leap" degilse "Not Leap"
           ise 2.parantez calisir









        */



