public class Data {
    public static void main(String [] args) {
        CustomerData mydata = new CustomerData("snow", 25000, "snow123@gmail.com");
        System.out.println(mydata.getName());
        System.out.println(mydata.getCreditlimit());
        System.out.println(mydata.getEmail());

       CustomerData moredata = new CustomerData();
        System.out.println(moredata.getName());
        System.out.println(moredata.getCreditlimit());
         System.out.println(moredata.getEmail());

        CustomerData newdata = new CustomerData("AAYUSH", "aayush345@gmail.com");
        System.out.println(newdata.getName());
        System.out.println(newdata.getEmail());
    }
}
