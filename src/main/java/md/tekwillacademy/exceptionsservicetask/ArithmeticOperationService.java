package md.tekwillacademy.exceptionsservicetask;

public class ArithmeticOperationService {
    public static double divideWithoutExceptionHandling(int a,int b) {
        return a / b;
    }
    public static double divideWithExceptionHandling(int a, int b){
        try {
            return a / b;
        } catch (ArithmeticException capturedException) {
            System.out.println(capturedException.getMessage());
            System.out.println("This block is executed only if there is an exception in the try section");
            return 0.0;
        } finally {
            System.out.println("This block is execute all the times");
        }
    }
}
