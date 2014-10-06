package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;


/**
 * @author Dilip
 * 
 *         github Profile: https://github.com/satya444
 * 
 */
public class Student {

	int id;
	String name;
	int age;

	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public static void main(String args[]){
		Student s = new Student(1, "abc", 10);
		Student s1= new Student(3, "pqr", 9);
		Student s2= new Student(2, "xyz", 11);
		List<Student> l= new LinkedList<>();
		l.add(s);
		l.add(s1);
		l.add(s2);
		Collections.sort(l, new IdComparator());
		Collections.sort(l, new AgeComparator());

		Iterator<Student> itr= l.iterator();
		while(itr.hasNext()){
			Student stemp= itr.next();
			System.out.println(stemp.id+" "+stemp.name+" "+stemp.age);
		}
	}
}
class IdComparator implements Comparator<Student> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.id<o2.id ? -1:1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#reversed()
	 */
	@Override
	public Comparator<Student> reversed() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#thenComparing(java.util.Comparator)
	 */
	@Override
	public Comparator<Student> thenComparing(
			Comparator<? super Student> other) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#thenComparing(java.util.function.Function,
	 * java.util.Comparator)
	 */
	@Override
	public <U> Comparator<Student> thenComparing(
			Function<? super Student, ? extends U> keyExtractor,
			Comparator<? super U> keyComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#thenComparing(java.util.function.Function)
	 */
	@Override
	public <U extends Comparable<? super U>> Comparator<Student> thenComparing(
			Function<? super Student, ? extends U> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.util.Comparator#thenComparingInt(java.util.function.ToIntFunction
	 * )
	 */
	@Override
	public Comparator<Student> thenComparingInt(
			ToIntFunction<? super Student> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.util.Comparator#thenComparingLong(java.util.function.ToLongFunction
	 * )
	 */
	@Override
	public Comparator<Student> thenComparingLong(
			ToLongFunction<? super Student> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#thenComparingDouble(java.util.function.
	 * ToDoubleFunction)
	 */
	@Override
	public Comparator<Student> thenComparingDouble(
			ToDoubleFunction<? super Student> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

}
class AgeComparator implements Comparator<Student>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Student o1, Student o2) {
		return o1.age<o2.age ?-1:1;
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#reversed()
	 */
	@Override
	public Comparator<Student> reversed() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#thenComparing(java.util.Comparator)
	 */
	@Override
	public Comparator<Student> thenComparing(
			Comparator<? super Student> other) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#thenComparing(java.util.function.Function, java.util.Comparator)
	 */
	@Override
	public <U> Comparator<Student> thenComparing(
			Function<? super Student, ? extends U> keyExtractor,
			Comparator<? super U> keyComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#thenComparing(java.util.function.Function)
	 */
	@Override
	public <U extends Comparable<? super U>> Comparator<Student> thenComparing(
			Function<? super Student, ? extends U> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#thenComparingInt(java.util.function.ToIntFunction)
	 */
	@Override
	public Comparator<Student> thenComparingInt(
			ToIntFunction<? super Student> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#thenComparingLong(java.util.function.ToLongFunction)
	 */
	@Override
	public Comparator<Student> thenComparingLong(
			ToLongFunction<? super Student> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#thenComparingDouble(java.util.function.ToDoubleFunction)
	 */
	@Override
	public Comparator<Student> thenComparingDouble(
			ToDoubleFunction<? super Student> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	
}