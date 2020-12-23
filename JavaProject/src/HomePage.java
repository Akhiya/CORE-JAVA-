import java.util.Scanner;

class HomePage 
{
  public static void getMainPage()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("------Select Category------");
	  System.out.println("1.Fashion");
	  System.out.println("2.Mobiles");
	  System.out.println("3.Beauty");
	  System.out.println("4.Appliances");
	  System.out.println("5.View Cart");
	  System.out.println("6.Exit");
	  try
	  {
		  int choice =scan.nextInt();
		  switch(choice)
		  {
		  case 1:Fashion.getFashion();
		         break;
		  case 2:Mobiles.getMobiles();
	             break; 
		  case 3:Beauty.getBeauty();
                 break;
		  case 4:Appliances.getAppliances();
                 break;  
		  case 5:Carts.viewCart();
                 break;
		  case 6:Exit.getExit();
                 break;  
          default:System.out.println("Choose any option...Try Again.."); 
                  getMainPage();
                  break;
		  } 
	  }
	 catch(Exception e)
	  {
		 System.out.println("Try again in home page...");
	     getMainPage();
	  }
	
  }
}
