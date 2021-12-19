package assignment;

import java.util.Date;
import java.util.Scanner;
abstract class BaseAccount
{
    private String name;
    private long AccoNumber;
    private long amount;
    
    protected long balance;
    private Date startDate;
    private Date dueDate;
    
    
    public String getName(){return name;}
    public long getAccNo(){return AccoNumber;}
    public long getAmount(){return amount;}
    public long getBalance(){return balance;}
    
   public void setName(String name){
       this.name=name;
   }
   public void setNumber(long accoNumber2){
       this.AccoNumber=accoNumber2;
   }
   public  void setAmount(long amount) {
	   this.amount=amount;
   }
   
   public void setBalance(long balance){
       this.balance=balance;
   }
   public void setStartDate(Date startDate){
       this.startDate=startDate;
   }
   public void setDueDate(Date dueDate){
       this.dueDate=dueDate;
   }
    
   public abstract double calculateInterest();
            
}

 class SavingsAccount extends BaseAccount
{
    final int rate=12;
    public SavingsAccount(String name, long AccoNumber,long amount, Date d1,Date d2 ){
    	setName(name);
    	setNumber(AccoNumber);
    	setAmount(amount);
    	setStartDate(d1);
    	setDueDate(d2);
    	
    }
    
     @Override
    public double calculateInterest() {
    	// TODO Auto-generated method stub
    	return 0;
    }
}

class CurrentAccount extends BaseAccount
{
	final int rate=5;
	public CurrentAccount(String name, long AccoNumber,long amount, Date d1,Date d2 ){
    	setName(name);
    	setNumber(AccoNumber);
    	setAmount(amount);
    	setStartDate(d1);
    	setDueDate(d2);
    	
    }
	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}
}


public class bankingSystem {

	




	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String name;
		long AccoNumber;
		long amount;
		Date d1=sc.
		Date d2=new Date();
		int day1 = d1.getDate();
		
		int day2 = d2.getDate();
		
		
		int choice = sc.nextInt();
		//System.out.println(choice);
		switch(choice){
		    case '1':
			
			name=sc.nextLine();
			AccoNumber =sc.nextLong();
			amount= sc.nextLong();
			SavingsAccount s1=new SavingsAccount(name,AccoNumber,amount,d1,d2);
			break;
			case '2':
				
				name=sc.nextLine();
				AccoNumber =sc.nextLong();
				amount= sc.nextLong();
				CurrentAccount c1=new CurrentAccount(name,AccoNumber,amount,d1,d2);
				break;

			
			default:
			//	System.out.println("Invalid choice");
		}
		sc.close();

	}

}
