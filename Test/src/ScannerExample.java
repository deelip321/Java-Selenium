import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine();
		int count=name.length();
		System.out.println("Total no of chars in your name is "+count);
		
	}

}
