public class Account {
    public static  void main(String [] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("76453");
        account.setAccountBalance(1000);
        account.setCustomerName("karian");
        account.setEmail("karienaccount@gmail.com");
        account.setPhoneNumber("+(91) 76452315534829");
        account.depositmoney(1000);
        account.withdrawmoney(900);
        account.withdrawmoney(1000);
        account.withdrawmoney(100);
    }
}
