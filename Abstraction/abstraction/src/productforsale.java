public abstract class productforsale {
    protected String type;
    protected double price;
    protected String description;

    public productforsale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void printpriceditmqty(int qty) {
       System.out.printf(" %2d qty at $%8.2f each, %-15s %-35s %n", qty, price, type, description);
    }

    public double getsalespriceqty(int qty) {
        return qty * price;
    }

     abstract void showdetails();
}

