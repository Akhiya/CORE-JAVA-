
import java.util.Scanner;

class Women
{
  public static void getWomen()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("------Women's Fashion------");
	  System.out.println("1.Clothing");
	  System.out.println("2.Footwear");
	  System.out.println("3.Accessories");
	  System.out.println("4.Beauty"); 
	  System.out.println("5.Home page");
	  System.out.println("6.Exit");
	  try {
		  int choice=scan.nextInt();
		  switch(choice)
		  {
		  case 1:Clothing.getClothing();
		         break;
		  case 2:GirlsFootWear.getGirlsFootWear();
	             break;
		  case 3:GirlsAccessories.getGirlsAccessories();
	             break;
		  case 5:HomePage.getMainPage();
                 break;  
	      case 6:Exit.getExit();
                 break; 
          default:System.out.println("Select any choice..Try again");
                 break;       
		  }
	  }
	  catch(Exception e)
	  {
		  System.out.println("Try again in mens...");
	      getWomen();
	  }
  }
}
