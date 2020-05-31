package cz.spsejecna.vanecek;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Paper type :A");
		int type = sc.nextInt();

		
		Paper p = Paper.factory(type);
		System.out.println("Paper type :A" + type);
		System.out.println(p);

	}

}
