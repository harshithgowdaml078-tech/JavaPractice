package inheritance;

public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int length;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

 class monitor extends  Product {
    private int size;
    private String resolution;

     public monitor(String model, String manufacturer, int size, String resolution) {
         super(model, manufacturer);
         this.size = size;
         this.resolution = resolution;
     }

     public monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void drawpixelAt(int x, int y, String color) {
         System.out.printf("pixel %d, %d is in color %s ", x, y, color);
    }
}
 class motherboard extends  Product {
    private int ramslots;
    private int cardslots;
    private String bios;

     public motherboard(String model, String manufacturer, int ramslots, int cardslots, String bios) {
         super(model, manufacturer);
         this.ramslots = ramslots;
         this.cardslots = cardslots;
         this.bios = bios;
     }

     public motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void loadprogram(String programName) {
         System.out.printf(" program " + programName + " is loading.... ");
    }
}
class computercase extends  Product {
    private String powersupply;

    public computercase(String model, String manufacturer, String powersupply) {
        super(model, manufacturer);
        this.powersupply = powersupply;
    }

    public computercase(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public void presspowerbutton() {
        System.out.printf(" power button is pressed ");
    }
}
