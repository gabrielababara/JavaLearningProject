package md.tekwillacademy.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        //Atribuire simpla
        int result = a;
        System.out.println("Atribuirea simpla: " + result);

        //Atribuirea cu scadere
        //result = result - b
        result -= b;
        System.out.println("Atribuirea cu scadere: " + result);

        //Atribuirea cu adunare
        //result = result + b
        result += b;
        System.out.println("Atribuirea cu adunare: " + result);

        //Atribuirea cu inmultire
        //result = result * b
        result *= b;
        System.out.println("Atribuirea cu inmultire: " + result);

        //Atribuirea cu impartire
        //result = result / b
        result /= b;
        System.out.println("Atribuirea cu impartiew: " + result);

        //Atribuirea cu restul impartirii
        //result = result % b
        result %= b;
        System.out.println("Atribuirea cu restul impartirii: " + result);
    }
}
