
public class Strings {

	public static void main(String[] args) {
		
		//String literal
		String s4 = "Shabbeer Basha Syed";
		String s1 = "Shabbeer Basha Syed";
		
		
		//new memory allocater
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		String s = "Shabbeer Basha Syed";
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0	]);
		System.out.println(splittedString[1].trim());
		
		//print the char in reverse order
		for(int i = s4.length()-1; i>=0; i--) {
			System.out.println(s4.charAt(i));
		}
	}

}
