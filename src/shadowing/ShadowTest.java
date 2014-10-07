package shadowing;

/**
 * @author Dilip
 *
 * github Profile: https://github.com/satya444
 *
 */
public class ShadowTest {

	int x=0;
	class innerClass{
		int x=10;
		public void test(int x){
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(ShadowTest.this.x);
		}
	}
	public static void main(String args[]){
		ShadowTest st = new ShadowTest();
		innerClass ic= st.new innerClass();
		ic.test(25);
	}
}
