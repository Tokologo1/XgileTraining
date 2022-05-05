

public class BankAccount
    {
        private String name ;
        private float balance;
        private int accountNumber;

        public BankAccount(String name, float balance, int accountNumber)
        {
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



    }