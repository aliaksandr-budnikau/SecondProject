/**
 * Created by sam on 21.02.2016.
 */
public class Person
{
    private String firstName;
    private String secondName;
    private int age;

    Person(String firstName, String secondName, int age)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String setFirstName(String firstName)
    {
        return this.firstName = firstName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public String setSecondName(String secondName)
    {
        return this.secondName = secondName;
    }

    public int getAge()
    {
        return age;
    }

    public int setAge(int age)
    {
        return this.age=age;
    }

    public String toString()
    {
        return firstName+ " " + secondName+ " " + age;
    }
}
