
import java.util.Scanner;

class Accessories
{
  public static void getAccessories()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------Accessories-------");
		
		int p1=6650;String n1="Titan";
		System.out.println("1. Titan Watch			Rate=Rs 6650");
		
		int p2=6999;String n2="Ray-Ban";
		System.out.println("2. Ray-Ban			Rate=Rs 6999");
		
		int p3=2599;String n3="Roadster";
		System.out.println("3. Roadster Back Pack			Rate=Rs 2599");
		
	  System.out.println("4.Home page");
	  System.out.println("5.Exit");
	  try {
		   int choice=scan.nextInt();
		   switch(choice)
		   {
		   case 1:Carts.getCarts(p1,n1);
		          break;
		   case 2:Carts.getCarts(p2,n2);
	              break;
		   case 3:Carts.getCarts(p3,n3);
	              break;     
		   case 4:HomePage.getMainPage();
                 break;
           case 5:Exit.getExit();
                 break; 
          default:System.out.println("Select any choice..Try again");
                 getAccessories();
                  break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again...");
		   getAccessories();
	   }
  }
}
