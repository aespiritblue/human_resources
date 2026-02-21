public class Person {

    //instance variables
    private String name;
    private double height;
    private double weight;

    //constructor
    public Person()
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
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

    }

    public void setWeight(double weight)
    {
        
    }

    @Override
    public String toString()
    {
        return name + "," + height + "," + weight; //TODO make this a database ready format
    }

    
}
