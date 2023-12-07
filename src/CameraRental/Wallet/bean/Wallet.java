package CameraRental.Wallet.bean;

public class Wallet {
private float balance;
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}

public Wallet(float balance) {
	super();
	this.balance = balance;
}
public Wallet() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Wallet [balance=" + balance ;
}

}
