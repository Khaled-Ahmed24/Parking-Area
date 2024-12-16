package vehicleparking;


import java.util.Scanner;

public class VehicleParking 
{
    public static String [] Spaces = new String[150]; // to set spaces
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Our Vehicle Parking Project...\nHow could I help You :)");
        Scanner cin = new Scanner(System.in);
        while(true)
        {
            System.out.println("Do You want to -->\n1: Adding a Vehicle\n2: Leaving a Vehicle\n3: Show Parking Status\n4: Exit :(");
            int Ans = cin.nextInt();
            if(Ans == 1)
            {
                System.out.println("Please Enter your Vehicle ID :)");
                String ID = cin.next();
                System.out.println("Please Enter your Vehicle Type :)\n1: Truck\n2: Bus\n3: Car\n4: Motorcycle");
                int Type = cin.nextInt();
                switch (Type) 
                {
                    case 1:
                        Truck T1 = new Truck(ID);
                        Truck.setID(ID); 
                        if(T1.Adding() == true)
                            System.out.println("\n\n\nThe Vehicle added Successfully ^_^\n");
                        else
                            System.out.println("\n\n\nSorry! We can't find a Suitable Place for You Right now :(\n");
                        break;
                    case 2:
                        Bus B1 = new Bus(ID);
                        Bus.setID(ID);
                        if(B1.Adding() == true)
                            System.out.println("\n\n\nThe Vehicle added Successfully ^_^\n");
                        else
                            System.out.println("\n\n\nSorry! We can't find a Suitable Place for You Right now :(\n");
                        break;
                    case 3:
                        Car C1 = new Car(ID);
                        Car.setID(ID);
                        if(C1.Adding() == true)
                            System.out.println("\n\n\nThe Vehicle added Successfully ^_^\n");
                        else
                            System.out.println("\n\n\nSorry! We can't find a Suitable Place for You Right now :(\n");
                        break;
                    case 4:
                        Motorcycle M1 = new Motorcycle(ID);
                        Motorcycle.setID(ID);
                        if(M1.Adding() == true)
                            System.out.println("\n\n\nThe Vehicle added Successfully ^_^\n");
                        else
                            System.out.println("\n\n\nSorry! We can't find a Suitable Place for You Right now :(\n");
                        break;
                    default:
                        System.out.println("This Input is Invalid :(");
                        break;
                }
            }
            else if(Ans == 2)
            {
                double R1 , R2 , R3 , R4;
                System.out.println("Please Enter your Vehicle ID :)");
                String ID = cin.next();
                System.out.println("Please Enter the Time your Vehicle Parked in Hours ^_^");
                double Hours = cin.nextDouble();
                Truck T1 = new Truck(ID , Hours);
                Bus B1 = new Bus(ID , Hours);         // for searching about ID
                Car C1 = new Car(ID , Hours);
                Motorcycle M1 = new Motorcycle(ID , Hours);
                R1 = T1.getPrice(ID);
                R2 = B1.getPrice(ID);
                R3 = C1.getPrice(ID);       // Testing what is Correct
                R4 = M1.getPrice(ID);
                if(R1 > 0.0)
                    System.out.println("The Vehicle released Successfully ^_^\nYour Cost is " + R1 + "\nThank You :)");
                else if(R2 > 0.0)
                    System.out.println("The Vehicle released Successfully ^_^\nYour Cost is " + R2 + "\nThank You :)");
                else if(R3 > 0.0)
                    System.out.println("The Vehicle released Successfully ^_^\nYour Cost is " + R3 + "\nThank You :)");
                else if(R4 > 0.0)
                    System.out.println("The Vehicle released Successfully ^_^\nYour Cost is " + R4 + "\nThank You :)");
                for(int i=1;i<=100;i++)
                {
                    if(ID.equals(Spaces[i]))
                        Spaces[i] = null;
                }
            }
            else if (Ans == 3)
            {
                int count1 = 0;
                int count2 = 0;
                for(int i=1;i<=100;i++)
                {
                    if(Spaces[i] == null)
                        count1++;
                    else
                        count2++;
                    if(Spaces[i] != null && count1 > 0)
                    {
                        System.out.println("There exist a Free Space and its Length " + count1 + " m.\n");
                        count1 = 0;
                    }
                    else if(Spaces[i] == null && count2 > 0)
                    {
                        System.out.println("There exist an Occupied Space and its Length " + count2 + " m.\n");
                        count2 = 0;
                    }
                    if(i == 100 )
                    {
                        if(count1 > 0)
                            System.out.println("There exist a Free Space and its Length " + count1 + " m.\n");
                        else
                            System.out.println("There exist an Occupied Space and its Length " + count2 + " m.\n");
                    }
                        
                }
            }
            else if(Ans == 4)
                break;
            else
                System.out.println("This Input is Invalid :(");
            System.out.println("any Thing else :)");
        }
    }   
}
