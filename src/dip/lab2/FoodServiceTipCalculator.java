package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements CalculatorStrategy {
    private double minBill = 0.00;
    private String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + minBill;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

    private double bill;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceQuality(q);
        this.setBill(billAmt);
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }
    public void setMinBill(double amt) {
        this.minBill = amt;
    }

    public void setRate(double rate) {
        switch(serviceQuality) {
            case GOOD:
                goodRate = rate;
                break;
            case FAIR:
                fairRate = rate;
                break;
            case POOR:
                poorRate = rate;
                break;
        }
    }
    public void getRate(ServiceQuality quality) {
        double rate = 0.00;
        switch(quality) {
            case GOOD:
                rate = goodRate;
                break;
            case FAIR:
                rate = fairRate;
                break;
            case POOR:
                rate = poorRate;
                break;
        }
    }

    public void setServiceQuality(ServiceQuality sq) {
        this.serviceQuality = sq;
    }

}
