package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive     : char -      boolean - byte - short - int -   long - float - double
        //Wrapper Class : Character - Boolean - Byte - Short - Integer- Long -Float - Double


        //n yazip nokta koyarsaniz eger hic method goremezsiniz, cunku primitive ler method icermez
        int n = 12;

        //m yazip nokta koyarsaniz bircok method gorursunuz, cunku wrapper classlar method icerir
        Integer m = 12;

        //Wrapper class lar non-primitive dir. O yuzden memory de cok yer kaplar
        //O yuzden sart degilse Wrapper class kullanmayi tercih etmeyiz


        byte p = 13;
        Byte r = 13;


        //Ornek 1: short data type inin min ve max degerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);


        //Ornek2: int data type inin minimum degeri ile byte data type inin
        //maximum degerleri toplamini bulunuz

        int intMin= Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);

        //Ornek3: Primitive int i Wrapper Integer a ceviriniz(AutoBoxing)
        int num =19;
        Integer wrapperNum= num;

        //Ornek4: Wrapper Byte i primitive byte a ceviriniz(Unboxing)
        Byte k = 19;
        byte primitiveK=k;



        //Ornek5: Primitive char i Wrapper Character e ceviriniz//AutoBoxing
       char initial= 'T';
       Character initialWrapper=initial;

       //Ornek6: Wrapper Boolen i primitive boolean a ceviriniz//UnBoxing
        Boolean isOldWrapper=true;
        boolean isOld = isOldWrapper;


    }
}
