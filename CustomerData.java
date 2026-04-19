public class CustomerData {
    private String name;
    private int creditlimit;
    private String email;

    public CustomerData(String name, int creditlimit, String email) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }

    public CustomerData () {
        this("harsha", 20000, "harsha@gmail.com");
    }

    public CustomerData(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public int getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }
}
