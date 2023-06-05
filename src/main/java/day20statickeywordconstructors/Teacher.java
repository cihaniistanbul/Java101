package day20statickeywordconstructors;

public class Teacher {

    String name;

    int age;

    String adress;

    public Teacher(String name, int age, String adress) { //hazir olusturdum. generate-constructor
        this.name = name;
        this.age = age;
        this.adress = adress;

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "TeacherRunner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }


}
