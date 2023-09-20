package md.tekwillacademy.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        String nameOfTheDay ="Sunday";

        int numberOfTheDay;

        System.out.println(nameOfTheDay.toUpperCase());

        switch (nameOfTheDay.toUpperCase()){
            case"MONDAY":
                numberOfTheDay = 1;
                System.out.println("A case has been found");
                break;
            case "TUESDAY":
                numberOfTheDay =2;
                System.out.println("A case has been found");
                break;
            case "WEDNESDAY":
                numberOfTheDay =3;
                System.out.println("A case has been found");
                break;
            case "THURSDAY":
                numberOfTheDay =4;
                System.out.println("A case has been found");
                break;
            case "FRIDAY":
                numberOfTheDay =5;
                System.out.println("A case has been found");
                break;
            case "SATURDAY":
                numberOfTheDay =6;
                System.out.println("A case has been found");
                break;
            case "SUNDAY":
                numberOfTheDay =7;
                System.out.println("A case has been found");
                break;
            default:
                numberOfTheDay = 0;
                System.out.println("You entered a day that is not defined");
        }
        System.out.println("The number of the day " + " is " + numberOfTheDay);
    }
}
