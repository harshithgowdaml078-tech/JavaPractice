public class Account {
    public static  void main(String [] args) {
        BankAccount account = new BankAccount("12345", 2000, "Harshith", "harshith@gmail.com", "097656342564");
        System.out.println(account.getAccountNumber());
        System.out.println(account.getCustomerName());
        System.out.println(account.getEmail());
       // account.setAccountNumber("76453");
        //account.setAccountBalance(1000);
       // account.setCustomerName("karian");
       // account.setEmail("karienaccount@gmail.com");
       // account.setPhoneNumber("+(91) 76452315534829");
        account.depositmoney(1000);
        account.withdrawmoney(900);
        account.withdrawmoney(1000);
        account.withdrawmoney(100);
    }
}
