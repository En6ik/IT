package cz.spsejecna.vanecek;
import java.util.Random;

public class Main {
	public static void main(String args[]) {
		Heap h1 = new Heap();
		h1.size2 = 10;
		Random rng = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< h1.size2 ; i++) {
			int temp = rng.nextInt(200)+100;
			h1.insert(temp);		
		}
		System.out.println(h1);
		System.out.println("Array size: " +h1.size());	
		System.out.println("Smallest number: "+ h1.min());
		for(int i = 0; i< h1.size2 ; i++) {
			sb.append(h1.extractMin() + ", ");
		}
		System.out.println("Sorted array: " +sb);
		
	}
}