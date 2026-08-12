record baseball(
     String name, String position) {}

public class Run {
    static void main(String[] args) {
        QUE1 rangers = new QUE1("Bhopal rangers");
        QUE1 riders = new QUE1("Indore riders");
       scoreresult(rangers,5, riders, 3);
       var madhav = new baseball("madhav", "left fileder");
       var aniket = new baseball("aniket", "right fielder");
       rangers.addteammembers(madhav);
       riders.addteammembers(aniket);
       rangers.listteammembers();
       riders.listteammembers();
    }
    public static void scoreresult(QUE1 team1, int t1_score, QUE1 team2, int
                            t2_score) {
        String message = team1.setscore(t1_score, t2_score);
        team2.setscore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2 );
    }
}