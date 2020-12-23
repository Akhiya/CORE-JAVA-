import java.util.Scanner;

class Jeans
{
  public static void getJeans()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------Fragrances-------");
		
		int p1=1169;String n1="Peter England";
		System.out.println("1. Peter England				Rate=Rs 1169");
		
		int p2=1559;String n2="Wrangler";
		System.out.println("2. Wrangler				Rate=Rs 1559");
		
		int p3=1249;String n3="Killer";
		System.out.println("3. Killer				Rate=Rs 1249");
		
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
                 getJeans();
                  break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again...");
		   getJeans();
	   }
  }
}
