package md.tekwillacademy.operationsandciclicfunctions;

public class LogicalOperationsExample {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean result = a && b;
        System.out.println("Logic and: " + result);
        a = result && b;
        System.out.println("Logic and: " + a);
        result = a || b;
        System.out.println("Logic or: " + result);
        System.out.println("Negation: " + !!!result);
    }
}
