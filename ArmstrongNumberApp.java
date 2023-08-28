import java.util.Scanner;

public class ArmstrongNumberApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to check armstrong or not");
		int n=scan.nextInt();
		Armstrong am =new Armstrong();
		int res=am.findArmstrong(n);		
		if(n==res) {
			System.out.println("it is Armstrong number");
		}
		
		else {
			System.out.println("it is Not a Armstrong number");
		}
		
	}

}
