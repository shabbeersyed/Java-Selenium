
public class MethodsDemo {

	public static void main(String[] args) {
		
		
		//Why Method - can reuse the methods
		MethodsDemo d = new MethodsDemo();
		d.getData();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 f = new MethodsDemo2();
		f.getUserData();
		getData1();
	}
	//put it in out side the main block
	//If it is changed to static then its a class not object
	public String getData() {
		System.out.println("Hello World");
		return "Shabbeer Basha Syed";
	}
	public static String getData1() {
		System.out.println("Hey world");
		return "Shabbeer";
	}
}
