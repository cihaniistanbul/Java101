package day13loops;

public class Loops03 {
    public static void main(String[] args) {

        //Ornek: Verilen bir String de kucuk harfleri console a yazmayiniz
        //   "Pwd12?Ab" --> P12?A

        String s = "Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {                            // String in ilk index inden son index ine kadar gitmem lazim. Baslangic indexine 0 verdim
                                                                          // Loop un String sepetindeki character sayisi kadar calismasi lazim / loop condition
            char ch = s.charAt(i);                                        // Dongude 1 kere gitsin diye ch sepetine koyduk. Her iteration icin charAt() ile characterlerimizi ch sepetine koyalim

            if(ch>='a' && ch<='z'){                                       // Kucuk harfle karsilastigim zaman onu ignore etmeliyim
                continue;                                                 // continue loop calismaya devam etsin demek. Bunu gorur gormez increment parta geri gelecek
            }else{
                System.out.println(ch);
            }
        }


        //NOTE: Break ile continue arasindaki fark nedir?
        //      "break" ile switch parantezinin disina cikmak icin ve loop u kirmak icin kullanilir
        //      "continue" ise loop yaparken bazi istenen elemanlari isleme sokmamak icin kullanilir
        //      "continue" keyword u bir loop taki gecerli iteration i sonlandirip sizi increment/decrement parta goturur

    }
}
