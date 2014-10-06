package inconsistentEqualsCompareTO;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author Dilip
 * 
 *         github Profile: https://github.com/satya444
 * 
 */
public class Student implements Comparable<Student> {

	int age;

	Student(int age) {
		this.age = age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.age, o.age);
	}

	public static void main(String args[]) {
		TreeMap<Student, String> ageTreeMap = new TreeMap<>();
		Student s = new Student(10);
		Student s1 = new Student(9);
		Student s2 = new Student(11);
		ageTreeMap.put(s, "ten");
		ageTreeMap.put(s1, "nine");
		ageTreeMap.put(s2, "eleven");
		// This uses CompareTo method so the comparision is based on
		// age.........
		System.out.println(ageTreeMap.get(new Student(9)));
		HashMap<Student, String> ageHashMap = new HashMap<>();
		ageHashMap.put(s, "ten");
		ageHashMap.put(s1, "nine");
		ageHashMap.put(s2, "eleven");
		// This uses equals method for placing in hashMap. so the hashvalue of
		// new object is different. therefore returns null... if we want result
		// to be based on age then we should overwrite equals method
		System.out.println(ageHashMap.get(new Student(9)));
	}

}
