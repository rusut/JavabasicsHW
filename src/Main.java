import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //Exercice 1
        int p = Exercice1.RectangleP(5,8);
        System.out.println("--Exercice 1:  The perimeter of the rectangle is: " +p);

        int a = Exercice1.RectangleA(5,8);
        System.out.println("  The area of the rectangle is: " +a);

        double h=Exercice1.HexagonA(15);
        System.out.println("  The area of the hexagon is: "+h);

        double j=Exercice1.HexagonP(15,4);
        System.out.println("  The perimeter of the hexagon is: "+j);


        //Exercice3
        System.out.println("--Exercice3:  Enter your string to reverse: ");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        StringBuilder b = new StringBuilder();
        for (int i = str.length()-1; i>= 0;i--) {
            b.append(str.charAt(i));
        }
            System.out.println("Reversed string is: ");
            System.out.println(b.toString());


        //Exercice 4
        System.out.println("--Exercice4 : odd numbers from 1 to 99 result ");
        for(int i=1;i<99;i++){
            if(i%2 != 0){
                System.out.print(" "+i);

            }
        }

        //Exercice5
        System.out.println();
        System.out.println("--Exercice 5 :");
        System.out.println("Original text: This Text SHoUld be conVErted ACCordinglY ");
        String Input = "This Text SHoUld be conVErted ACCordinglY";
        System.out.println("Converted text lowercase: ");
        System.out.println(Input.toLowerCase());
        //System.out.println("Converted text uppercase: ");
        //System.out.println(Input.toUpperCase());



        //Exercice 6
        System.out.println("--Exercice 6 :");
        for(int i=0; i<=100; i++){
            if (i%3==0 && i%5==0)
                System.out.print("fizz buzz,");
            else
                if(i%3==0)
                System.out.print("fizz,");
                else
                if (i%5==0)
                System.out.print("buzz,");
            else  System.out.print(i+",");

        }


        // Exercice7
        System.out.println();
        System.out.println("--Exercice 7 :");
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number to check if it is a palindrome");
        original = in.nextLine();
        int l = original.length();
        for ( int i = l - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("This number is a palindrome.");
        else
            System.out.println("This number is not palindrome.");
    }


}



