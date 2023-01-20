package apcsaProjects2223;

public class ProjectBankAccount01062023
{
    String accountholder;
    int accountnumber;
    double balance;

    public String getAccountholder() {
        return accountholder;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double cehckingBalance()
    {
        return balance;
    }
    public String withdraw(double withdrawAmount)
    {
        balance = balance-withdrawAmount;
        return "you have been withdraw "+withdrawAmount+" dollars your current balance is "+balance;
    }

    public static void main(String[] args)
    {
        ProjectBankAccount01062023 account1 = new ProjectBankAccount01062023();
        account1.accountholder="alex";
        account1.accountnumber=12345;
        account1.balance=10000.00;

        System.out.println(account1.withdraw(2000.00));

        System.out.println(account1.balance);


    }

}
