package Banking;
import java.util.*;
import java.util.Arrays;


class DepositException extends Exception {
	String message;
	public DepositException(String msg)
	{
		message=msg;
	}
	public String getMessage()
	{
		return message;
	}
}
class WithdrawException extends Exception{
		String message;
		public WithdrawException(String msg)
		{
			message=msg;
		}
		public String getMessage()
		{
			return message;
		}
	}



class Bank{
	private String acc_holder,acc_number,acc_type;
	private long acc_balance;
	int num_of_cust=0;
	Scanner sc=new Scanner(System.in);
	//To Open Account
	void OpenAccount()
	{
		num_of_cust++;
		System.out.println("\n");
		System.out.print("Name of Account holder:  ");
		acc_holder=sc.next();
		System.out.print("Type of account       :  ");
		acc_type=sc.next();
		System.out.print("Account Number        :  ");
		acc_number=sc.next();
		System.out.print("Account Balance       :  ");
		acc_balance=sc.nextLong();
		
	}
	//Show Account
	void ShowAccount()
	
	{
		System.out.println("\n");
		System.out.print("Name of Account holder:  "+acc_holder+"\n");
		System.out.print("Type of account       :  "+acc_type+"\n");
		System.out.print("Account Number        :  "+acc_number+"\n");
		System.out.print("Account Balance       :  "+acc_balance+"\n");
	}
	//Search Account 
	public boolean SearchAcc(String acc_no)
	{
		if(acc_number.equals(acc_no))
		{
			return (true);
		}
		else
			return (false);
		
	}
	
	//To Deposit Funds
	void Deposit()
	{
		long a_deposit;
		System.out.println("\n");
		System.out.print("Enter the amount to be deposited : ");
		a_deposit=sc.nextLong();
		
		try {
		if(a_deposit<=0)
		{
			throw new DepositException("Enter valid amount!");
		}
		}
		catch(DepositException e)
		{
			System.out.println(e.getMessage());
		}
		
		acc_balance+=a_deposit;
		System.out.print("Current balance: \n"+acc_balance);
	}
	
	//To Withdraw Funds
	void Withdraw()
	{
		long a_withdraw;
		System.out.println("\n");
		System.out.print("Enter the amount to be withdrawn :  ");
		a_withdraw=sc.nextLong();
			try {
				if(a_withdraw<=0)
				{
					throw new WithdrawException("Enter valid amount!!");
				}
			}
				catch(WithdrawException e)
				{
				System.out.println(e.getMessage());
				}
		
		if(a_withdraw>acc_balance)
		{
			System.out.println("Insufficient funds!!");
		}
		else
		{
		acc_balance-=a_withdraw;
			System.out.print("Current balnce: \n"+acc_balance);
		}
	}
	
}



public class UBS_GLOBAL {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter maximum number of customers :  ");
		int mc=sc.nextInt();
		Bank b[]=new Bank[100];
		int choice;
		
		System.out.println("--UBS GLOBAL WEALTH MANAGEMENT--\n");
		System.out.println("1.Create new account");
		System.out.println("2.Display all account details");
		System.out.println("3.Search by account ");
		System.out.println("4.Deposit");
		System.out.println("5.Withdraw");
		System.out.println("6.Exit\n");
		int noc;
		for(int i=0;i<=mc;i++)
		{
			b[i]=new Bank();
		}
		do
		{
		    noc=0;
			//System.out.println("\n");
			System.out.print("\nEnter your choice: ");
			choice=sc.nextInt();
			
			switch(choice)
		
			{
			case 1:
				{
					{
						
						System.out.print(noc);
						b[noc]=new Bank();
						b[noc].OpenAccount();
						
						System.out.print(noc);
					}
					break;
				}
				
			case 2:
				{
					{
						System.out.println(noc);
						for(int i=0;i<=noc;i++)
						{
							b[i].ShowAccount();
					
						}
					
					}
					break;
				}
			case 3:
				{
					{
						System.out.print("Enter Account Number: ");
						String acc_no=sc.next();
						boolean found=false;
						
						for(int i=0;i<=noc;i++)
						{
							found=b[i].SearchAcc(acc_no);
							if(found)
							{
								b[i].ShowAccount();
							}
							else
							{
								System.out.println("ACCOUNT NOT FOUND!!");
							}
						}
					}
					break;
				}
			case 4:
			{
				{
					System.out.print("Enter Account number :  ");
					String acc_no=sc.next();
					boolean found=false;
					for(int i=0;i<=noc;i++)
					{
				
						found=b[i].SearchAcc(acc_no);
						if(found)
						{
							b[i].Deposit();
						}
						else
						{
							System.out.println("ACCOUNT NOT FOUND!!");
						}
					}
				}
				break;
			}
			
			case 5:
				{
					{
						System.out.print("Enter Account number");
						String acc_no=sc.next();
						boolean found=false;
						for(int i=0;i<=noc;i++)
						{
							found=b[i].SearchAcc(acc_no);
							if(found)
							{
								b[i].Withdraw();
							}
							else
							{
								System.out.println("ACCOUNT NOT FOUND!!");
							}
						}
						
					}
					break;
				}
			case 6:
				{
					System.out.println("--THANK YOU--");
					break;
				}
			default:
				System.out.println("Enter a valid choice!!");
				
			}
			if(choice==1)
			{
				noc++;
			}
			
		}while(choice!=6);
		}
}
	


	
	

