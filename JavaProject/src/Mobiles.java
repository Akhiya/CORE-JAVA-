import java.util.Scanner;

class Mobiles
{
  public static void getMobiles()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("--------Mobiles-------");
		
		int p1=60000;String n1=" Apple";
		System.out.println("1. Apple				Rate=Rs 60000");
		
		int p2=45000;String n2=" Samsung";
		System.out.println("2. Samsung				Rate=Rs 45000");
		
		int p3=43000;String n3="Nokia";
		System.out.println("3. Nokia				Rate=Rs 43000");
		
		int p4=25000;String n4=" Moto";
		System.out.println("4. Moto					Rate=Rs 25000");
		
		int p5=10000;String n5=" Lenovo";
		System.out.println("5. Lenovo				Rate=Rs 10000");
		
		int p6=35000;String n6=" Sony";
		System.out.println("6. Sony  				Rate=Rs 35000");
	  System.out.println("7.Home page");
	  System.out.println("8.Exit");
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
		   case 6:Carts.getCarts(p6,n6);
                 break;      
		   case 7:HomePage.getMainPage();
                 break;
           case 8:Exit.getExit();
                 break; 
          default:System.out.println("Select any choice..Try again");
                  getMobiles();
                 break;         
		   }
		   }
	   catch(Exception e)
	   {
		   System.out.println("Try Again in t-shirts...");
		   getMobiles();
	   }
  }
}
