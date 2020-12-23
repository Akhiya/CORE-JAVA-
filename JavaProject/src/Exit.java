import java.util.InputMismatchException;
import java.util.Scanner;

public class Exit {

	public static void getExit() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to exit?");
		System.out.println("1. Bill");
		System.out.println("2. Home page");
		System.out.println("3. Exit");
		try {
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Carts.viewBill();
				break;
			case 2:
				HomePage.getMainPage();
				break;
			case 3:
				System.out.println("\n\n");
				System.out.println("_____________________________________________________");
				System.out.println("	    ***THANK YOU VISIT AGAIN***");
				System.out.println("_____________________________________________________");
				break;
			default:

				System.out.println("chioce give option... try again!");
				getExit();
				break;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("enter the correct choice in exit page");
			getExit();
		}
	}
}
