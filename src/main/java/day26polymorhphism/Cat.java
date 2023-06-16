package day26polymorhphism;

public class Cat extends Animal {

    public void meow(){
        System.out.println("Cats meow ...");
    }


    @Override
    public void eat(){ //override yapmak istedigim methodu Animal classindan alip gecersiz yaptim
        System.out.println("Cat eat ..");//Animal eat yazan yeri silip istedigimi yaziyorum
    } //Child daki override edilmis eat() methoduna "Overriding Method" denir


    //Override Annotation: Override kurallarinin java tarafindan kontrol edilmesini saglar
    @Override
    public void drink() {
        System.out.println("Cat drink"); //sag tik-generate-override
    }


    @Override
    public Animal create() {
        return new Cat();
    }


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