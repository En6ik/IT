package cz.spsejecna.vanecek.rectangle;

public class Triangle
{
	float a, b, c;
	

	public float Surface() {
		return a*b*c;
	}
	
	public float Ambit() {
		return a+b+c;
	}

	
	
	//Factories
	public static Triangle factory(float a, float b, float c) throws Exception
	{
		if((a+b) > c && (a+c)>b && (b+c) > a && a > 0 && b > 0 && c>0) {
			
		if(a == b && b == c)
			return new Triangle(a,b,c);
		
		if(a==b&&b != c || b == c && a != b || c == a && b != a)
			return new Triangle(a,b,c);
		
		
		}
			throw new Exception();
		
	 
			
		
		

		
		
			
	}
	private Triangle(float sa , float sb , float sc) {
		a = sa;
		b = sb;
		c = sc;
	}
	public String toString() {
		
		return  a + " " + b + " " + c ;
		
		
		
	}
	
	/*public static Triangle factory(float wid, float hei)
	{

		if (wid < 0 || hei < 0) {
			Error();
			return null;
		}
		else
			return new Triangle(wid,hei);
		
			

	}

	public static Triangle factory(float square)
	{
		
		if (square < 0) {
			
			Error();
			return null;
		}
		else
			return new Triangle(square,square);
		

		
	}

	//Constructors
	
	private Triangle(float wid, float hei)
	{
		
			w = wid;
			h = hei;
		
	}


	public String toString() {
		if(square != 0)
			return Float.toString(square);
		else if(w != 0&&h!=0)
			return Float.toString(w) + " " + Float.toString(h);
		
		return "";
		
		
		
	}
	
	private static void Error() {
		System.err.println("Size can not be negative!");

	
	}*/
	

}
	

