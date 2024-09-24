import java.text.DecimalFormat;
import java.util.Scanner;

public class TipRunner {
    public static void main(String[] args) {
        // Setup
        final DecimalFormat df = new DecimalFormat("#.00");
        Scanner s = new Scanner(System.in);
        double tip;
        double total;
        double averageTip;
        double averageTotal;
        double bill;
        int tipPercent;
        int people;


        // Opening
        System.out.println("     _______________________________________________________\n" +
                "    /\\                                                      \\\n" +
                "(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n" +
                "    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/");

        System.out.println("\n        !! Please enter all numbers, without any symbols. !! \n");


        // Gathering user input
        System.out.print("      | Enter your bill: ");
        bill = Double.parseDouble(s.nextLine());

        System.out.print("      | Tip Percent (Whole Number): ");
        tipPercent = Integer.parseInt(s.nextLine());

        System.out.print("      | Number of People: ");
        people = Integer.parseInt(s.nextLine());


        // Tip calculations
        TipCalculator tipCalculator = new TipCalculator(bill, tipPercent, people);
        tip = tipCalculator.calcTip();
        total = tipCalculator.calcTotal();
        averageTip = tipCalculator.calcTipAvg();
        averageTotal = tipCalculator.calcTotalAvg();



        // Final printout
        System.out.println("\n              ------------------------------------\n");

        System.out.println("      | Total Tip Amount: $" + df.format(tip));
        System.out.println("      | Total bill: $" + df.format(total));
        System.out.println("      | Tip per person: $" + df.format(averageTip));
        System.out.println("      | Total bill per person: $" + df.format(averageTotal) +"\n");


        // Closing
        System.out.println("    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\    \n" +
                "(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n" +
                "    \\/______________________________________________________/");

    }
}
