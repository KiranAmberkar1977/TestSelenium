package UttaraSamples;

public class Person implements Comparable  {
	private String name;
	private Integer num_of_phones;

	public Person(String name, Integer num_of_phones) {
		this.name = name;
		this.num_of_phones = num_of_phones;
		validate_input();
	}

	public void validate_input() {
		if (name.equals(null) || num_of_phones < 0)
			throw new IllegalArgumentException("Person class arguments are invalid...Please provide valid values...");
	}

	public int hashCode() {
		// Convert all the states of the Object used in the equals overridden method to
		// a String and apply hashCode on the result.
		return (name + num_of_phones).hashCode();

	}

	public String toString() {
		// Convert all Object state variables to an User-friendly String representation.
		return "Person [" + name + ", " + num_of_phones + "]";
	}

	public boolean equals(Object obj) {

		if (obj instanceof Person) {
			Person pobj = (Person) obj;

			if (this.name.equals(pobj.name) && this.num_of_phones == pobj.num_of_phones)
				return true;
			else
				return false;
		} else
			return false;
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Person ) {
			Person pobj = (Person)obj;
			return this.name.compareTo(pobj.name);				// If we want to compare based on 1st state of the Class.
			//return this.num_of_phones - pobj.num_of_phones	// If we want to compare based on 2nd state of the Class.
		}
		else
			throw new IllegalArgumentException("Can't compare 2 non-persons here !!");
	}
}
