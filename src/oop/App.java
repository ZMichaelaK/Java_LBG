package oop;

public class App {

	public static void main(String[] args) {
		Person pep = new Person();
		pep.name = "Michaela";
		pep.age = 30;
		pep.profession = "soft dev";

		Person pep2 = new Person();
		pep2.name = "Maria";
		pep2.age = 40;
		pep2.profession = "bbsttr";

		Person[] people = { pep, pep2 };

		for (Person person : people) {
			person.introduction();
		}
	}
}
