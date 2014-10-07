package anonymousclasses;

/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */
public class AnonymousClassTest {

	interface HelloWorld{
		public void greet();
	}
	/**
	 * THE METHOD INSIDE WHICH WE HAVE ANONYMOUS IMPLEMENTATION FOR INTERFACE
	 */
	public void sayHello(){
		HelloWorld hw= new HelloWorld(){
			public void greet(){
				System.out.println("Inside implemented greet");
			}
		};
		hw.greet();
	}
	public static void main(String args[]){
		AnonymousClassTest act= new AnonymousClassTest();
		act.sayHello();
	}
}
