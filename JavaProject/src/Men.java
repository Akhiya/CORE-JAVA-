import java.util.Scanner;

class Men 
{
  public static void getMen()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("------Men's Fashion------");
	  System.out.println("1.Clothing");
	  System.out.println("2.Footwear");
	  System.out.println("3.Accessories");
	  System.out.println("4.Home page");
	  System.out.println("5.Exit");
	  try {
		  int choice=scan.nextInt();
		  switch(choice)
		  {
		  case 1:Clothing.getClothing();
		         break;
		  case 2:FootWear.getFootWear();
	             break;
		  case 3:Accessories.getAccessories();
	             break; 
		  case 4:HomePage.getMainPage();
                 break;  
	      case 5:Exit.getExit();
                 break; 
          default:System.out.println("Select any choice..Try again");
                 break;       
		  }
	  }
	  catch(Exception e)
	  {
		  System.out.println("Try again in mens...");
	      getMen();
	  }
  }
}
