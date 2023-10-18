import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;

public class Elevator {
    private int weightLimit;
    private int currentWeight;
    private ArrayList<Person> people = null;                                        // ArrayList will automatically be set to null, but a good coding convention to do it anyway

    public Elevator()
    {
        this.weightLimit = 0;
        this.currentWeight = 0;
        people = new ArrayList<>();                                                   // Creating a new instance in the constructor
    }

    public void setWeightLimit(int weightLimit)
    {
        this.weightLimit = weightLimit;
    }

    public void setCurrentWeight(int currentWeight)
    {
        this.currentWeight = currentWeight;
    }

    public String getInfo()                                                         
    {
        String info = "Weight limit: " + this.weightLimit +
        "\nCurrent total weight: " + this.currentWeight; 

        for (Person person : people)                                                 
        {
            info += person.getInfo();                                               // Adds the name and weight from the arraylist to the string info
        }

        return info;

    }

    public boolean addPerson(Person person)                                                 // Checks to make sure the person can be added to the elevator
    {
        if (this.currentWeight + person.getWeight() > this.weightLimit)
        {
            return false;
        }
        else
        {
            this.currentWeight += person.getWeight();
            people.add(person);
            return true;
        }    
    }

    // Bonus - not sure what to really do here. I know that I have to sort the ArrayList by weight
    // public ArrayList<Person> addPeople(Person[] people)
    // {
    //     this.currentWeight = 0;

    //     Collections.sort(people.getWeight());
    //     ArrayList<Person> orderedPeopleList = new ArrayList<>();

    //     for (Person person : people)
    //     {
    //         if (this.currentWeight + person.getWeight() <= this.weightLimit)
    //         {
    //             this.currentWeight += person.getWeight();
    //             orderedPeopleList.add(person);
    //         }
    //     }
    //     return orderedPeopleList;
    // }

}
