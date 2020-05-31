import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    int choice; 
    Geometry g = new Geometry();

    do {
        
        choice = getMenu();

        if (choice == 1) {
            g.vypocetKruhu();
        } else if (choice == 2) {
            g.vypocetCtverce();
        } else if (choice == 3) {
           g.vypocetTroju();
        } else if (choice == 4) {
            System.out.println("End of calculating");
        }

    } while (choice != 4);
}

public static int getMenu() {

    int choose = 0;
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Geometry Calculator\n");
    System.out.println("1. Calculate the Area of a Circle");
    System.out.println("2. Calculate the Area of a Rectangle");
    System.out.println("3. Calculate the Area of a Triangle");
    System.out.println("4. Quit\n");
    System.out.print("Enter your choice (1-4) : ");

    try {
  	    
        choose = sc.nextInt();
      }
      catch(Exception e){
    	  sc = new Scanner(System.in);
      }
    
    while (choose < 1 || choose > 4) {
        System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
        try {
      	    
            choose = sc.nextInt();
          }
          catch(Exception e){
        	  sc = new Scanner(System.in);
          }
        
    }

    return choose;
}
}