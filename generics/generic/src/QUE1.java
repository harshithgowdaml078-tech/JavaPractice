import java.util.ArrayList;
import java.util.List;

public class QUE1 {
    private String teamname;
   private List<baseball> teammembers = new ArrayList<>();
   private int totalwins = 0;
   private int totaloss = 0;
   private int totalties = 0;

    public QUE1(String teamname) {
        this.teamname = teamname;
    }
    public void addteammembers(baseball player ) {
        if (!teammembers.contains(player)) {
            teammembers.add(player);
        }
    }
    public void listteammembers() {
        System.out.println(teamname+" Roster");
        System.out.println(teammembers);
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
