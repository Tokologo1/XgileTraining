package Bank;

public class Main {

    public static void main(String[] args) {
       
       
        ChequeAcc myAccount = new ChequeAcc(1, 1000, "Cheque Account", 1, 100, "Cheque","Tokologo Chabalala");

        Savings myAccount2 = new Savings(2, 2000, "Savings Account", 2, 200, "Savings","Kamogelo Chabalala");

        System.out.println(myAccount.toString());
        System.out.println(myAccount2.toString());
    }
    
}
