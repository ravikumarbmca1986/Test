import java.util.Arrays;

public class Snippet {
	
	public static void main(String args[]){
		int sum = Arrays.stream(new int[]{1, 2, 3})
				  .filter(i -> i >= 2)
				  .map(i -> i * 3)
				  .sum();
		System.out.println(sum);
	}
	
}