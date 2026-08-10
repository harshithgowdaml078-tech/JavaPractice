import java.util.ArrayList;
import java.util.List;

public class EntryPoint {
    static void main(String[] args) {
        List<challenge>mappables = new ArrayList<>();
        mappables.add(new Building("ORION MALL" , usage.ENTERTRAINMENT));
        mappables.add(new Building("VIDHANA SABHA", usage.GOVERNMENT ));
        mappables.add(new Building("DLF MAX", usage.RESIDENTIAL));
        mappables.add(new Building("CHINNASWAMY STADIUM", usage.SPORTS));
        for(var m : mappables) {
            challenge.mapit(m);
        }
    }
    
}
