import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> layerelements;

    public Layer(T[] layerelements) {
        this.layerelements = new ArrayList<T>(List.of(layerelements));
    }
    public void Addelements(T... elements) {
        layerelements.addAll(List.of(elements));
    }
    public void renderlayer() {
        for(  T element : layerelements) {
            element.render();
        }
    }
}
