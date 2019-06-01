public class PascalTriangle {
    //
    public static void printArray(int[] array){
        for (int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    // n- numarul de randuri al triunghiului
    public static void print(int n){
        //primul rand din triunghi este 1
        int [] thisRow = {1};
        int [] prevRow;
        printArray(thisRow);
        prevRow = thisRow;
        //intram in bucla, incepand cu al doilea rand pana la n
        for (int i=2; i<= n; i++){
            thisRow = new int[i];
            // primul si ultimul elemente sunt intotdeauna =1
            thisRow[0]=1;
            thisRow[i-1]=1;
            //calculam elementele din fiecare rand
            for (int j=0; j<=i-3; j++){
                thisRow[j+1]=prevRow[j]+prevRow[j+1];
                            }
            printArray(thisRow);
            prevRow=thisRow;
        }
    }


}
