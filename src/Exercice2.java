import java.util.Scanner;

public class Exercice2 {
    //Write a Java program to compute the distance
    // between two points on the surface of earth
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter latitude of point 1:");
        double lat1 = input.nextDouble();
        System.out.println("Enter longitude of point 1:");
        double lon1 = input.nextDouble();
        System.out.println("Enter latitude of point 2:");
        double lat2 = input.nextDouble();
        System.out.println("Enter longitude of point 2:");
        double lon2 = input.nextDouble();


        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c;

        distance = Math.pow(distance, 2);
        System.out.println((Math.sqrt(distance)) + " Km\n");


    }


}
