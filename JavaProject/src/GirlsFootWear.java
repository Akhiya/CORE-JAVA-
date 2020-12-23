
import java.util.Scanner;

class GirlsFootWear
{
  public static void getGirlsFootWear()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------FootWear-------");
		
		int p1=599;String n1="Flat Sandal";
		System.out.println("1.Puma Flat Sandal			Rate=Rs 599");
		
		int p2=438;String n2="Pencil Heels";
		System.out.println("2. Beige Heels			Rate=Rs 1599");
		
		int p3=2499;String n3="Reebok Sneakers";
		System.out.println("3. Running Sneakers				Rate=Rs 2499");
		
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
                 getGirlsFootWear();
                  break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again...");
		   getGirlsFootWear();
	   }
  }
}
