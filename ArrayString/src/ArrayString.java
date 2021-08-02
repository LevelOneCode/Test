import java.util.Arrays;
public class ArrayString {
	public static void main(String[] args) {
		
		int[] arraydata1= {75,3,55,97,12,46,92,35,71,88};
		String[] arraydata2= {"Red","Green","Yellow","Black","Blue","Brown"};
		System.out.println("Original Value"+ Arrays.toString(arraydata1));
		Arrays.sort(arraydata1);
		System.out.println("Sorted Value"+ Arrays.toString(arraydata1));
		System.out.println("Original Value"+ Arrays.toString(arraydata2));
		Arrays.sort(arraydata2);
		System.out.println("Sorted Value"+ Arrays.toString(arraydata2));
		
	}
}
