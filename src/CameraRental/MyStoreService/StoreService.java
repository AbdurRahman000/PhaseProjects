package CameraRental.MyStoreService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import CameraRental.Store.MyStore;

public class StoreService {
	List<MyStore> ListOfCamera=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	int c=1;

	public void AddCamera() {
		
		MyStore Camera1=new MyStore(1,"Canon","CN500",1200,"Available");
		MyStore Camera2=new MyStore(2,"Canon","CN5700",1300,"Rented");
		MyStore Camera3=new MyStore(3,"SONY","SN500",1800,"Available");
		MyStore Camera4=new MyStore(4,"SONY","SN00",1600,"Rented");
		MyStore Camera5=new MyStore(5,"NIKKON","N500",2200,"Available");
		MyStore Camera6=new MyStore(6,"SAMSUNG","S20",2000,"Available");
		MyStore Camera7=new MyStore(7,"SAMSUNG","S500",6000,"Available");
		ListOfCamera.add(Camera1);
		ListOfCamera.add(Camera2);
		ListOfCamera.add(Camera3);
		ListOfCamera.add(Camera4);
		ListOfCamera.add(Camera5);
		ListOfCamera.add(Camera6);
		ListOfCamera.add(Camera7);
	}
	
	public void viewAllCamera()
	{
		Iterator<MyStore> li=ListOfCamera.iterator();
		while(li.hasNext()) {
			MyStore cc=li.next();
			System.out.println(cc);
		}
	}
}
