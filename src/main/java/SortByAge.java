import java.util.Comparator;

/**
 * Created by sam on 21.02.2016.
 */
public class SortByAge implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2)
    {
        Integer a1 = o1.getAge();
        Integer a2 = o1.getAge();
        return a1.compareTo(a2);
    }
}
