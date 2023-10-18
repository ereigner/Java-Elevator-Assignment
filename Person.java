public class Person {
    private String name;
    private int weightInPounds;

    public Person(String name, int weightInPounds)
    {
        this.name = name;
        this.weightInPounds = weightInPounds;
    }

    public String getName()
    {
        return this.name;
    }

    public int getWeight()
    {
        return this.weightInPounds;
    }

    public String getInfo()                                                             // Used when adding the ArrayList to the string info
    {
        return "\nName: " + this.name + "\nWeight: " + this.weightInPounds;
    }
}
