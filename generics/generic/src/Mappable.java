import javax.xml.stream.Location;
import java.util.Arrays;
public interface Mappable {
    void render();

    public static double[] stringLattoLon(String Location) {
        String[] splits = Location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lon = Double.valueOf(splits[1]);
        return new double[]{lat, lon};
    }
}

    abstract class point implements Mappable {
        private double[] Location = new double[2];

        public point(String Location) { this.Location = Mappable.stringLattoLon(Location);}




        @Override
        public void render() {
            System.out.println(" Render " + this + " as POINT( "+ Location() + " ) ");
        }




        private String Location() {
            return Arrays.toString(Location);
        }
    }

    abstract class Line implements Mappable {
        private double[][] Locations;
        public Line (String... locations) {
            this.Locations = new double[locations.length][];
            int index = 0;
            for (var l : locations) {
                this.Locations[index++] = Mappable.stringLattoLon(l);
            }

        }
        @Override
       public void render() {

     System.out.println("Render at " + this + " ( to LINE at " + Locations() + " ) ");
        }

        private String Locations() {
            return Arrays.deepToString(Locations);
        }
    }




