public class MaxSumArray {
     static int arr[] = new int[]{2,5,8,1,3,9,4};

     static int MaxSum(){
         int max1, max2;
         if (arr[0]>arr[1]){
             max1=arr[0];
             max2=arr[1];
         }
         else{
             max1=arr[1];
             max2=arr[0];
         }
         
         for (int i=2; i<arr.length; i++){
             if (arr[i]>max1) {
                 max2=max1;
                 max1=arr[i];
             }
             else if (arr[i]>max2 && arr[i] != max1)
                 max2=arr[i];

         }
         System.out.println("Max1: "+max1);
         System.out.println("Max2: "+max2);
         return (max1+max2);
     }

    public static void main(String[] args) {
        System.out.println("Suma numerelor maxime este: " +MaxSum());
    }
}
