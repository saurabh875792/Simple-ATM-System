import java.util.*;
class Firstp{
private static int pin;
private int withdraw;
private int deposit;
Firstp(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Pin");
pin=sc.nextInt();


}
public boolean correctPin(){
if(pin==1234){
	
	System.out.println("pin varified");
	return true;
	
}
else{
	System.out.println("Pls Enter Correct pin");
	return false;
}

}
public void choose(){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("1.Check Balance");
	System.out.println("2.Deposit");
	System.out.println("3.withdraw");
	System.out.println("4.Exit");
	int choice=sc.nextInt();
	
	switch (choice){
		
		case 1:
		System.out.println("Total balance = 50000");
		break;
		case 2:
		System.out.println("Enter Withdraw Amount");
		withdraw=sc.nextInt();
		System.out.println("Withdraw Successful");
		break;
		case 3:
		System.out.println("Enter deposit Amount");
		deposit=sc.nextInt();
		System.out.println("Deposit Successfull");
		break;
		case 4:
		System.out.println("Thanx for visiting");
		
	}
	
}
public static void main(String args[]){
Firstp p=new Firstp();
if(p.correctPin()){
p.choose();
}
}
}