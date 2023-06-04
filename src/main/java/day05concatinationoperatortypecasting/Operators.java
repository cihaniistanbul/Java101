package day05concatinationoperatortypecasting;

public class Operators {

    /*
    1) +,-,*,/ islemleri java da matematikte kullanildigi gibi kullanilir
    Note 1: int / int --> int olur
    Note 2: double + int --> double olur.
    Cunku; Java da matematiksel islemlerde farkli data type lari kullanilirsa sonuc her zaman
    buyuk data type inda olur.


    2)Java da logical operator" lar vardir AND ve OR islemleri "logical operator"laridir.
       i)AND (&&) isleminden true alabilmek icin her sey true olmalidir
         AND islemi "perfectionist"tir
         AND isleminde bir tane bile false sonucu false yapar

       ii)OR (||) isleminde bir tane true sonucu true yapmaya yeter
          OR islemiinde sonucun false olmasi icin her sey false olmalidir
          Or islemi "polyanna" gibidir

       iii)NOT operator (!) true olani false, false olani true yapar.
           !true -->false
           !false -->true
           !!true -->true



    3)Comparison (Karsilastirma) Operators

      > , < <=, >= , == ,!=

      Note: Karsilastirma operators lerini kullandiginizda KESİNLİKLE boolean (true veya false)
            alirsiniz

      Note: Biz AND islemi icin && kullaniriz  & kullanimda gecerlidir
            Farklari nedir?
            "&&" kullanim ilk ifade false oldugunda digerlerini kontrol etmez, dolayisiyle
            hizli calisir. Cunku and isleminde ilk ifade false ise digerlerinin ne oldugunun
            onemi yoktur sonuc false olur
            "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyle yavas
            calisir.
            Biz bu yuzden hep "&&" kullaniriz§

              */

    public static void main(String[] args) {
        boolean first = 3<5;
        boolean second = 2+3!=5;
        boolean third = 2+3*5>=19;
        System.out.println(first+"-" +second+ "-" +third);//true-false-false
        System.out.println(first && second);//false
        System.out.println(first || second || third); //true








    }
}
