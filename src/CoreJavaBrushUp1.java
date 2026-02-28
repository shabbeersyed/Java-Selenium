
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5; // primitive data type
		String name = "Shabbeer Basha Syed"; //non primitive data type
		char letter = 'r';
		double dec1 = 2.33;
		boolean myCard = true;
	
		System.out.println("Hello World");
		System.out.println(dec1);
		System.out.println(name+" is a guy" );
		
		//Arrays - They can store multiple values in a variable
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 1;
	
		
		
		System.out.println(arr[0]);
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = {1,2,3,4,5};
		for( int i =0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		//String Array
		String[] name1 = {"Shabbeer", "Basha"};
		
		//Enhanced for loop
		for(String s: name1) {
			System.out.println(s);
		}
		
		
	}

}
