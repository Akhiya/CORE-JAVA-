import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

class Carts 
{
	static ArrayList al=new ArrayList();
	public static void getCarts(int p,String n)
	{
		Scanner scan=new Scanner(System.in);
		int Qty=0;
		System.out.println("Enter the no: of Quantity");
		System.err.println();
		Qty=scan.nextInt();
		System.out.println(Qty+" items added to cart");
		System.out.println();
		System.out.println("Continue Payment? Y/N");
		System.out.println();
		char choice=scan.next().charAt(0);
		if (choice=='y'|| choice=='Y')
		{
			System.out.println("Items Added");
		
		}
		else if(choice=='n'|| choice=='N')
		{
			HomePage.getMainPage();
		}
		else
		{
			System.out.println("---Choose the Valid Input---");
			System.out.println();
			viewCart();
		}

		System.out.println();
		al.add(n);
		al.add(Qty);
		al.add(p);
		viewBill();
	}

	public static void viewBill()
	{
		if (al.size() == 0) {
			System.out.println("\n");
			System.out.println("\n                    No item is purchesed to bill");
			System.out.println("                          purchase something.!");
		}
		System.out.println("\n\n\n\n\n\n");
		if (al.size() > 0) {
			int total = 0;
			int Qty = 0;
			System.out.println("				***********  Bill   ************");
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			Date date = new Date();
			SimpleDateFormat ft = new SimpleDateFormat(
					"E dd.MM.YYYY '                                             ' hh:mm:ss a zzz");
			System.out.println(ft.format(date));
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.printf("%-8s %-40s %-8s %-8s %-9s\n", "SI.No", "Item", "Cost", "Qty", "\tTotal");
			System.out.println();
			int j = 1;
			for (int i = 0; i < al.size(); i++) {
				int t1 = (int) al.get(i + 1);
				int t2 = (int) al.get(i + 2);

				total += (t1 * t2);
				Qty += t1;
//				System.out.println(j);
//				System.out.println(al.get(i));
//				System.out.println(al.get(i+2));
//				System.out.println(al.get(i+1));
				System.out.printf("%-8s %-40s %-8s %-8s\t %-8s\n", (j), al.get(i), al.get(i + 2), al.get(i + 1),
						(t1 * t2));
				i++;
				i++;
				j++;
			}
			float cgst = total * (9 / 100f);
			float sgst = total * (9 / 100f);
			System.out.println();
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.printf("%s %-47s %s", "Total Qty:", "", Qty);
			System.out.println();
			System.out.printf("%s %-61s %s", "Sub Total:", "", total);
			System.out.println();
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.printf("%s %-57s %s", "CGST 	  @9%:", "\t", cgst);
			System.out.println();
			System.out.printf("%s %-57s %s", "SGST 	  @9%:", "\t", sgst);
			System.out.println();
			System.out.printf("%s %-56s  %s", "Total GST@18%:", "\t", cgst + sgst);
			System.out.println();
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.printf("%s %-53s  \t%s", " Grand Total:", "", (float) (total + sgst + cgst) + " " + "Rs");
			System.out.println();
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println("                                  Thank you for visiting *ONLINE SHOPPING*");
			System.out.println("                                 		Have a Nice Day !");
			System.out.println("                                    		  Visit again....");
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		} else {
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println();
			System.out.println("         *****          Thank You , Visit Again        *****");
			System.out.println();
			System.out.println(
					"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		}

	}



	public static void viewCart() {
		Scanner sc = new Scanner(System.in);
		if (al.size() > 0) {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.printf("%-8s| %-40s |%-8s |%-8s  |%-8s\n", "SI.No", "Item", "Cost Rs", "Qty", "Total");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println();
			int j = 1;
			for (int i = 0; i < al.size(); i++) {
				int t1 = (int) al.get(i + 1);
				int t2 = (int) al.get(i + 2);

				System.out.printf("%-8s| %-40s |%-8s |%-8s  |%-8s\n", (j), al.get(i), al.get(i + 2), al.get(i + 1),
						(t1 * t2));
				i++;
				i++;
				j++;
			}	
			System.out.println();
			System.out.println("Do you want to remove from Cart? Y/N");
			char choice = sc.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				System.out.println("\n");
				removeCart();
			} else if (choice == 'N' || choice == 'n') {
				HomePage.getMainPage();
			} else {
				System.out.println("\n\n");
				System.out.println("Enter the valid input");
				System.out.println();
				viewCart();
			}
		} else {
			System.out.println("0 item in the Cart");
			System.out.println();
			System.out.println(" your cart is empty..! please add something to Cart.");
			System.out.println("---------------------------------------------------------------------------");
			Exit.getExit();
		}
		System.out.println("\n");
	}


	public static void removeCart() {
		if (al.size() == 0) {
			System.out.println(" your cart is empty.! add something to cart..");
			System.out.println("--------------------------------------------------------------------");
			Exit.getExit();
			return;
		}
		int count = al.size() / 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the SI.No of item to be removed");
		try {
			int choice = sc.nextInt();
			if (choice <= count && choice > 0) {
				choice = (choice - 1) * 3;
				al.remove(choice);
				al.remove(choice);
				al.remove(choice);
				System.out.println("Successfully removed");
				HomePage.getMainPage();
			} else {
				System.out.println("\n");
				System.out.println("Enter a valid input");
				System.out.println();
				System.out.println("Do you want to go Home page OR Remove items Y/N");
				char choice2 = sc.next().charAt(0);
				if (choice2 == 'Y' || choice2 == 'y') {
					System.out.println("\n");
					HomePage.getMainPage();
				} else if (choice2 == 'N' || choice2 == 'n') {
					removeCart();
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("\n");
			System.out.println("Enter a valid input");
			System.out.println();
			removeCart();
		}
	}
}


