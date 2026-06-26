import java.util.Scanner; 

public class space_v1 { 
    public static void main(String[] args) { 
        // Taking input from user 
        Scanner sc = new Scanner(System.in); 
        boolean launched = false; 
        int launchCount = 0; 

        System.out.println("Enter Rocket Name: "); 
        String rocketName = sc.nextLine(); 

        System.out.println("Enter Fuel Level:"); 
        float fuelLevel = sc.nextFloat(); 
        sc.nextLine(); // Consume the newline character 

        System.out.println("Enter Destination:"); 
        String destination = sc.nextLine(); 

        int Choice; 
        do { 
            System.out.println("\n=====SPACE MISSION CONTROL====="); 
            System.out.println("1.View Mission Details"); 
            System.out.println("2.Launch Rocket"); 
            System.out.println("3.Refuel Rocket"); 
            System.out.println("4.Mission Exit"); 
            System.out.println("5.Exit"); 
            System.out.println("Enter your choice: "); 
            Choice = sc.nextInt(); 
            sc.nextLine(); // Consume the newline character 

            switch (Choice) { 
                case 1: 
                    System.out.println("\n===MISSION DETAILS=== \n Launch Date : 14 July 2023 \n Fuel Expense : 70 lac \n Expected Date to be Launched: 24 September 2023 \n Destination : "+ destination); 
                    break; 

                case 2: 
                    if (launched) { 
                        System.out.println("Rocket has already been launched. Cannot launch again."); 
                        break; 
                    } 
                    System.out.println("Launched Rocket Details:"); 
                    System.out.println("Rocket Name : " + rocketName); 
                    System.out.println("Enter Mission Distance (km): "); 
                    float distanceKm = sc.nextFloat(); 
                    if(distanceKm <= 0){ 
                        System.out.println("Invalid Distance"); 
                        break; 
                    } 
                    float requiredFuel = (distanceKm / 1000) * 10; 
                    System.out.println("Required Fuel: " + requiredFuel + "%"); 
                    
                    if (fuelLevel >= requiredFuel) { 
                        System.out.println("Fuel Check Passed"); 
                        System.out.println("Rocket Ready For Launch"); 
                        System.out.println("\nCOUNTDOWN STARTED"); 
                        for (int i = 5; i >= 1; i--) { 
                            System.out.println(i + "..."); 
                        } 
                        System.out.println("LIFTOFF!"); 
                        launched = true; 
                        launchCount++; 
                        fuelLevel -= requiredFuel; 
                        System.out.println("\nLAUNCH SUCCESSFUL"); 
                        System.out.println("MISSION STARTED"); 
                        System.out.println("Destination : " + destination); 
                        System.out.println("Remaining Fuel : " + fuelLevel + "%"); 
                        
                        if (fuelLevel < 30) { 
                            System.out.println("\nWARNING!"); 
                            System.out.println("LOW FUEL"); 
                            System.out.println("REFUEL REQUIRED"); 
                        } 
                    } else { 
                        System.out.println("Insufficient Fuel!"); 
                        System.out.println("Current Fuel : " + fuelLevel + "%"); 
                        System.out.println("Required Fuel : " + requiredFuel + "%"); 
                        System.out.println("REFUEL REQUIRED"); 
                    } 
                    break; 

                case 3: 
                    System.out.println("Refueling rocket..."); 
                    if (fuelLevel <= 30.0f){ 
                        System.out.println("Add fuel to the rocket"); 
                    } 
                    System.out.println("Enter fuel amount: "); 
                    float addFuel = sc.nextFloat(); 
                    
                    if (fuelLevel < 0 || fuelLevel > 100) { 
                        System.out.println("Invalid Fuel Level!"); 
                        return; 
                    } 
                    
                    if(fuelLevel + addFuel > 100){ 
                        System.out.println("Tank Capacity Exceeded!"); 
                    } else { 
                        fuelLevel += addFuel; 
                        System.out.println("Fuel level after refueling: " + fuelLevel + "%"); 
                    } 
                    if(addFuel <= 0){
                    System.out.println("Invalid Fuel Amount!");
                    break;
}
                    break; 

                case 4: 
                    if (launched) { 
                        System.out.println("Mission Status : LAUNCHED"); 
                    } else if (fuelLevel >= 50) { 
                        System.out.println("Mission Status : READY"); 
                    } else { 
                        System.out.println("Mission Status : NOT READY"); 
                    } 
                    System.out.println("Current Fuel : " + fuelLevel + "%"); 
                    System.out.println("Launch Count : " + launchCount); 
                    break; 

                case 5: 
                    System.out.println("Exiting..."); 
                    break; 

                default: 
                    System.out.println("Invalid choice. Please try again."); 
                    break; 
            } 
        } while (Choice != 5); 

        System.out.println("\n=== FINAL MISSION REPORT ===");
        System.out.println("Rocket Name : "+ rocketName); 
        System.out.println("Launch Date : 14 July 2023"); 
        System.out.println("Fuel : "+ fuelLevel + "%"); 
        System.out.println("Destination : "+ destination); 
        
        sc.close(); // Clean resource leak by closing scanner
    } 
}
