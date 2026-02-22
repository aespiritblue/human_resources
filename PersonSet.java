import java.util.ArrayList;

public class PersonSet implements PersonList
{
    protected ArrayList<Person> people;

    //constructor

    public PersonSet()
    {
        people = new ArrayList<>();
    }

    @Override
    public void add(Person p) 
    {
       if(!people.contains(p)) //if p isn't isn't in the array list
            people.add(p); //add p
    }

    @Override
    public Person get(int index) 
    {
        return people.get(index);
    }
    @Override
    public String toString()
    {
        String result = ""; 
         //loops through string
        for(Person p : people) //for each person
            result = result + p.toString() + "\n"; //add result to result

        return result;
    }
    
}
