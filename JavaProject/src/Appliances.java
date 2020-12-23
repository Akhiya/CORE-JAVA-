import java.util.Scanner;

class Appliances
{
  public static void getAppliances()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------Appliances-------");
		
		int p1=60000;String n1="Nokia 43 inch";
		System.out.println("1.Nokia 43 inch 4K UHD Smart TV				Rate=Rs 31,999");
		
		int p2=45000;String n2="Voltas 1.5 Ton AC";
		System.out.println("2. Voltas 1.5 Ton3 Star Split Inverter AC				Rate=Rs 30,999");
		
		int p3=43000;String n3="Samsung Refrigerator";
		System.out.println("3. Samsung 192L Direct Cool Refrigerator				Rate=Rs 15,899");
		
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
                  getAppliances();
                  break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again in t-shirts...");
		   getAppliances();
	   }
  }
}
