import java.util.Scanner;

public class Laptop {

    Scanner userInput = new Scanner(System.in);

    private String driveCapacity, processorType, graphicsCard, ramSize;
    private double totalPrice;



    public Laptop(String driveCapacity, String processorType, String graphicsCard, String ramSize){

        this.driveCapacity = driveCapacity;
        this.processorType = processorType;
        this.graphicsCard = graphicsCard;
        this.ramSize = ramSize;
    }

    public Laptop(){}

    //begin hard drive
    public void DriveSize(){
        System.out.println("What size drive do you want?");
        System.out.println("1: 250Gb, 2: 512Gb, 3: 1TB, 4: 2TB, 5: 3TB");
        driveCapacity = userInput.next().toLowerCase();
        boolean compType = false;

        while (!driveCapacity.equals("1") && !driveCapacity.equals("2") && !driveCapacity.equals("3") &&
                !driveCapacity.equals("4") && !driveCapacity.equals("5")) {
            System.out.println("Press 1, 2, 3, 4, or 5");
            driveCapacity = userInput.next();
        }

        while(!compType) {
            switch (driveCapacity) {
                case "1":
                    setDriveCapacity("250Gb");
                    totalPrice += 29.99;
                    compType = true;
                    break;
                case "2":
                    setDriveCapacity("512Gb");
                    totalPrice += 49.99;
                    compType = true;
                    break;
                case "3":
                    setDriveCapacity("1TB");
                    totalPrice += 79.99;
                    compType = true;
                    break;
                case "4":
                    setDriveCapacity("2TB");
                    totalPrice += 89.99;
                    compType = true;
                    break;
                case "5":
                    setDriveCapacity("3TB");
                    totalPrice += 99.99;
                    compType = true;
                    break;
                default:
                    System.out.println("Something went wrong???");
                    break;
            } //end switch
        }//end while
    }

    public void setDriveCapacity(String driveCapacity){

        this.driveCapacity = driveCapacity;
    }
    public String getDriveCapacity(){

        return driveCapacity;
    }
    //end hard drive

    //begin processor
    public void ProcessorSpeed(){
        System.out.println("What speed processor do you want?");
        System.out.println("Intel: 1: i3, 2: i5, 3: i7, 4: i9");                    // format the prints here
        System.out.println("AMD: 5: Ryzen 3, 6: Ryzen 5, 7: Ryzen 7");             // ***********************
        processorType = userInput.next().toLowerCase();
        boolean compType = false;

        while (!processorType.equals("1") && !processorType.equals("2") && !processorType.equals("3") &&
                !processorType.equals("4") && !processorType.equals("5") && !processorType.equals("6") && !processorType.equals("7")) {
            System.out.println("Press 1, 2, 3, 4, 5, 6, or 7");
            processorType = userInput.next();
        }

        while(!compType) {
            switch (processorType) {
                case "1":
                    setProcessorType("i3");
                    totalPrice += 129.99;
                    compType = true;
                    break;
                case "2":
                    setProcessorType("i5");
                    totalPrice += 149.99;
                    compType = true;
                    break;
                case "3":
                    setProcessorType("i7");
                    totalPrice += 299.99;
                    compType = true;
                    break;
                case "4":
                    setProcessorType("i9");
                    totalPrice += 599.99;
                    compType = true;
                    break;
                case "5":
                    setProcessorType("Ryzen 3");
                    totalPrice += 79.99;
                    compType = true;
                    break;
                case "6":
                    setProcessorType("Ryzen 5");
                    totalPrice += 99.99;
                    compType = true;
                    break;
                case "7":
                    setProcessorType("Ryzen 7");
                    totalPrice += 149.99;
                    compType = true;
                    break;
                default:
                    System.out.println("Something went wrong???");
                    break;
            } //end switch
        }//end while
    }

    public void setProcessorType(String processorType){

        this.processorType = processorType;
    }
    public String getProcessorType(){

        return processorType;
    }
    //end processor

    //begin graphics card
    public void GraphicCardType(){
        System.out.println("What kind of graphics card do you want?");
        System.out.println("MSI:");                                                                 //format print here
        System.out.println("1: Ventus XS Geforce, 2: Gaming X Trio Geforce, 3: Gaming Z Geforce");  //format print here
        graphicsCard = userInput.next().toLowerCase();
        boolean compType = false;

        while (!graphicsCard.equals("1") && !graphicsCard.equals("2") && !graphicsCard.equals("3")) {
            System.out.println("Press 1, 2, or 3");
            graphicsCard = userInput.next();
        }

        while (!compType) {
            switch (graphicsCard) {
                case "1":
                    setGraphicsCard("Ventus XS Geforce");
                    totalPrice += 384.99;
                    compType = true;
                    break;
                case "2":
                    setGraphicsCard("Gaming X Trio Geforce");
                    totalPrice += 1349.99;
                    compType = true;
                    break;
                case "3":
                    setGraphicsCard("Gaming Z Geforce");
                    totalPrice += 589.99;
                    compType = true;
                    break;
                default:
                    System.out.println("Something went wrong???");
                    break;
            }//end switch
        }//end while
    }

    public void setGraphicsCard(String graphicsCard){

        this.graphicsCard = graphicsCard;
    }
    public String getGraphicsCard(){

        return graphicsCard;
    }
    //end graphics card

    //begin RAM
    public void RamType(){
        System.out.println("What size RAM do you want?");
        System.out.println("1: 4GB, 2: 8Gb, 3: 16GB, 4: 32GB");
        ramSize = userInput.next().toLowerCase();
        boolean compType = false;

        while (!ramSize.equals("1") && !ramSize.equals("2") && !ramSize.equals("3") && !ramSize.equals("4")) {
            System.out.println("Press 1, 2, 3, or 4");
            ramSize = userInput.next();
        }

        while (!compType) {
            switch (ramSize) {
                case "1":
                    setRamSize("4GB");
                    totalPrice += 29.99;
                    compType = true;
                    break;
                case "2":
                    setRamSize("8GB");
                    totalPrice += 49.99;
                    compType = true;
                    break;
                case "3":
                    setRamSize("16GB");
                    totalPrice += 69.99;
                    compType = true;
                    break;
                case "4":
                    setRamSize("32GB");
                    totalPrice += 79.99;
                    compType = true;
                    break;
                default:
                    setRamSize("Something went wrong???");
                    break;
            } //end switch
        }//end while
    }

    public void setRamSize(String ramSize){

        this.ramSize = ramSize;
    }
    public String getRamSize(){

        return ramSize;
    }
    //end RAM

    //***************************\\

    public double getTotalPrice(){

        return totalPrice;
    }
}

