package md.tekwillacademy.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 5;
        int limit =100;
        while (a > 0){
            System.out.println(a + ", ");
            a = a - 1;
            a -= 1;
            a--;
        }
        System.out.println();
        do{
            System.out.print(a + ", ");
            a = a + 1;
            a++;
        }
        while (a < limit);

        System.out.println();

        for (int i = 1; i <= limit; i++){
            System.out.print(i + ", ");
        }
        System.out.println();
        for(int i = 1; i <= limit; i++){
            if((i % 2) == 0){
                System.out.print(i + ", ");
            } else {
                System.out.print("[], ");
            }
        }
    }
}