import java.util.Scanner;

public class Route {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to StreetWise\n");
        System.out.println("Default Routes:\n");
        System.out.println("Cebu City (Start)");
        System.out.println("Minglanilla (Route 1)");
        System.out.println("San Fernando (Route 2)");
        System.out.println("Carcar (Route 3)");
        System.out.println("Barili (Route 4.1)");
        System.out.println("Dumanjug (Route 4.1.1)");
        System.out.println("Alcantara (Route 4.1.2)");
        System.out.println("Sibonga (Route 4.2)");
        System.out.println("Dumanjug (Route 4.2.1)");
        System.out.println("Alcantara (Route 4.2.2)");
        System.out.println("Moalboal (end)");
        System.out.print("\nIs Barili obstructed? (1 = Yes, 0 = No): ");
        int isBariliObstructed = scanner.nextInt();

        double distanceViaBarili = 84.9;
        double distanceViaDumanjug = 93.9;
        double distanceViaArgao = 92.2;

        if (isBariliObstructed == 1) {
            System.out.print("Is Dumanjug obstructed? (1 = Yes, 0 = No): ");
            int isDumanjugObstructed = scanner.nextInt();
            if (isDumanjugObstructed == 1) {
                System.out.println("\nTake the Argao Route. ");
                System.out.println("\n--------------------------------");
                System.out.println("Recommended Route:\n");
                System.out.println("Cebu City (Start)");
                System.out.println("Minglanilla (Route 1)");
                System.out.println("San Fernando (Route 2)");
                System.out.println("Carcar (Route 3)");
                System.out.println("Argao (Route 5)");
                System.out.println("Ronda (Route 5.1)");
                System.out.println("Alcantara (Route 5.2)");
                System.out.println("Moalboal (End)");
                System.out.println("--------------------------------");

                System.out.println("Additional Data: ");
                System.out.println("Distance: " + distanceViaArgao + "km");
                System.out.print("How fast are you going (in km/h): ");
                double speed = scanner.nextDouble();
                double eta = distanceViaArgao / speed;
                int hr = (int) (distanceViaArgao / speed);
                int minutes = (int) ((distanceViaArgao / speed * 60) % 60);
                System.out.println("Estimated Time of Arrival (ETA): " + hr + " Hour(s) " + minutes + " Minute(s)");
            } else {
                System.out.println("\n--------------------------------");
                System.out.println("Recommended Route:\n");              
                System.out.println("Cebu City (Start)");
                System.out.println("Minglanilla (Route 1)");
                System.out.println("San Fernando (Route 2)");
                System.out.println("Carcar (Route 3)");
                System.out.println("Sibonga (Route 4.2)");
                System.out.println("Dumanjug (Route 4.2.1)");
                System.out.println("Alcantara (Route 4.2.2)");
                System.out.println("Moalboal (End)");
                System.out.println("--------------------------------");

                System.out.println("Additional Data: ");
                System.out.println("Distance: " + distanceViaDumanjug + "km");
                System.out.print("How fast are you going (in km/h): ");
                double speed = scanner.nextDouble();
                double eta = distanceViaDumanjug / speed;
                int hr = (int) (distanceViaDumanjug / speed);
                int minutes = (int) ((distanceViaDumanjug / speed * 60) % 60);
                System.out.println("Estimated Time of Arrival (ETA): " + hr + " Hour(s) " + minutes + " Minute(s)");
            }
        } else {
            System.out.println("\n--------------------------------");
            System.out.println("Recommended Route:\n");
            System.out.println("Cebu City (Start)");
            System.out.println("Minglanilla (Route 1)");
            System.out.println("San Fernando (Route 2)");
            System.out.println("Carcar (Route 3)");
            System.out.println("Barili (Route 4.1)");
            System.out.println("Dumanjug (Route 4.1.1)");
            System.out.println("Moalboal (End)");
            System.out.println("--------------------------------");
            
            System.out.println("Additional Data: ");
            System.out.println("Distance: " + distanceViaBarili + "km");
            System.out.print("How fast are you going (in km/h): ");
            double speed = scanner.nextDouble();
            double eta = distanceViaBarili / speed;
            int hr = (int) (distanceViaBarili / speed);
            int minutes = (int) ((distanceViaBarili / speed * 60) % 60);
            System.out.println("Estimated Time of Arrival (ETA): " + hr + " Hour(s) " + minutes + " Minute(s)");
        }
    }
}
