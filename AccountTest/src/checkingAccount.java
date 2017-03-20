
public class checkingAccount extends Acount {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	public checkingAccount(double b,double c,double i,double l){
		super(b);
		credit_limit =c;
		interest = i;
		loan_interest= l;
	}
	
	public void debit(double m){
		getBalance -= money;
		if (getBalance < credit_limit){
			System.out.print("한도 초과");
			getBalance += money;
		}
		if (getBalance <= 0 ){
			System.out.print("마이너스 상태 입니다");
		}
	}
	public void nextMonth(int a){
		
		if(a>0 && getBalance>0){
			getBalance = (getBalance + (getBalance*interest));
		}
		if(a >0 && getBalance <=0){
			getBalance = getBalance + (getBalance*loan_interest);
		}
	}
	public double getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(double credit_limit) {
		this.credit_limit = credit_limit;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getLoan_interest() {
		return loan_interest;
	}
	public void setLoan_interest(double loan_interest) {
		this.loan_interest = loan_interest;
	}

}
