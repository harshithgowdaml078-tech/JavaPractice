public class BankAccount {

    private String AccountNumber;
    private double AccountBalance;
    private String CustomerName;
    private String Email;
    private String PhoneNumber;

    public void depositmoney(double moneydeposit) {
        AccountBalance += moneydeposit;
        System.out.println("Deposited money in account = " + moneydeposit + " new balance in account is = " + AccountBalance);
    }

    public void withdrawmoney(double moneywithdraw) {
        if(AccountBalance - moneywithdraw < 0) {
            System.out.println("Insufficient funds");
        } else {
            AccountBalance -= moneywithdraw;
            System.out.println("Withdrawn money from account = " + moneywithdraw + " New account in balance is = " + AccountBalance);
        }
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}