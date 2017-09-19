package Person;

/* Demonstrate file reading and writing */
import java.util.ArrayList;

public class PersonTester {
	
	public static void main(String[] args) {

		// List of people
		ArrayList<Person> personList = new ArrayList<Person> ();

		// Read list of people from comma separated file
                try {
                    PersonReader pr = new PersonReader("people.txt");
       		personList = pr.getPeople();
                }
                catch(MyFormatException e) {
                    System.out.println("Oh no! I couldn't read the file.");
                    System.exit(1);
                }

		// Add a new person to list
		personList.add(new Person("XXX","YYY",1900));

		// Display people
		for (Person p : personList) {
			System.out.println(p.toString());
		}

		// Write list of people to file
		PersonWriter w = new PersonWriter("people.txt", personList);
	}
		
}
