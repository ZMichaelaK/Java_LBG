package oop;

public class App {

	public static void main(String[] args) {

		Person pep = new Person("Michaela", 30, "Soft Dev");

		Person pep3 = new Person("Mark", 34, "Soft Dev");

		Person pep2 = new Person();
		pep2.setName("Maria");
		pep2.setAge(40);
		pep2.setProfession("bbsttr");

		Person[] people = { pep, pep2, pep3 };

		for (Person person : people) {
			person.introduction();
			person.getAge();
		}
//		pep.setAge(pep.getAge() + 1);
	}
}
