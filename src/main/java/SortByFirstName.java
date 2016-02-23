import java.util.Comparator;

/**
 * Created by sam on 21.02.2016.
 */
public class SortByFirstName implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
