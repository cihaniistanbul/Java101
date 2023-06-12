package day23datetimevarags;

public class Varargs02 {
    public static void main(String[] args) {
        //Example 2: Verilen isimlerin ilk harflerini console'a yazdiran methodu olusturunuz
        //           Ali Can --> AC     Kemal Han --> KH
        //Varargsi String manipulations ile birlestirmis olucaz, bir suru String gostericez

        getInitials("Ali Can","Kemal Han");
    }

    public static void getInitials(String... s){ //"String ... s" burada coklu yapi tutabilen array gibi bir yapimiz var
        String initials=""; //Ali Can dan gelen AC i koyacagim kavanoz..

        for (String w :s) {
           initials= initials+ w.charAt(0)+ w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials=""; //alicandan sonra kemalhanin gelmesi icin hiclik koyduk
        }

    }

}
