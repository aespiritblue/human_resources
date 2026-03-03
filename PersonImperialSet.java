public class PersonImperialSet extends PersonSet
{
    @Override
    public void add(Person p)
    {
        //converts to imperial
        p.setHeight(convertHeight(p.getHeight()));
        p.setWeight(convertWeight(p.getWeight()));

        //adds to set
        super.add(p);
    }

    //converts height to inches
    private double convertHeight(double height)
    {
        return height * 0.3937008; 
    }

    //converts kg to lbs
    private double convertWeight(double weight)
    {
        return weight * 2.204623; 
    }
}
