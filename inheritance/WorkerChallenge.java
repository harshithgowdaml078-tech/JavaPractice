package inheritance;

public class WorkerChallenge {
    private String name;
    private String birthdate;
    protected String EndDate;


    public WorkerChallenge() {

    }
    public WorkerChallenge(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;

    }

    public int getage() {
        int currentyear = 2026;
        int Birthdate = Integer.parseInt(birthdate.substring(6));
        return (currentyear - Birthdate);
    }
    public double collectpay () {
        return 0.0;
    }
    public void terminate(String Endate) {
        this.EndDate = Endate;
    }

    @Override
    public String toString() {
        return "WorkerChallenge{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", EndDate='" + EndDate + '\'' +
                '}';
    }
}
