import java.util.Scanner;

public class Geometry {
    public static double obsahKruhu(double r) {
        return Math.PI * r * r;
    }

    public static double obsahCtverce(double length, double width) {
        return length * width;
    }

    public static double obsahTroju(double base, double h) {
        return base * h * 0.5;
    }
    public void vypocetKruhu() {

        double r = 0;
       
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the circle's radius? ");
     
        try {
            r = sc.nextDouble();
            }
            catch(Exception e) {
            	sc = new Scanner(System.in);
            }
      
        while(r<=0) {
        System.out.println("Not valid!");
        try {
        	System.out.println("Try again!");
        	r = sc.nextDouble();
        }
        catch(Exception e) {
        	sc = new Scanner(System.in);
        }
        }
        System.out.println("The circle's area is " + Geometry.obsahKruhu(r));
        
    }
    public void vypocetCtverce() {
        double length = 0;
        double width = 0;

        Scanner sc = new Scanner(System.in);
 try {
        System.out.print("Enter length? ");
       
        length = sc.nextDouble();
   
        System.out.print("Enter width? ");
        width = sc.nextDouble();
 }
 catch(Exception e) {
	 sc = new Scanner(System.in);
 }
 while(length <=0 || width <=0) {
	 System.out.println("Not Valid!");
	 try {
		 System.out.println("Try again! The first is length the second one width!");
		 length = sc.nextDouble();
		 width = sc.nextDouble();
	 }catch(Exception e) {
		 sc = new Scanner(System.in);
	 }
 }
        System.out.println("The rectangle's area is " + Geometry.obsahCtverce(length, width));
    }
    public void vypocetTroju() {

        double zaklad = 0;
        double height =0;
        
        Scanner sc = new Scanner(System.in);

        try {
        	System.out.print("Enter length of the base? ");
            zaklad = sc.nextDouble();

            System.out.print("Enter height? ");
            height = sc.nextDouble();

     }
     catch(Exception e) {
    	 sc = new Scanner(System.in);
     }
     while(zaklad <=0 || height <=0) {
    	 System.out.println("Not Valid!");
    	 try {
    		 System.out.println("Try again! The first is base the second one height!");
    		 zaklad = sc.nextDouble();
    		 height = sc.nextDouble();
    	 }catch(Exception e) {
    		 sc = new Scanner(System.in);
    	 }
     }

        System.out.println("The triangle's area is " + Geometry.obsahTroju(zaklad, height));
    }
}
