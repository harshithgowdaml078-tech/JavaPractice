enum geometry{LINE, POINT, POLYGON};
enum color {BLACK, BLUE, GREEN, RED, PURPLE, ORANGE};
enum pointmakers{CIRCLE, DIAMOND, TRIANGLE, RECTANGLE, PUSH_PIN};
enum linemakers{DASHED, DOTTED, SOLID};
public interface challenge {
    String JSON_PROPERTY = """
          "Properties": {%S} 
          """;
    String getlabel();
    String getmarker();
    geometry getshape();
    default String tojson() {
      return """
               "type" : "%s" , "label" : "%s", "marker" : "%s"
               """.formatted(getlabel(), getmarker(), getshape());
    }
    static void mapit(challenge mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.tojson()));
    }
}
