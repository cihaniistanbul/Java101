package day27abstraction;

public abstract class Courses {

    //Abstraction

    //math methodu olusturuyorum ve 6-7-8.siniflar icin override ediyorum
    //override yapinca hepsi math dersini aldi ama hicbirisi body'i kullanmadi(toplama)
    //madem kullanmiyorlar body kismini silerim.
    // public void math(){
    // System.out.println("Toplama"); }  --> burada sout kismini siliyorum ama bu sefer sikayet ediyor
    // Burada sadece body'i silerek abstract yapamiyorum, declare etmem lazim. public ve void arasina abstract yaziyorum
    //Hala sikayet ediyor. abstract class olusturdum ama hala somut bir class bu. Class'i da abstract yapmam lazim
    public abstract void math();  //math dersi zorunlu

    public void art(){
        System.out.println("Learn art");
    }
    //Art methodunun tek farki body'si var. Demek ki abstract bir class icinde body'si olan normal bir method olusturabiliyorum
    //Parent class'da Art methodunu kullaniyorum ve child classlardan tepki yok.Art burada secmeli ders.Istege bagli
    //Child classlarda istege bagli methodlari bu sekilde olusturabilirim.Child classlar ister kullansin ister kullanmasin



    /*
    1) Eger bir classtan object olusturulmasini istemiyorsak ve bu class'i child classlarin yapmak zorunda olduklari
       gorevleri  belirlemek icin kullaniyorsak "Abstraction" yapariz.
    2) Bazen parent class daki methodun body'si hicbir child class tarafindan kullanilmaz.
       Bu durumda parenttaki duruma body yazmak hic kullanilmadigi icin mantikli degildir. Bizde yazmayiz
    3) Body'si yazilmayan method Abstract Method denir.
       Abstract ingilizce de vücutsuz, soyut demektir.
    4) Methodun body'sini yazmayinca Java bize hata verdi,
       bizde abstract keyword'unu kullanarak Java'ya bu methodun body'si olmayacak deriz
    5) Abstract keyword'unu kullaninca elde ettigimiz abstract method normal classlara konulamaz.
       O yuzden class'ida abstract yapmaliyiz
    6) Parent taki method abstract ise butun child classlar o methodu override etmek zorundadir. (impletement)
       Bu yuzden tum child lar icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir.
    7) Body'si olan methodlar (Concrete Method/Somut) abstract classlarin icine yazilabilir.
       Abstract methodlar concrete classlarin icine yazilamazlar. Concrete methodlar child classlar tarafindan
       override edilmek zorunda degildir
    8) "Abstract" keyword ile method body bir methodda ayni anda kullanilamaz.
    9) final methodlar abstract olamazlar. final methodlar override edilemezler. Bu celiskidir, bu yuzden Java
       abstract methodlarin final olmasina musade etmez.
    10) "abstract" class'larin icinde abstract methodlar olur. "abstract methodlar" body'si olmadigindan eksik methodlar
        gibi dusunulebilir. Yani abstract class icinde eksik bir yapi barindirir. Eger siz abstract class tan object
        uretirseniz bu eksiklik object'e yansir. Java bunu istemez. Cunku eksik object eksik is yapar. Bu da app in
        yanlis calismasina sebep olur.
        Java application u korumak icin abstract classlardan object uretilmesini engellemistir
    11) "Abstract class" larin constructor'i vardir ama object olusturamazlar
    12) Abstract class'in abstract child'i veya concrete child'i olabiliyor. Eger child abstract ise abstract methodlari
        override etmek zorunda degildir.
    13) Abstract methodlar private olamazlar cunku child classlar abstract methodlari kullanirlar, private yapinca
        kullanima kapali olur. Bu celiskidir, bu yuzden java abstract methodlarin private olmasina musade etmez.
    14) Classlar final oldugunda child class'a sahip olamazlar. Ama abstract class'lar icin child class olmalidir.
        Cunku child classlar abstract parent classdaki abstract methodlari kullanirlar, bu yuzden Java abstract
        classlarin final olmasina musade etmez.
    15) Abstract methodlar static olamaz. Static methodlar override edilemez, halbuki abstract methodlar override
        edilmek icin olusturulmustur.
     */


    //public abstract void science(); -->body yok. abstract yaptim. child classlarin hepsi kirmiziya dondu. abstract
    //                                   classi implement yapmak zorundalar
    //abstract bir method koyar koymaz child classlarda mecburi yapmis oluyoruz
    //public FINAL abstract void science(); ben bu methodu final yaparsam hata veriyor. Cunku override edemem
    //final methodlar override edilemez. halbuki abstract methodun amaci buydu. final bir nevi kisirlastirmaydi


    }



