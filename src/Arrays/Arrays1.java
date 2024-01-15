package Arrays;

public class Arrays1 {
	
	public static void main(String[] args) {
		int num = 0;
		//creates a blank array 10 long
		int[] nums = new int[10];
		
		System.out.println("9:" + nums[9]);
		//can't really print out arrays directly

		nums[3] = 17;
		for(int i = 0; i < nums.length; i++)
			System.out.println("I: " + i + "Num: " + nums[i]);
		}
	
		//String[] words = new String[5];	
		String[] words = {"Jordan"};
		for (int i = 0; i < words.length; i++) 
			System.out.println("I: " + i + "WORD: " + words[i]);
}
