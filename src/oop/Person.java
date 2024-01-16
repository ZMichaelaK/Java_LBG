package oop;

public class Person {

	private String name;
	private int age;
	private String profession;

	public Person(String name, int age, String profession) {
		setName(name);
		setAge(age);
		setProfession(profession);

	}

	public Person(String name) {
		this.name = name;
	}

	public Person() {

	}

	public void introduction() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(profession);
	}

	public void setAge(int age) {
		if (age >= 0 && age < 110) {
			this.age = age;
		} else {
			System.out.println("Thats not accurate! Please provide an age between 0 and 110");
		}
	}

	public int getAge() {
		return this.age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
