public class Person implements Comparable<Person>
{

    //instance variables
    private String name;
    private double height;
    private double weight;

    //constructor
    public Person(String name, double height, double weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    
    //copy constructor to prevent unintended conversion
    public Person(Person another)
    {
        this.name = another.name;
        this.height = another.height;
        this.weight = another.weight;
    }

    //setters and getters

    public double getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    //toString method to output the instance variables
    @Override
    public String toString()
    {
        return String.format("%-10s %-12.2f %-12.2f", name, height, weight); 
        //modified toString to round to the nearest hundredth
    }
    
    //Equals method outline
    @Override
    public boolean equals(Object o)
    {
	//if Object o is null then return false
        if(o == null)
            return false;
	//if Object o == this then return true
        if(o == this)
            return true;
	//if Object o is not an instance of Person then return false
        if(!(o instanceof Person))
            return false;
    //Declare a new variable of type Person (perhaps named p) 
    //	and assign it to Object o cast as type Person
        Person p = (Person) o;
    //if Person p has the same name, height, and weight as 
    //	this then return true
        if(this.name.equals(p.name) && this.height == p.height && this.weight == p.weight)
            return true;    
    //else return false
        return false;
    }

    //allows Person objects to be sorted using Collections.sort
    @Override
    public int compareTo(Person other)
    {
        return this.name.compareTo(other.name);
    }

}
