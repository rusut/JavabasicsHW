
public class Exercice1 {

//Write a Java program to print the area and perimeter and area  of a rectangle and a hexagon
    static int RectangleP(int w, int l){
    int p= w*l;
    return p;
    }
    static int RectangleA(int w, int l){
    int a=2*(w+l);
        return a;
    }
    static double HexagonA(int m){
    return(6*(m*m))/(4*(Math.PI/6));
    }
    static double HexagonP(int m, int n) {
    return m*n;
}
    }




