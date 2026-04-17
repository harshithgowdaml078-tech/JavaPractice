public class Calculator {
    private double firstnumber;
    private double secondnumber;

    public double getFirstnumber() {
        return firstnumber;
    }

    public void setFirstnumber(double firstnumber) {
        this.firstnumber = firstnumber;
    }

    public double getSecondnumber() {
        return secondnumber;
    }

    public void setSecondnumber(double secondnumber) {
        this.secondnumber = secondnumber;
    }
    public double getadditionresult() {
        return firstnumber+secondnumber;
    }

    public double getsubtractionresult() {
        return firstnumber - secondnumber;
    }
    public double getmultiplicationresult() {
        return firstnumber * secondnumber;
    }
    public double getdevisionresult() {
        if(secondnumber == 0) {
            return 0;
        } else {
            return firstnumber / secondnumber;
        }
    }
}
