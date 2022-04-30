package Bank;

public class Savings extends Accounts {
    
    private int cheque_no;
    private double cheque_amount;
    private String cheque_type;
    private String name;
    
    public Savings(int string, double bank_balance, String i, int string2, int cheque_amount, String j,String name) {
        super(string, bank_balance, i);
        this.cheque_no = string2;
        this.cheque_amount = cheque_amount;
        this.cheque_type = j;
        this.name = name;
    }
    
    public void setCheque_amount(double cheque_amount) {
        this.cheque_amount = cheque_amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCheque_no() {
        return cheque_no;
    }
    public void setCheque_no(int cheque_no) {
        this.cheque_no = cheque_no;
    }
    public Double getCheque_amount() {
        return cheque_amount;
    }
    public void setCheque_amount(int cheque_amount) {
        this.cheque_amount = cheque_amount;
    }
    public String getCheque_type() {
        return cheque_type;
    }
    public void setCheque_type(String cheque_type) {
        this.cheque_type = cheque_type;
    }
    
    public String toString()
    {
        return name +"" + getId() + " " + getBank_balance() + " " + getCheque_type() + " " + cheque_no + " " + cheque_amount + " " + cheque_type;
    }
    
    
}

    

