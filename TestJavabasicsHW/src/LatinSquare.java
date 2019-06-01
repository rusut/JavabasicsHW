//Latin square logic
public class LatinSquare {
    
    static void square(int n){
        int l = n+1;
        for (int i=1; i<=n; i++){
            int temp = l;
            while (temp<=n){
                System.out.print(temp + " ");
                temp++;
            }
            for (int j = 1; j < l; j++)
                System.out.print(j+" ");
                l--;
                System.out.println();
                    }
    }

    public static void main(String[] args) {
        int n=10;
        square(n);
    }
}
