package inheritance;

public class main4 {
    public static void main(String[] args) {
      computercase theCase = new computercase("2208", "Dell", "240");
      monitor theMonitor = new monitor("27inch Beast", "Acer", 27, "2540 x 1440");
      motherboard theMotherboard = new motherboard("BJ-200", "Asus", 4, 6, "v2.44");
      PersonalComputer thePC = new PersonalComputer("2208", "Dell", theMonitor, theMotherboard, theCase);

      thePC.callup();
     // thePC.getComputerCase().presspowerbutton();
      //hePC.getMonitor().drawpixelAt(10, 10, "red");
     // thePC.getMotherBoard().loadprogram("Windows OS");
    }
}
