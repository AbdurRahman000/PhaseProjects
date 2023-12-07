
package CameraRental.utility;
import java.util.Scanner;
import CameraRental.Service.CameraService;
import CameraRental.Store.MyStore;
import CameraRental.MyStoreService.StoreService;
import CameraRental.Rent.RentalAndBalance;
public class CameraRentalUtility {
	static Scanner sc=new Scanner(System.in);
	public static void login() {	
System.out.println("Enter your Email ID and password");
String email=sc.next();
String pass=sc.next();
if(email.equals("abdurrahman@gmail.com")&&pass.equals("abc123"))
{
	System.out.println("Login Successful");
	mainOption();
}
else
{
System.out.println("Login Unsuccessfull");
}
	}

	private static void mainOption() {
		Scanner sc=new Scanner(System.in);
		int choice;
		String con="";
		do {
			System.out.println("1:MY CAMERA");
			System.out.println("2:RENT CAMERA");
			System.out.println("3:VIEW ALL CAMERA");
			System.out.println("4:MY WALLET");
			System.out.println("5:EXIT");
			choice=sc.nextInt();
			switch(choice) {
			case 1:SubmenuOption();
				break;
			case 2:
				StoreService p=new StoreService();
				p.AddCamera();
				p.viewAllCamera();
				RentalAndBalance r=new RentalAndBalance();
			r.viewCamera();
			r.rent();
				break;
			case 3:StoreService m=new StoreService();
			m.AddCamera();
			m.viewAllCamera();
				break;
			case 4:RentalAndBalance rr=new RentalAndBalance();
			rr.viewBalance();
			rr.addAmount();
			
				break;
			case 5:System.out.println("THANK YOU FOR VISITING");
			login();
				break;
				default:
					System.out.println("Wrong Choice");
					break;
			}
			System.out.println("Do you want to continue(y/n)");
			con=sc.next();
		}while(con.equalsIgnoreCase("y"));
	}
	private static void SubmenuOption() {
		Scanner sc=new Scanner(System.in);
		CameraService cs=new CameraService();
		int choice;
		String con="";
		do {
			System.out.println("1:ADD CAMERA");
			System.out.println("2:REMOVE");
			System.out.println("3:VIEW MY CAMERA");
			System.out.println("4:GO TO PREVIOUS MENU");
			choice=sc.nextInt();
			switch(choice) {
			case 1:cs.addCamera();
			System.out.println("Camera successfully  Added");
				break;
			case 2:cs.removeCamera();
			
				break;
			case 3:cs.viewAllCamera();
				break;
			case 4:
				mainOption();
				break;
				default:
					System.out.println("Wrong Choice");
					break;
			}
			System.out.println("Do you want to continue(y/n)");
			con=sc.next();
		}while(con.equalsIgnoreCase("y"));
	}
}
