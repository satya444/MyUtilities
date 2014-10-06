package comparable;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */
public class Student implements Comparable<Student>{

	int id;
	String name;
	int age;
	Student(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.age, o.age);
	}
	
	public static void main(String args[]){
		Student s = new Student(1, "abc", 10);
		Student s1= new Student(2, "pqr", 9);
		Student s2= new Student(3, "xyz", 11);
		List<Student> l= new LinkedList<>();
		l.add(s);
		l.add(s1);
		l.add(s2);
		Collections.sort(l);
		Iterator<Student> itr= l.iterator();
		while(itr.hasNext()){
			Student stemp= itr.next();
			System.out.println(stemp.id+" "+stemp.name+" "+stemp.age);
		}
	}

}
