

public class AccountManager extends BankAccount
{
    private String name;
    private float balance =0;
    private int accountNumber;
    private static int accountNumberCounter = 0;

    
    
    public AccountManager(String name, float balance, int accountNumber)
    {
        super(name, balance, accountNumber);
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    
    public void deposit(float amount)
    {
        balance += amount;
    }

    public void withdraw(float amount)
    {
        if(amount > balance)
        {
            System.err.println("Insufficient funds");
        }
        else
        {
            balance -= amount;
        }
        
    }

    public float getBalance()
    {
        return balance;
    }
    
    public static int getAccountNumberCounter()
    {
        return accountNumberCounter;
    }
    
    public static void setAccountNumberCounter(int accountNumberCounter)
    {
        AccountManager.accountNumberCounter = accountNumberCounter;
    }
    
    public static void incrementAccountNumberCounter()
    {
        accountNumberCounter++;
    }
    
    public static void decrementAccountNumberCounter()
    {
        accountNumberCounter--;
    }
    
   
    
    public String toString()
    {
        return "Name: " + name + "\n" + "Balance: " + balance + "\n" + "Account Number: " + accountNumber;
    }

    public String getName() {
        return null;
    }
    
}
   
   
    


