package md.tekwillacademy.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int score = 90;

        if(score >= 100){
            System.out.println("The grade is A");
        } else if (score >= 90){
            System.out.println("The grade is B");
        } else if (score >= 80){
            System.out.println("The grade is C");
        } else if(score >=70){
            System.out.println("The grade is D");
        } else {
            System.out.println("Such a qualifier is not defined");
        }
    System.out.println("The program is over");
    }
}