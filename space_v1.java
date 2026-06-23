
import java.util.Scanner;
public class space_v1 {
    
public static void main(String[] args) {
       //taking input from user
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter Rocket Name: ");
       String rocketName = sc.nextLine();

       System.out.println("Enter Fuel Level:");
       float fuelLevel = sc.nextFloat();

       sc.nextLine(); // Consume the newline character
    
         System.out.println("Enter Destination:");
         String destination = sc.nextLine();

        
        //String status = "Ready for Launch";
        
        int Choice;
        do {

        System.out.println("=====SPACE MISSION CONTROL=====");
        System.out.println("1.View Mission Details");
        System.out.println("2.Launch Rocket");
        System.out.println("3.Refuel Rocket");
        System.out.println("4.Exit");
        
         
    
        System.out.println("Enter your choice: ");
        Choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        switch (Choice) {
            case 1:
                System.out.println("\n===MISSION DETAILS=== \n Launch Date : 14 July 2023 \n Fuel Expense : 70 lac \n Expected Date to be Launched: 24 September  2023 \n Destination : "+ destination);
                break;
            case 2:
                System.out.println("Launched Rocket Details: ");
                System.out.println("Rocket Name : "+ rocketName);
                if (fuelLevel >= 50.0f) {
                    
                    System.out.println("Fuel : "+ fuelLevel + "%");
                    System.out.println("Destination : "+ destination);
                    System.out.println("\nLAUNCH SUCCESSFUL");
                    System.out.println("MISSION STARTED");
                } else {
                    System.out.println("Rocket launch failed due to insufficient fuel.");
                }
                break;
            case 3:
                System.out.println("Refueling rocket...");
                if (fuelLevel <= 30.0f){
                    System.out.println("Add fuel to the rocket");
                }
            case 4:
                System.out.println("Exiting...");
                break;
        
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }while (Choice != 4);

        System.out.println("Rocket Name : "+ rocketName);
        System.out.println("Launch Date : 14 July 2023");
        System.out.println("Fuel : "+ fuelLevel + "%");
        System.out.println("Destination : "+ destination);
        //40
        // System.out.println("Status: "+ status);
        String status;
        if (fuelLevel >= 50.0f) {
            status = "Ready";
        } else {
            status = "Not Ready";
        }
        System.out.println("Status: " + status);

        if (fuelLevel >=50.0f) {
            System.out.println("\nLAUNCH SUCCESSFUL");
            System.out.println("MISSION STARTED");
        } else {
            System.out.println("Rocket launch failed due to insufficient fuel.");
        }

    }
}
            