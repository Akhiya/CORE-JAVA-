import java.util.Scanner;

class Fragrances
{
  public static void getFragrances()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------Fragrances-------");
		
		int p1=500;String n1=" Wild Stone";
		System.out.println("1. Wild Stone				Rate=Rs 500");
		
		int p2=450;String n2="Park Avenue";
		System.out.println("2. Park Avenue				Rate=Rs 450");
		
		int p3=550;String n3="Jaguar";
		System.out.println("3. Jaguar				Rate=Rs 550");
		
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
                  getFragrances();
                  break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again...");
		   getFragrances();
	   }
  }
}
