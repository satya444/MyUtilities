package equalshashcode;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */
/**
 * Program demonstrates overwriting Equals and the problem that occurs when we
 * donot overwrite hashcode method
 */
public class Student {
	String fName;
	String lName;
	int id;

	Student(String fName, String lName, int id) {
		this.fName = fName;
		this.lName = lName;
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Student s = (Student) o;
		if (this.fName.equals(s.fName) && this.lName.equals(s.lName)
				&& this.id == s.id) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Student s = new Student("satya", "raghava", 44);
		Student s1 = new Student("satya", "raghava", 44);
		HashSet<Student> hset = new HashSet<>();
		hset.add(s);
		hset.add(s1);
		// since equals method is overridden the result is true
		System.out.println(s1.equals(s));
		Iterator<Student> itr = hset.iterator();
		// since hashcode is not overridden we have them as 2 different objects
		// which is not expected behavior
		while (itr.hasNext()) {
			Student stemp = itr.next();
			System.out
					.println(stemp.fName + " " + stemp.lName + " " + stemp.id);
		}
	}
}
