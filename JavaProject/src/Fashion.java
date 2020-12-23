import java.util.Scanner;

class Fashion 
{
  public static void getFashion()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------Fashions-------");
	  System.out.println("Choose any...");
	  System.out.println("1.Men");
	  System.out.println("2.Women");
	  System.out.println("3.Home page");
	  System.out.println("4.Exit");
	  try {
	  int choice=scan.nextInt();
	  switch(choice)
	  {
	  case 1:Men.getMen();
	         break;
	  case 2:Women.getWomen();
             break;  
	  case 3:HomePage.getMainPage();
             break;  
	  case 4:Exit.getExit();
             break; 
      default:System.out.println("Select any choice..Try again");
             break;
	  }
	  }
	  catch(Exception e)
	  {
		  System.out.println("Try Again in fashion....");
	      getFashion();
	  }
  }
}
