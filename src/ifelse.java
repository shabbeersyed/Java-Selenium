import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ifelse {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		
		//2,4,6,8,10
		for(int i=0; i<arr.length;i++) {
			if(arr[i] % 2 ==0) {
				System.out.println(arr[i]);
				//Use break if you want to stop the loop
			}
			else {
				System.out.println(arr[2]+ " is not multiple of 2");
			}
		}
		//Creating object of Array list 
		//Arraylist is a class of java
		ArrayList<String> a = new ArrayList<String>();
		a.add("Shabbeer");
		a.add("Basha");
		a.add("Wsup");
		System.out.println(a.get(1))	;
		//create a object of the class - object.method
		//To get the size of a array list we have to use size method if its an array we use length methos
		for(int i =0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("^^^^^^^^^^^");
		for(String val:a) {
			System.out.println(val);
		}
		
		//item is present in the array list
		System.out.println(a.contains("Selenium"));
		
		
		//Converting arrays to array list
		String aaa[] = {"Sha", "Ba", "La"};
		List<String> aaaArrayList = Arrays.asList(aaa);
		
	}

}
