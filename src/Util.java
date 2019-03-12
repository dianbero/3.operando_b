public class Util {
	
	public static void main(String[]args) {
		
		int num1 = 6;
		int num2 = 8;
		
		suma(num1, num2);
		multiplicar(num1, num2);
		
	}

	public static void suma(int num1, int num2) {
		
		System.out.println("Suma");
		
		System.out.println(num1+num2);

	}
	
	public static void multiplicar(int num1, int num2) {
		
		System.out.println(num1+"x"+num2+"="+(num1*num2));
		
	}
	
}
