package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	String name;
	int id;
	transient long ssn;
	Employee(String name, int id, long ssn){
		this.name=name;
		this.id=id;
		this.ssn=ssn;
	}

	public static void main(String args[]){
		try {
			//serialization part
			FileOutputStream fs= new FileOutputStream(new File("E:\\Project\\MyUtilities\\MyUtilities\\src\\serialization\\empdetails.txt"));
			ObjectOutputStream oos= new ObjectOutputStream(fs);
			Employee e = new Employee("satya",1 , 123456);
			oos.writeObject(e);
			oos.close();
			fs.close();
			
			//deserialization part
			FileInputStream fis = new FileInputStream(new File("E:\\Project\\MyUtilities\\MyUtilities\\src\\serialization\\empdetails.txt"));
			@SuppressWarnings("resource")
			ObjectInputStream ois= new ObjectInputStream(fis);
			Employee e1= (Employee)ois.readObject();
			System.out.println(e1.name);
			System.out.println(e1.id);
			System.out.println(e1.ssn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
