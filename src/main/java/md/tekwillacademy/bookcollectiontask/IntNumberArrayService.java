package md.tekwillacademy.bookcollectiontask;

public class IntNumberArrayService {
    //data Table[0] = 9;
    //data Table[1] = 65;
    //data Table[2] = 12;
    //data Table[3] = 52;
    //data Table[4] = 5;
    //data Table[5] = 1;

    public static int findMin(int[] arrayTable){
        int min = arrayTable[0];
        for (int i = 1; i < arrayTable.length; i++ ){
            if(min < arrayTable[i]){
                min = arrayTable[i];
            }
        }
        return min;
    }
    public static double getAvg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return  sum/array.length;
    }
}

