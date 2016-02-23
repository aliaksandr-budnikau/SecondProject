import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 * Created by sam on 21.02.2016.
 */
public class Sort
{
    public static final String FILE_NAME = "persons.txt";
    public static final String CHARSET_NAME = "UTF-8";
    public static final String STOP = "stop";


    public static void main(String args[]) throws IOException {
        System.out.println("Persons loading");
        System.out.println("Persons were loaded.");
        System.out.println("App was started. Enter" +" "+STOP +" "+"to exit.");
        System.out.println("Please enter: 'f' 's' 'a'");
        List<Person> list = getPersonFromFile();
        try(Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                if ("f".equals(str)) {
                    Collections.sort(list, new SortByFirstName());
                } else if ("s".equals(str)) {
                    Collections.sort(list, new SortBySecondName());
                } else if ("a".equals(str)) {
                    Collections.sort(list, new SortByAge());
                } else if(STOP.equals(str))
                {
                    break;
                }
                printPerson(list);
                System.out.println("Please enter: 'f' 's' 'a'");
            }
        }
    }

    public static List<Person> getPersonFromFile() throws IOException
    {
        List<Person> list = new ArrayList<>();
        try (FileInputStream inputStream = new FileInputStream(FILE_NAME);
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream, CHARSET_NAME);
             BufferedReader reader = new BufferedReader(inputStreamReader))
        {
            String line;
            while ((line = reader.readLine())!=null)
            {
                list.add(convertToPerson(line));
            }
        }
        return list;
    }

    private static Person convertToPerson(String line) {
        String[] personData = line.split(" ");
        return new Person(personData[0], personData[1], Integer.parseInt(personData[2]));
    }


    public static void printPerson(List<Person> list)
    {
        for(Person person : list)
        {
            System.out.println(person);
        }
    }

}
