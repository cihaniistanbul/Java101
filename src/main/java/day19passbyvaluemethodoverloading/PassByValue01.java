package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {

        //Note: Java "pass by value" sayesinde variable'larin orijinal degerlerini korur
        int shirtPrice=100;


        //java methoda gonderirken orjinal degeri degil, kopyasinin gonderir ve degisen deger kopya deger olur
        System.out.println(discount("student", shirtPrice));//90
        System.out.println(discount("veteran", shirtPrice));//80
        System.out.println(discount("senior", shirtPrice));//95


        //normalde indirim yaptik discount methodu ile ama buradaki deger hala orijinal
        System.out.println(shirtPrice);

        shirtPrice= discount("veteran", shirtPrice);
        System.out.println("shirtPrice kampanya fiyati: " + shirtPrice);

    }

    //Discount Methodunu olusturalim
    public static int discount(String type, int price){
        switch (type){
            case "student" :
                price=price-10;
                break;

            case "veteran" :
                price=price-20;
                break;

            case "senior" :
                price=price-5;
                break;
            default:
                price=price;

        }
        return price;

    }

    /*
     Pass Bu Value
    1) Java "pass by value" kullanir
    2) Yani; java methodlarin orijinal degeri degistirmesine musade etmez
    3) Java methodlara deger yollarken orijinal degerin kopyasini olusturur ve o kopyayi methoda yollar
       Method kopya deger uzerinde degisiklik yapar
    4) Java esnek bir dildir, istersek yazdigimiz kod ile orijinal degerin degismesini de temin edebiliriz
       Bkz: line 19

     Pass By Reference
    1) Pass by Reference da methoda reference yollanir
    2) Reference adres demektir. Adress yollaninca method adresi kullanarak orijinal degere ulasilir ve orijinal degeri degistir
       Bu yuzden "C#" gibi Pass by Reference kullanan dillerde method variable in orijinal degerini degistirir

     */


}
