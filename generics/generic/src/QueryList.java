import java.util.ArrayList;
import java.util.List;

public class QueryList <T extends QuearyItem>{
    private List<T> items;

    public QueryList(List<T> items) {
        this.items = items;
    }
    public List<T> getmatcjvallue(String fieldname, String fieldvalue) {
        List<T> matches = new ArrayList<>();
        for(var item : items) {
            if(item.fieldmatchvalue(fieldname, fieldvalue)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
