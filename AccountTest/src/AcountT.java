import java.util.Scanner;

public class AcountT {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double money = 0;
		Acount Acount1 = new Acount();
		Acount Acount2 = new Acount();
		Acount1.credit(50);
		System.out.printf("acount1 balanc: $%f\n", Acount1.getBalance());
		Acount2.credit(0);
		System.out.printf("acount2 balanc: $%f\n", Acount2.getBalance());
		
		System.out.print("\nEnter withdrawal amount for acount1: ");
		money = input.nextDouble();
		Acount1.debit(money);
		if(Acount1.getBalance < money ){
			System.out.print("Debit amount exceed account\n ");
			System.out.printf("acount1 balanc: $%f\n", Acount1.getBalance());
			System.out.printf("acount2 balanc: $%f\n", Acount2.getBalance());
		}else{
			System.out.printf("subtracting %f from for acount1 balnce\n",money);
			System.out.printf("acount1 balanc: $%f\n", Acount1.getBalance());
			System.out.printf("acount2 balanc: $%f\n", Acount2.getBalance());
		}
		System.out.print("\nEnter withdrawal amount for account2: ");
		money = input.nextDouble();
		Acount2.debit(money);
		if(Acount1.getBalance < money ){
			System.out.print("Debit amount exceed account\n ");
			System.out.printf("acount1 balanc: $%f\n", Acount1.getBalance());
			System.out.printf("acount2 balanc: $%f\n", Acount2.getBalance());
		}else{
			System.out.printf("subtracting %f from for acount1 balnce\n",money);
			System.out.printf("acount1 balanc: $%f\n", Acount1.getBalance());
			System.out.printf("acount2 balanc: $%f\n", Acount2.getBalance());
		}
		
		
	}


}
