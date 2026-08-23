import java.util.Random;

public class LpaStudent extends StudentRecord {
    private double percentcomplete;

    private static Random random = new Random();

    public LpaStudent() {
        percentcomplete = random.nextDouble(0.0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentcomplete);
    }

    public double getPercentcomplete() {
        return percentcomplete;
    }
}
