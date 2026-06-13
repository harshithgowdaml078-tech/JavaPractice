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

    public monitor getMonitor() {
        return Monitor;
    }

    public motherboard getMotherBoard() {
        return MotherBoard;
    }

    public computercase getComputerCase() {
        return ComputerCase;
    }
}
