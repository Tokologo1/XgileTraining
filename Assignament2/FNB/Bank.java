import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {
       

        ArrayList<Object> objecList = new ArrayList<Object>();
        objecList.add(new AccountManager("John", 100, 1));
        objecList.add(new AccountManager("Mary", 200, 2));
        objecList.add(new AccountManager("Peter", 300, 3));
        objecList.add(new AccountManager("Tokologo", 400, 4));
        objecList.add(new AccountManager("Kabelo", 500, 5));

    
          
        
        for(int x=0; x<objecList.size(); x++)
        {
            AccountManager accountManager1 = (AccountManager)objecList.get(x);
            accountManager1.deposit(50);
            accountManager1.withdraw(100);
            System.out.println(accountManager1.toString());
            System.out.println(accountManager1.getBalance());
            
        }

        
       
        
        
    }

    
}
