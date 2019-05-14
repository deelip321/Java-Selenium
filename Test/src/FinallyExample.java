
public class FinallyExample {

	public static void main(String[] args) {

		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException npe) {
			System.out.println(npe.getMessage());
		} finally {
			System.out.println("I am last line of the prog");
		}
	}
}
