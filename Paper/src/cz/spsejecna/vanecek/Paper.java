package cz.spsejecna.vanecek;

public class Paper
{
	private float width;
	private float height;
	
	public static Paper factoryAO() {
		return new Paper(841,1189);
		
	}
	public static Paper factoryA1() {
		return new Paper(594,841);
		
	}
	public static Paper factoryA2() {
		return new Paper(420,594);
		
	}
	public static Paper factoryA3() {
		return new Paper(297,420);
		
	}
	public static Paper factoryA4() {
		return new Paper(210,297);
		
	}
	public static Paper factoryA5() {
		return new Paper(148,210);
		
	}
	public static Paper factory(int size) {
		switch(size) {
		case 0:
			return new Paper(841,1189);
			
			
		case 1:
			return new Paper(594,841);
			
		case 2:
			return new Paper(420,594);
			
		case 3:
			return new Paper(297,420);
		}
		return null;
		
	}
	private Paper(int wid,int hei) 
	{
		width = wid;
		height = hei;
	}
	public String toString() {
		return Float.toString(width) + " "+Float.toString(height);
	}
	
}
