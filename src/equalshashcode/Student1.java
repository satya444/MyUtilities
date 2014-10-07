package equalshashcode;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Dilip
 * 
 *         github Profile: https://github.com/satya444
 * 
 */
public class Student1 {
	String fName;
	String lName;
	int id;

	Student1(String fName, String lName, int id) {
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
		Student1 s = (Student1) o;
		if (this.fName.equals(s.fName) && this.lName.equals(s.lName)
				&& this.id == s.id) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int primeNo = 37;
		return primeNo * fName.hashCode() + primeNo * lName.hashCode();

	}

	public static void main(String args[]) {
		Student1 s = new Student1("satya", "raghava", 44);
		Student1 s1 = new Student1("satya", "raghava", 44);
		HashSet<Student1> hset = new HashSet<>();
		hset.add(s);
		hset.add(s1);
		// since equals method is overridden the result is true
		System.out.println(s1.equals(s));
		// since hashcode is overridden we have only one element in the hashset
		// which is the expected behavior
		Iterator<Student1> itr = hset.iterator();
		while (itr.hasNext()) {
			Student1 stemp = itr.next();
			System.out
					.println(stemp.fName + " " + stemp.lName + " " + stemp.id);
		}
	}
}
