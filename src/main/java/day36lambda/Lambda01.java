package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        //parametreli const. faydalanarak object olusturduk
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNigth = new Course("Winter", "Turkish Nigth", 98, 155);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNigth = new Course("Winter", "English Day", 93, 144);

        //object'i neden olusturduk? Course object'leriyle manipulation yapmak icin

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNigth);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNigth);
        //string manipulation degil object manipulation yapmak icin


        //1) Tum "avarageScore"larin 91 den buyuk olup olmadigini kontrol eden kodu yaziniz
        boolean result = courseList.stream().allMatch(t -> t.getAvarageScore() > 91);
        System.out.println(result); //true

        //"allMatch()" methodu : Verilen sarta gore stream icindeki tum elemanlarin bu sarta uymasi durumunda true
        //                       verecektir. Bir tane bile sart saglamaz ise sonuc false olur.
        //mukemmelliyetci


        //2) Course isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden code'u yaziniz
        boolean result2 = courseList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result2); //true

        //"anyMatch()" methodu stream'de bulunan data'larda herhangi bir degerin eslesmesi durumunda true verir
        //boolean return ediyor
        //anyMatch() : Verilen sarta gore stream icindeki herhangi bir elemanlarin bu sarta uymasi durumunda true verecektir
        //pollyanna gibi


        //3) Kurs donemleri icinde "Fall" doneminin hic bulunmadigini kontrol eden kodu yaziniz
        boolean result3 = courseList.stream().noneMatch(t->t.getSeason().contains("Fall"));
        System.out.println(result3);//true --> fall icermedigi icin true verdi

        //noneMatch() : Verilen sarta gore stream icindeki hicbir elemanin sarti saglamamasi durumunda true verir.


        //4) Avarage score'u en yuksek olan kursun ismini console'a yazdiran kodu yaziniz
        String name1 = courseList.
                stream().
                sorted(Comparator.comparing(Course::getAvarageScore).
                        reversed()).
                findFirst().
                get().
                getCourseName();
        System.out.println(name1); //Turkish Nigth


        //Tum course object'lerini avarage score'a gore kucukten buyuge diziniz ve ilk ikisi haric liste halinde yazdiriniz
        List<Course> myList =courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).collect(Collectors.toList());
        System.out.println(myList);
        //[Course{season='Summer', courseName='Turkish Day', avarageScore=97, numberOfStudents=128},
        // Course{season='Winter', courseName='Turkish Nigth', avarageScore=98, numberOfStudents=155}]




        //6) Tum course object'lerini avarage score'larina gore kucukten buyuge diziniz ve ilk ucunu liste halinde
        //   console'a yazdiriniz
        List<Course> myList2 =courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).limit(3).collect(Collectors.toList());
        System.out.println(myList2);
        //[Course{season='Winter', courseName='English Day', avarageScore=93, numberOfStudents=144},
        // Course{season='Spring', courseName='English Day', avarageScore=95, numberOfStudents=132},
        // Course{season='Summer', courseName='Turkish Day', avarageScore=97, numberOfStudents=128}]




















    }
}
