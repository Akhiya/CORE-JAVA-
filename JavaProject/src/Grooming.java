import java.util.Scanner;

class Grooming
{
  public static void getGrooming()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------Mens Grooming-------");
		
		int p1=500;String n1=" God Father Beardo";
		System.out.println("1. God Father Beard oil				Rate=Rs 500");
		
		int p2=450;String n2="Gillete";
		System.out.println("2. Gillete Shaving Cartridges				Rate=Rs 450");
		
		int p3=430;String n3="Avon Anew";
		System.out.println("3. Avon Anew Face cream				Rate=Rs 430");
		
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
                  getGrooming();
                 break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again...");
		   getGrooming();
	   }
  }
}
