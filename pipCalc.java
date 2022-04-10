
public class pipCalc {
	
	public static void pipCalculator(double accountSize, double setCurrency, double targetCurr, double lot, double negativeCurr) {
		System.out.printf("%s%.0f%n","Starting Balance: ", accountSize);
		System.out.printf("%s%.2f%n%n","Lot Size: ", lot);
		double lotSize = lot * 100000;
		
		double pip = targetCurr - setCurrency;
		double profit = pip * lotSize;
		
		System.out.printf("%.2f%s%n", pip * 10000, " Pips");
		System.out.printf("$%.2f%n", profit);
		System.out.printf("%s%.2f%n", "New Balance: $" ,accountSize + profit);
		System.out.printf("%.2f%s%n%n", (profit / accountSize) * 100, "%");
		
		System.out.println("---If you lose trade---");
		double negPip = negativeCurr - setCurrency;
		double negProfit = negPip * lotSize;
		
		System.out.printf("%n%.2f%s%n", negPip * 10000, " Pips");
		System.out.printf("$%.2f%n", negProfit);
		System.out.printf("%s%.2f%n", "New Balance: $" ,accountSize + negProfit);
		System.out.printf("%.2f%s%n%n", (negProfit / accountSize) * 100, "%");
	}

	public static void main(String[] args) {
		pipCalculator(100000, 15602, 16602, .01, 15470.1);
	}

}
