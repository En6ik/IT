import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double intensify = 0d;
		
		Sorcerer sc = new Sorcerer(); 
		Farmer fr = new Farmer(); 
		Knight sol = new Knight(); 
		Archer a = new Archer();
		
		try {
		System.out.println("!!Create a SORCERER!!");
		System.out.println("Now to choose the name:");
		String jmeno = s.nextLine(); 		
		System.out.println("Choose a spell which he will use:");
		String typeOfSpell = s.nextLine();
		System.out.println("And it's intensity?");
		double intense = s.nextDouble();
		System.out.println("Give him some HP!");
		int zivoty = s.nextInt();
		System.out.println("Give him some money!");
		int penize = s.nextInt();
		System.out.println("What is the hight of " + jmeno);
		double vyska = s.nextDouble();
		Sorcerer sc1 = new Sorcerer(jmeno, zivoty, penize,vyska, intense, typeOfSpell);
		Sorcerer sc2 = new Sorcerer(jmeno, zivoty, penize, vyska, intense, typeOfSpell);
		System.out.println("Sorcerer ready for deployment...\n");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("!!Crate a FARMER!!"); 
		System.out.println("How much bread does he have?");
		int bread = s.nextInt();
		System.out.println("What time does it take farmer to set the wheat?");
		int timeToSet = s.nextInt();
		System.out.println("How much wheat does he have?");
		double wheat = s.nextDouble();
		System.out.println("What's his name?");
		String name = s.nextLine()+s.nextLine();
		System.out.println("Give him some HP");
		int liff = s.nextInt();
		System.out.println("What is the hight of "+ name);
		double height = s.nextDouble();
		
		Farmer fr1 = new Farmer(bread,timeToSet,wheat,name,liff,height,(long)Math.random()*210012);
		Farmer fr2 = new Farmer(bread,timeToSet,wheat,name,liff,height,(long)Math.random()*210012);
		System.out.println("Farmers created...\n");
		
		System.out.println("CREATING KNIGHTS"); //public Knight(String jmeno, int life, double hight, long money,String weapon) {
		System.out.println("Choose the name of the knights");
		String eman = s.nextLine()+s.nextLine();
		System.out.println("Choose the LP of knights");
		int live = s.nextInt();
		System.out.println("Choose their hight");
		double heighd = s.nextDouble();
		System.out.println("Choose the weapon they are using");
		String wp = s.nextLine()+s.nextLine();
		System.out.println("Choose the amount of money each knight has");
		long cash = s.nextLong();
		
		Knight k1 = new Knight(eman,live,heighd,cash,wp);
		Knight k2 = new Knight(eman,live,heighd,cash,wp);
		System.out.println("Knights created...\n");
		
		System.out.println("CREATING ARCHERS"); //int numOfArrows,String jmeno, int life, double hight, long money
		System.out.println("Choose the number of arrows each archer has");
		int arrows = s.nextInt();
		System.out.println("Choose their name");
		String mane = s.next();
		System.out.println("Choose the LP each archer has");
		int lp = s.nextInt();
		System.out.println("Choose the height");
		double h = s.nextDouble();
		
		Archer ar1 = new Archer(arrows,mane,lp,h,110549);
		Archer ar2 = new Archer(arrows,mane,lp,h,122549);
		System.out.println("Archers created...\n");
		
		boolean notChanged = (k1.getJmeno().toUpperCase()=="DEFAULT")&&fr.getJmeno().toUpperCase()=="DEFAULT"&&sc.getJmeno().toUpperCase()=="DEFAULT"&&ar1.getJmeno().toUpperCase()=="DEFAULT" ? true : false;
				if(notChanged) 
					System.out.println("Default characters are not changed");
				
		System.out.println("Finished...\n");
		
		List<Postavy> p = new ArrayList<Postavy>();
		p.add(sc1);p.add(sc2);p.add(fr);p.add(fr1);p.add(fr2);p.add(k1);p.add(k2);p.add(ar1);p.add(ar2);
		for(int i = 0;i<p.size();i++){
			System.out.println(p.get(i)+"\r\n");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			s.close();
		}
	}

}
