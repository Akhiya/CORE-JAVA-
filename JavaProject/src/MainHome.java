import java.util.*;

class MainHome 
{
	public static void main(String args[])
	{
		try {
			System.out.println("Welcome to Online Shopping                   "+new Date( ));
			
			HomePage.getMainPage();
		} 
		catch (Exception e) {
			System.out.println("Got an exception!"); 
		}
	}
}
