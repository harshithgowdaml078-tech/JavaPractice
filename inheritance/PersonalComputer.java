package inheritance;

public class PersonalComputer extends Product{
    private monitor Monitor;
    private motherboard MotherBoard;
    private computercase ComputerCase;

    public PersonalComputer(String model, String manufacturer, monitor monitor, motherboard motherBoard, computercase computerCase) {
        super(model, manufacturer);
        Monitor = monitor;
        MotherBoard = motherBoard;
        ComputerCase = computerCase;
    }

    private void drawlogo() {
        Monitor.drawpixelAt(12,10,"Blue");
    }

    public void callup() {
        ComputerCase.presspowerbutton();
        drawlogo();
    }

    //public monitor getMonitor() {
    //    return Monitor;
    //}

//    public motherboard getMotherBoard() {
  //      return MotherBoard;
    //}

   // public computercase getComputerCase() {
     //   return ComputerCase;
    //}
}
