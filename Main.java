import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String userName, userResponse;
        boolean compType = false;

        //************************************************

        System.out.println("Welcome. What is your name? ");
        userName = userInput.nextLine();

        System.out.println("Hello, " + userName + ". " + "Do you want to continue to the market place? y/n");
        userResponse = userInput.nextLine();

        while (!userResponse.equalsIgnoreCase("y") && !userResponse.equalsIgnoreCase("n")){
            System.out.println("Invalid response");
            System.out.println("Are you trying to get to the market place? y/n");
            userResponse = userInput.nextLine();
        }

        //main body
        while (userResponse.equalsIgnoreCase("y")) {
            System.out.println("Okay, are you trying to build a desktop or purchase a new laptop?");
            System.out.println("Please press: ");
            System.out.println("1: Desktop");
            System.out.println("2: Laptop");
            userResponse = userInput.next().toLowerCase();

            while (!userResponse.equals("1") && !userResponse.equals("2")) {
                System.out.println("Please press 1 or 2");
                userResponse = userInput.next();
            }

            int choice = Integer.valueOf(userResponse);

            while (!compType) {
                switch (choice) {
                    case 1:
                        System.out.println("Build your desktop");
                        compType = true;
                        Desktop desktop = new Desktop();
                        desktop.DriveSize();
                        desktop.ProcessorSpeed();
                        desktop.GraphicCardType();
                        desktop.RamType();
                        desktop.MonitorSize();
                        desktop.TowerType();

                        Desktop userDesktop = new Desktop(desktop.getDriveCapacity(), desktop.getProcessorType(),
                                desktop.getGraphicsCard(), desktop.getRamSize(), desktop.getMonitorType(), desktop.getTowerSize());
                        System.out.println(userName + ", " + "this is your computer:");
                        System.out.printf("%15s%20s%30s%15s%20s%15s\n", "Hard Drive Size", "Processor Speed", "Graphics Cards", "Ram Size", "Monitor Size", "Tower Size");
                        System.out.printf("%15s%20s%30s%15s%20s%15s\n", "---------------", "---------------", "--------------", "--------", "------------", "----------");
                        System.out.printf("%15s%20s%30s%15s%20s%15s\n", userDesktop.getDriveCapacity(), userDesktop.getProcessorType(), userDesktop.getGraphicsCard(),
                                userDesktop.getRamSize(), userDesktop.getMonitorType(), userDesktop.getTowerSize());
                        System.out.printf("Total: %125.2f\n", desktop.getTotalPrice());
                        break;
                    case 2:
                        System.out.println("Build your laptop");
                        compType = true;
                        Laptop laptop = new Laptop();
                        laptop.DriveSize();
                        laptop.ProcessorSpeed();
                        laptop.GraphicCardType();
                        laptop.RamType();
                        Laptop userLaptop = new Laptop(laptop.getDriveCapacity(), laptop.getProcessorType(),
                                laptop.getGraphicsCard(), laptop.getRamSize());
                        System.out.println(userName + ", " + "this is your computer:");
                        System.out.printf("%15s%20s%30s%15s\n", "Hard Drive Size", "Processor Speed", "Graphics Cards", "Ram Size");
                        System.out.printf("%15s%20s%30s%15s\n", "---------------", "---------------", "--------------", "--------");
                        System.out.printf("%15s%20s%30s%15s\n", userLaptop.getDriveCapacity(), userLaptop.getProcessorType(),
                                userLaptop.getGraphicsCard(), userLaptop.getRamSize());
                        System.out.printf("Total: %90.2f\n", laptop.getTotalPrice());
                        break;
                    default:
                        System.out.println("Not one of the choices, goodbye");
                        break;
                }//end switch
            }//end nested while
        }//end while
        System.out.println("Goodbye");
    }
}