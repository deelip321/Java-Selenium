package stringsExample;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str="Automation Testing";
		String str1="automation testing";
		
		int count=str.length();
		System.out.println(count);
		
		char ch=str.charAt(4);
		System.out.println(ch);
		
		String uppercaseString=str.toUpperCase();
		System.out.println(uppercaseString);
		
		String lowerCaseString=str.toLowerCase();
		System.out.println(lowerCaseString);
		
		String replacedstring=str.replace("Testing", "Training");
		System.out.println(replacedstring);
		
		int firstindex=str.indexOf("t");
		System.out.println(firstindex);//2
		
		int secondIndex=str.indexOf("t", firstindex+1);
		System.out.println(secondIndex);
		
		boolean result=str.equals(str1);
		System.out.println(result);
		
		boolean result2=str.equalsIgnoreCase(str1);
		System.out.println(result2);
		
	
		
		
		
		
		
		
		
	}

}
