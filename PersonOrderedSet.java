import java.util.Collections;
public class PersonOrderedSet extends PersonSet
{
    @Override
    public void add(Person p)
    {
        //Note to self: use collections.sort in person
        super.add(p);
        Collections.sort(people);    
    }
}
