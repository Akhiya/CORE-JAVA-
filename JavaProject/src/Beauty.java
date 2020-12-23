import java.util.Scanner;

class Beauty
{
  public static void getBeauty()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------Beauty & Grooming-------");
	  System.out.println("Choose any...");
	  System.out.println("1.Men's Grooming");
	  System.out.println("2.Daily Essentials");
	  System.out.println("3.Fragrances");
	  System.out.println("4.Home page");
	  System.out.println("5.Exit");
	  try {
	  int choice=scan.nextInt();
	  switch(choice)
	  {
	  case 1:Grooming.getGrooming();
	         break;
	  case 2:Essentials.getEssentials();
             break; 
	  case 3:Fragrances.getFragrances();
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
		  System.out.println("Try Again in fashion....");
	      getBeauty();
	  }
  }
}
