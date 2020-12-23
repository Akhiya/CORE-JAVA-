import java.util.Scanner;

class Clothing 
{
   public static void getClothing()
   {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("-----Men's Clothing-----");
	   System.out.println("1.T-Shirts");
	   System.out.println("2.Jeans");
	   System.out.println("3.Sportswear");
	   System.out.println("4.Home page");
	   System.out.println("5.Exit");
	   try {
		   int choice=scan.nextInt();
		   switch(choice)
		   {
		   case 1:TShirts.getTShirts();
	              break;
	       case 2:Jeans.getJeans();
                  break; 
	       case 3:SportsWear.getSportsWear();
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
		   System.out.println("Try again in clothing....");
	       getClothing();
	   }
   }
}
