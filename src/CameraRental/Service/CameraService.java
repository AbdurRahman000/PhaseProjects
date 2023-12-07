package CameraRental.Service;
import java.util.Scanner;
import java.util.ArrayList;

import CameraRental.Store.MyStore;
import CameraRental.bean.Camera;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class CameraService {
List<Camera> ListOfCamera=new ArrayList<>();
Scanner sc=new Scanner(System.in);
int c=1;
public void AddedCamera() {
	
	Camera Camera1=new Camera(1,"Canon","CN500",1200,"Available");
	Camera Camera2=new Camera(2,"Canon","CN5700",1300,"Available");
	Camera Camera3=new Camera(3,"SONY","SN500",1800,"Available");
	Camera Camera4=new Camera(4,"SONY","SN00",1600,"Available");
	Camera Camera5=new Camera(5,"NIKKON","N500",2200,"Available");
	Camera Camera6=new Camera(6,"SAMSUNG","S20",2000,"Available");
	Camera Camera7=new Camera(7,"SAMSUNG","S500",3000,"Available");
	ListOfCamera.add(Camera1);
	ListOfCamera.add(Camera2);
	ListOfCamera.add(Camera3);
	ListOfCamera.add(Camera4);
	ListOfCamera.add(Camera5);
	ListOfCamera.add(Camera6);
	ListOfCamera.add(Camera7);
}
public void addCamera() {
	Camera cc=new Camera();
	System.out.println("Enter the camera brand");
	String brand=sc.next();
	System.out.println("Enter the camera model");
	String model=sc.next();
	System.out.println("Enter the camera per day rent price ");
	float amount=sc.nextFloat();
	int c=8;
	cc.setId(c);
	cc.setBrands(brand);
	cc.setModel(model);
	cc.setPricePerDay(amount);
	cc.setAvaibility("Available");
	ListOfCamera.add(cc);
	System.out.println("Camera Added Successfully");
	c++;
}
public void removeCamera() {
	AddedCamera();
	System.out.println("Enter the ID of camera that needed to be removed");
	int id=sc.nextInt();
	Iterator<Camera> li=ListOfCamera.iterator();
	while(li.hasNext()) {
		Camera cc=li.next();
		if(cc.getId()==id) {
			li.remove();
			System.out.println("Camera Successfully removed");
		}
		
	}
}
public void viewAllCamera()
{
	AddedCamera();
	Iterator<Camera> li=ListOfCamera.iterator();
	while(li.hasNext()) {
		Camera cc=li.next();
		System.out.println(cc);
		
	}
}
}
