
import java.util.Scanner;

class EthinicWear
{
  public static void getEthinicWear()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------SportsWear-------");
		
		int p1= 5969;String n1="Gown";
		System.out.println("1. Kedar Fab Gown				Rate=Rs 5969");
		
		int p2=845;String n2="Kurta";
		System.out.println("2.Biba Kurtas				Rate=Rs 845");
		
		int p3=6999;String n3="Saree";
		System.out.println("3. Banarasi Saree				Rate=Rs 6999");
		
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
                 getEthinicWear();
                  break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again...");
		   getEthinicWear();
	   }
  }
}
