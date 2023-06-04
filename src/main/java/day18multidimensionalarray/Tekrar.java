package day18multidimensionalarray;

public class Tekrar {
    public static void main(String[] args) {
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        // Ornek : Yukaridaki students Array inde icinde "m" olan isimleri console a yazdiriniz

        for ( String[] w: students) {

            for (String k :w ){
                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }




        }

    }
