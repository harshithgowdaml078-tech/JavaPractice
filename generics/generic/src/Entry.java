record layerelements() {};
public class Entry {
    static void main(String[] args) {
    var nationalparks = new Park[]{new Park("Yellowstone", "44.4882, -110.5916"),
            new Park("Grand Canyon", "36.0636, -112.1079"),
            new Park("Yosemite", "37.8855, -119.5360")
    };
    Layer<Park> parkLayer = new Layer<>(nationalparks);
    parkLayer.renderlayer();

    var rivers = new River[]{new River("Mississippi", "47.2160, -95.2348" ,
            "35.1556, -90.0659" ,
            "29.1566, -89.2495"),
            new River("Missouri", "45.9239, -111.4983" ,
                    "38.8146, -90.1218")
    };

    Layer<River> riverLayer = new Layer<>(rivers);
    riverLayer.renderlayer();

    }
}
