import java.util.Scanner;

class TShirts 
{
  public static void getTShirts()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("---Men's T-Shirts---");
	  int p1=500;String n1="Roadster";
	  System.out.println("1.Roadster---500Rs");
	  int p2=684;String n2="Allen Solly";
	  System.out.println("2.Allen Solly---684Rs");
	  int p3=593;String n3="Reebok";
	  System.out.println("3.Reebok---593Rs");
	  int p4=647;String n4="Adidas";
	  System.out.println("4.Adidas---647Rs");
	  int p5=2099;String n5="Tommy Hilfiger";
	  System.out.println("5.Tommy Hilfiger---2099Rs");
	  System.out.println("6.Home page");
	  System.out.println("7.Exit");
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
		   case 4:Carts.getCarts(p4,n4);
	              break;
		   case 5:Carts.getCarts(p5,n5);
                  break;
		   case 6:HomePage.getMainPage();
                  break;
           case 7:Exit.getExit();
                  break; 
           default:System.out.println("Select any choice..Try again");
                   getTShirts();
                  break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again in t-shirts...");
		   getTShirts();
	   }
  }
}
