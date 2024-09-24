public class TipCalculator {

    // Instance Variables
    private double bill;
    private int tipPercent;
    private int people;


    // Constructor
    TipCalculator(double bill, int tipPercent, int people) {
        this.bill = bill;
        this.tipPercent = tipPercent;
        this.people = people;
    }


    // Methods

    public double calcTip() {
        return (bill * tipPercent/ 100);
    }

    public double calcTipAvg() {
        return (calcTip() / people);
    }

    public double calcTotal() {
        return (bill + calcTip());
    }

    public double calcTotalAvg() {
        return (calcTotal() / people);
    }


}
