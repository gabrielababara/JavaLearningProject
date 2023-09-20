package md.tekwillacademy.operationsandciclicfunctions;

public class ComparisonOperationExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        //Egal cu
        boolean isEqual = a == b;
        System.out.println("Egal cu: " + isEqual);

        //Diferit cu
        boolean isNotEqual = a != b;
        System.out.println("Diferit de: " + isNotEqual);

        //Mai mare decat
        boolean isGreaterThat = a > b;
        System.out.println("Mai mare decat: " + isGreaterThat);

        //Mai mic decat
        boolean isLessThat = a < b;
        System.out.println("Mai mic decat: " + isLessThat);

        //Mai mare sau egal cu
        boolean isGreaterThatOrEqual = a >= b;
        System.out.println("Mai mare sau egal cu: " + isGreaterThatOrEqual);

        //Mai mic sau egal cu
        boolean isLessThatOrEqual = a <= b;
        System.out.println("Mai mic sau egal cu: " + isLessThatOrEqual);
    }
}
