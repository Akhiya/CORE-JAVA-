import java.util.Scanner;

class Essentials
{
  public static void getEssentials()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------Daily Care products-------");
		
		int p1=1999;String n1="Loreal";
		System.out.println("1.Loreal Skin Care Kit				Rate=Rs 1999");
		
		int p2=4500;String n2="TRESemme";
		System.out.println("2. TRESemme Hair Care Kit				Rate=Rs 4500");
		
		int p3=999;String n3="Dove";
		System.out.println("3. Dove Bath & Shower Kit				Rate=Rs 999");
		
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
                  getEssentials();
                  break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again...");
		   getEssentials();
	   }
  }
}
