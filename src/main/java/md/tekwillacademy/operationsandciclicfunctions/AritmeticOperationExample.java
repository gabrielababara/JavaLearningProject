package md.tekwillacademy.operationsandciclicfunctions;

public class AritmeticOperationExample {
    public static void main(String[] args) {
        int a = 56;
        int c = 6;

        //Sum
        int sum = a + c;
        System.out.println("Suma: " + sum);
        System.out.println("Suma: " + (a + c));

        //Substraction
        int sub = a - c;
        System.out.println("Rezultatul: " + sub);

        //Multiplication
        int result = a * c;
        System.out.println("Inmultirea: " + result);

        //Devision
        result = a / c;
        System.out.println("Impartirea: " + result);

        //The rest of devision or Devision with remainder
        result = a % c;
        System.out.println("Restul impartirii: " + result);
    }
}
