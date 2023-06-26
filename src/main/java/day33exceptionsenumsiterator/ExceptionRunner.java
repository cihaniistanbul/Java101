package day33exceptionsenumsiterator;

public class ExceptionRunner {


     /*
    Garbage Collector memory i temiz tutmak icin surekli memory i tarar ve silinmesi gerekenleri siler
    Garbagec Collector silmeden once silecegi datalari finalize eder ve sonra siler
     */


    public static void main(String[] args) throws InvalidStudentGradeException {

        getStudentGrade(50);//50
        //  getStudentGrade(150); //InvalidStudentGradeException

        getTheNumberOfStudents(15);
        getTheNumberOfStudents(-15);

    }

    public static void getTheNumberOfStudents(int numOfStudens) {//method

        if (numOfStudens < 0) {
            try {
                throw new InvalidNumberException("Student number cannot be negative");
            } catch (InvalidNumberException e) {
                System.err.println(e.getMessage());
            }

        } else {
            System.out.println(numOfStudens);
        }
    }


    public static void getStudentGrade(int grade) throws InvalidStudentGradeException {

        if (grade < 0 || grade > 100) {
            throw new InvalidStudentGradeException("Student's grades cannot be less than zero or greater than 100");
        } else {
            System.out.println(grade);
        }

    }
}