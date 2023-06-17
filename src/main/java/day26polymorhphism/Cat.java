package day26polymorhphism;

public class Cat extends Animal {

    public void meow(){
        System.out.println("Cats meow ...");
    }


    @Override
    public void eat(){                     //override yapmak istedigim methodu Animal classindan alip gecersiz yaptim
        System.out.println("Cat eat ..");  //Animal eat yazan yeri silip istedigimi yaziyorum
    }                                     //Child daki override edilmis eat() methoduna "Overriding Method" denir



    @Override  //Override Annotation: Override kurallarinin java tarafindan kontrol edilmesini saglar
    public void drink() {   //sag tik-generate-override
        super.drink();  //parenttaki variable veya
    }

    @Override
    public Animal create() {
        return new Cat(); //Bu method bize yeni bir Cat object'i olusturuyor. Her class ayni zamanda bir data
                          //type tir demistik. Her class urettigi object'in kalibidir. Create methodumun return
                          //type'i Animaldir. Cat IS-A Animal
    } //not 5 bn



    @Override
    public int add(int a, int b) {
        return a+b;
    }


    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }



}

 //parent classdan bir methodu alip degistirerek kullanamaya override denir ve basina @override yazilir

/*
  @Override
  public void drink() {  -->sag tik-generate-override yapinca direk bunu yazdiriyor
        super.drink();   -->burada ayni olmasini istemedigimiz icin silip sout ile ozellestiriyoruz
    }

    super.drink() --> Parenttaki variable veya methodlari cagirmak icin parantezsiz super keywordu
                      kullanilir.
                      Bir onceki classta super.km diyip parenttaki km'yi almistik.
                      Methodlari almak "OVERRİDE" oluyor


 */