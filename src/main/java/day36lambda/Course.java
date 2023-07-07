package day36lambda;

public class Course {

    /*
    Icinde
     1)private variable'lar;
     2)parametreli ve parametresiz constructorlar
     3)getter'lar
     4)setter'lar
     5)toString() methodu
    barindiran class'lara "POJO" class denir --> POJO (Plaind Old Java Object) demektir.
     */


    private String season;

    private String courseName;

    private int avarageScore;

    private int numberOfStudents;

    public Course() {
    }


    //constructor
    public Course(String season, String courseName, int avarageScore, int numberOfStudents) {
        this.season = season;
        this.courseName = courseName;
        this.avarageScore = avarageScore;
        this.numberOfStudents = numberOfStudents;
    }


    //getter
    public String getSeason() {
        return season;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    //setter
    public void setSeason(String season) {
        this.season = season;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    //toString methodu
    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }



}
