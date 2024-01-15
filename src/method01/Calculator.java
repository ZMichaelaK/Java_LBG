package method01;

public class Calculator{

	public static int add(int a, int b) {
	return a + b;
}
	public static int subtract(int a, int b) {
	return a - b;
}
	public static int multiply(int a, int b) {
	return a - b;
}
	public static double divide(int a, int b) {
	return a / b;
}
	public static void main(String[] args) {
	System.out.println("The sum is.. " + add(13,2));
	System.out.println("The substraction is.. " + subtract(19,2));
	System.out.println("The multiplication is.. " + multiply(19,2));
	System.out.println("The division is.. " + divide(19,2));
}
}