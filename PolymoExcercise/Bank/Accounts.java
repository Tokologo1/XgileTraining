package Bank;

public class Accounts{
    

    private int id;
    private double bank_balance;
    private String account_type;

    public Accounts(int id, double bank_balance, String account_type) {
        this.id = id;
        this.bank_balance = bank_balance;
        this.account_type = account_type;
    }
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Double getBank_balance() {
        return bank_balance;
    }
    public void setBank_balance(int bank_balance) {
        this.bank_balance = bank_balance;
    }
    public String getAccount_type() {
        return account_type;
    }
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
   
    public String toString(){
        return id + " " + bank_balance + " " + account_type;
    }
    
}