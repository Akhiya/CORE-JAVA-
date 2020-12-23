
import java.util.Scanner;

class SportsWear
{
  public static void getSportsWear()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------SportsWear-------");
		
		int p1= 769;String n1="FastColors";
		System.out.println("1. FastColors Track Suit				Rate=Rs 769");
		
		int p2=599;String n2="Maniac";
		System.out.println("2.Maniac				Rate=Rs 599");
		
		int p3=549;String n3="Tripr";
		System.out.println("3. Tripr				Rate=Rs 549");
		
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
                 getSportsWear();
                  break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again...");
		   getSportsWear();
	   }
  }
}
