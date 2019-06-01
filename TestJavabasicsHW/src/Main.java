import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu numarul de randuri: ");
        int row = scanner.nextInt();
        PascalTriangle.print(row);
        }
}
