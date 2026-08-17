import java.util.ArrayList;
import java.util.List;

public class Team<T extends player> {
    private String teamname;
    private List<T> teammembers = new ArrayList<>();
    private int totalwins = 0;
    private int totaloss = 0;
    private int totalties = 0;

    public Team(String teamname) {
        this.teamname = teamname;
    }
    public void addteammembers(T T ) {
        if (!teammembers.contains(T)) {
            teammembers.add((T) T);
        }
    }
    public void listteammembers() {
        System.out.print(teamname + " Roster:");
       for (T t: teammembers) {
           System.out.println(t.name());
       }
    }
    public int ranking() {
        return (totaloss*2)+totalties+1;
    }

    public String setscore(int ourscore, int thierscore) {
        String meassage = " lost to";
        if(ourscore > thierscore) {
            totalwins++;
            meassage = " beat to";
        }
        else if(ourscore == thierscore) {
            totalties++;
            meassage = " match tied";
        } else {
            totaloss++;
        }
        return meassage;
    }

    @Override
    public String toString() {
        return teamname + " ( Ranked " + ranking();
    }
}

