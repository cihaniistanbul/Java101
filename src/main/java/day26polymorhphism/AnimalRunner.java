package day26polymorhphism;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat myCat = new Cat(); //cat class'indan bir object urettim
        myCat.eat(); //yazdirinca "Animals eat" cikiyor ama bunu gormek istemiyorum
                     //"cat eat" yazsin istiyorum

        myCat.drink();
    }
}

   /*
    -->  myCat. yazinca eat(), meow() ve drink() methodlarina ulasabiliyorum.
    -->  myCat.eat(); //yazdirinca "Animals eat" cikiyor ama bunu gormek istemiyorum "cat eat" yazsin istiyorum.
    -->  Cat classinda eat methoduyla alakali ozellestirme yapmak istiyorum. Bunun icin Animal class'indan "eat()" methodunu alip ozellestirmek
         istedigim Cat class'ina yapistiriyorum.Burada "override" yapiyorum
    -->  "Override" gecersiz kilma, hukmunu degistirme demek. Parentta bulunan eat() methodunu gecersiz kilmak istiyorum. "Animals eat" gormek
         istemiyorum console da.

   */