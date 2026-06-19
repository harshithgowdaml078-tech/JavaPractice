package inheritance;

public class PrinterClass {
    private int tonnerlevel;
    private int pagesprinted;
    private boolean duplex;

    public PrinterClass(int tonnerlevel, boolean duplex) {
        this.pagesprinted = 0;
        this.tonnerlevel = (tonnerlevel >= 0 && tonnerlevel <= 100) ? tonnerlevel : -1 ;
        this.duplex = duplex;
    }

    public int addtoner(int tonneramount) {
        int tempamount = tonneramount + tonnerlevel;
        if(tempamount > 100 && tempamount < 0){
            return -1;
        }
        tonnerlevel += tonneramount;
        return tonnerlevel;
    }
    public int printpages(int pages) {
           int jobpages = (duplex) ? (pages / 2) + (pages % 2) : pages;
           pagesprinted += jobpages;
           return jobpages;
    }

    public int getPagesprinted() {
        return pagesprinted;
    }
}
