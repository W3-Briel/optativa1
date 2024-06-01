package tutorial1;

import java.time.LocalDate;

public class Person {
	
	public int id;
	public String name;
	public LocalDate birth;
	
	public Person(int id, String name, LocalDate birth){
		this.id = id;
		this.name = name;
		this.birth = birth;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirth() {
		return birth;
	}
	
}
