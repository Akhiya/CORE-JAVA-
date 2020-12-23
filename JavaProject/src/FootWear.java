
import java.util.Scanner;

class FootWear
{
  public static void getFootWear()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------FootWear-------");
		
		int p1=599;String n1="Sparx";
		System.out.println("1. Sparx Slides				Rate=Rs 599");
		
		int p2=438;String n2="ZebX";
		System.out.println("2. ZebX				Rate=Rs 438");
		
		int p3=999;String n3="Lancer";
		System.out.println("3. Running Shoes				Rate=Rs 999");
		
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
                 getFootWear();
                  break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again...");
		   getFootWear();
	   }
  }
}
