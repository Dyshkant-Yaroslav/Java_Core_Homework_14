package ua.lviv.desctop.min;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<Student> sos = new TreeSet<>();
		sos.add(new Student("Andrew", 20));
		sos.add(new Student("Michael", 21));
		sos.add(new Student("Peter", 26));
		sos.add(new Student("Ivan", 19));
		sos.add(new Student("Shawn", 23));
		// sorted by Comparable
		for (Student student : sos) {
			System.out.println(student);
		}

		System.out.println();
		TreeSet<Student> sos1 = new TreeSet<>(new StudentAgeComparator());
		sos1.add(new Student("Andrew", 20));
		sos1.add(new Student("Michael", 21));
		sos1.add(new Student("Peter", 26));
		sos1.add(new Student("Ivan", 19));
		sos1.add(new Student("Shawn", 23));
		// sorted by Comparator
		for (Student student : sos1) {
			System.out.println(student);
		}

	}

}
