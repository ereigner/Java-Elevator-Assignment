// I worked with Zachary Kolbe on this assignment
//import java.util.ArrayList;
import java.util.Scanner;

public class PartnerLab1 {

    public static void main(String[] args) {
        Elevator e1 = new Elevator();                                                           // Created two elevator instances
        Elevator e2 = new Elevator();
        e1.setWeightLimit(800);
        e2.setWeightLimit(600);

        boolean personAdded = false;                                                            // Created a boolean type here so that it can store the addPerson() in the Elevator class
        boolean isDone = false;
        Scanner stringScan = new Scanner(System.in);                                            // Two different scanners for two different data types
        Scanner intScan = new Scanner(System.in);

        while (!isDone)                                                                         // This while loop is used to add people to elevator 1
        {
            System.out.println("Enter the name of the person in elevator 1 or press (q) to quit: ");
            String name = stringScan.nextLine();

            if (name.equalsIgnoreCase("q"))
            {
                isDone = true;
            }
            else
            {
                System.out.println("Enter the person's weight: ");
                int weight = intScan.nextInt();

                Person person = new Person(name, weight);
                personAdded = e1.addPerson(person);
                
                if (personAdded == false)
                {
                    System.out.println("Person could not be added!");
                }
                else
                {
                    System.out.println();
                    System.out.print("Person Added.");
                    System.out.println(person.getInfo());
                    System.out.println();
                }
            }
        }

        isDone = false;
        while (!isDone)                                                                                 // This while loop is used to add people to elevator 2
        {
            System.out.println("Enter the name of the person in Elevator 2 or press (q) to quit: ");
            String name = stringScan.nextLine();

            if (name.equalsIgnoreCase("q"))
            {
                isDone = true;
            }
            else
            {
                System.out.println("Enter the person's weight: ");
                int weight = intScan.nextInt();

                Person person = new Person(name, weight);
                personAdded = e2.addPerson(person);
                
                if (personAdded == false)
                {
                    System.out.println("Person could not be added!");
                    System.out.println();
                }
                else
                {
                    System.out.println();
                    System.out.println("Person Added.");
                    System.out.println(person.getInfo());
                    System.out.println();
                }
            }
        }

        // Bonus
        // Person[] e1Array = e1List.toArray(new Person[e1List.size()]);                 
        // ArrayList<Person> maxNumberOfPeopleForElevator1 = e1.addPeople(e1Array);

        // for (Person person : maxNumberOfPeopleForElevator1)
        // {
        //     System.out.println(person.getName() + " can enter the elevator 1.");
        // }

        // Person[] e2Array = e2List.toArray(new Person[e2List.size()]);
        // ArrayList<Person> maxNumberOfPeopleForElevator2 = e2.addPeople(e2Array);

        // for (Person person : maxNumberOfPeopleForElevator2)
        // {
        //     System.out.println(person.getName() + " can enter the elevator 2.");
        // }

        System.out.println("Elevator 1: \n" + e1.getInfo() + "\n");                         // Finally outputing all the info from elevator 1 and 2
        System.out.println("Elevator 2: \n" + e2.getInfo());
    }
}