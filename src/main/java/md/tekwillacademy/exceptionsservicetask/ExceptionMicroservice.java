package md.tekwillacademy.exceptionsservicetask;

public class ExceptionMicroservice {
    public static void main (String[] args){
    String controlVariable = null;

    System.out.println("The String Length it i = " + TextManager.getTheTextLengthWithTryAndCatch(controlVariable));
    System.out.println("The String Length it i = " + TextManager.getTheTextLength("Deonis"));
    System.out.println("The String Length it i = " + TextManager.getTheTextLengthWithIf(controlVariable));

    System.out.println(ArithmeticOperationService.divideWithoutExceptionHandling(0,2));
    System.out.println(ArithmeticOperationService.divideWithExceptionHandling(0,0));

    System.out.println("The show must go on");
    }
}

