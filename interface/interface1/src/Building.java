enum usage{ENTERTRAINMENT, GOVERNMENT, SPORTS, RESIDENTIAL}
public class Building implements challenge {
    private String name;
    private usage type;

    public Building(String name, usage type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getlabel() {
        return name + " ( " + type + " ) ";
    }

    @Override
    public String getmarker() {
        return switch (type) {
            case ENTERTRAINMENT -> color.GREEN+ " " + pointmakers.TRIANGLE;
            case GOVERNMENT -> color.BLUE + " " + pointmakers.RECTANGLE;
            case SPORTS -> color.RED + " " + pointmakers.CIRCLE;
            case RESIDENTIAL -> color.ORANGE + " " + pointmakers.DIAMOND;
            default -> color.BLACK + " " + " " + pointmakers.PUSH_PIN;
        };
    }

    @Override
    public geometry getshape() {
        return geometry.POINT;
    }
}
