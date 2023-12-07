package CameraRental.Rent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import CameraRental.MyStoreService.StoreService;
import CameraRental.Store.MyStore;
import CameraRental.Wallet.bean.Wallet;

public class RentalAndBalance {
	List<MyStore> SelectCamera=new ArrayList<>();
	List<Wallet> balances=new ArrayList<>();
public void viewCamera() {
	
	MyStore Camera1=new MyStore(1,"Canon","CN500",1200,"Available");
	MyStore Camera2=new MyStore(2,"Canon","CN5700",1300,"Available");
	MyStore Camera3=new MyStore(3,"SONY","SN500",1800,"Available");
	MyStore Camera4=new MyStore(4,"SONY","SN00",1600,"Available");
	MyStore Camera5=new MyStore(5,"NIKKON","N500",2200,"Available");
	MyStore Camera6=new MyStore(6,"SAMSUNG","S20",2000,"Available");
	MyStore Camera7=new MyStore(7,"SAMSUNG","S500",6000,"Available");
	SelectCamera.add(Camera1);
	SelectCamera.add(Camera2);
	SelectCamera.add(Camera3);
	SelectCamera.add(Camera4);
	SelectCamera.add(Camera5);
	SelectCamera.add(Camera6);
	SelectCamera.add(Camera7);
}
public void AddBalance() {
	Wallet w=new Wallet(4000);
	balances.add(w);
	
}
public void viewBalance()
{
	AddBalance();
	Iterator<Wallet> li=balances.iterator();
	while(li.hasNext()) {
		Wallet cc=li.next();
		System.out.println("Your Account Balance is"+cc.getBalance());
	}
}
public void addAmount() {
	float a,t=0.0f;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 to add amount otherwise press 2");
	int c=sc.nextInt();
	switch(c) {
	case 1:System.out.println("Enter amount to be added ");
	a=sc.nextFloat();
	Wallet mybalance=balances.get(0);
	Float f=Float.valueOf(mybalance.getBalance());
	t=f+a;
	System.out.println("Your Upgraded balance is ="+t);
	break;
	case 2:
		viewBalance();
	}
}
public void rent() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ID of camera that needed to be rented");
	int id=sc.nextInt();
	AddBalance();
	MyStore rentcamera=SelectCamera.get(id-1);
	Wallet mybalance=balances.get(0);
	if(rentcamera.getPricePerDay()<=mybalance.getBalance())
	{
		System.out.println("Camera with Brand= "+rentcamera.getBrands()+"and model "+rentcamera.getModel()+"is rented to you for one day.Have a good clicks");
		System.out.println("Transaction of INR "+rentcamera.getPricePerDay() +"has been made");
	rentcamera.setAvaibility("Rented");
	SelectCamera.add(rentcamera);
	Float b=Float.valueOf(mybalance.getBalance());
	Float p=Float.valueOf(rentcamera.getPricePerDay());
	System.out.println("Your balance after transaction = "+(b-p));
	}	
	else {
	System.out.println("ERROR:TRANSACTION FAILED(You dont have enough balance.Please deposit amount to your balance)");	
	}
		
	}
}




