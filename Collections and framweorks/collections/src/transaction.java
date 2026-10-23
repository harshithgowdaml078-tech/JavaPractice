
public class transaction {
    private String transactionid;
    private double amount;
    private String type;
    private String merchantname;

    public transaction(String transactionid, double amount, String type, String merchantname) {
        this.transactionid = transactionid;
        this.amount = amount;
        this.type = type;
        this.merchantname = merchantname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof transaction)) return false;
        transaction other = (transaction) obj;
        return this.merchantname.equals(other.merchantname);
    }

    @Override
    public int hashCode() {
        return merchantname.hashCode();
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "transaction{" +
                "transactionid='" + transactionid + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", merchantname='" + merchantname + '\'' +
                '}';
    }
}


