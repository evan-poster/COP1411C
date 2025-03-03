/**
 * #5: Given the following egg (retail prices, in unit of one doze per carton) from the past twelve months, calculate the monthly inflation rates.

Jan:  3.68
Feb: 4.11
March: 4.13
April: 4.65
May: 4.69
June: 4.77
Aug: 4.80
Sep: 4.95
Oct 4.89
Nov 5.49
Dec: 6.88
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.text.DecimalFormat;

public class Exercise_5 {
    public static void main(String[] args) {
        // Create a LinkedHashMap to store egg prices per month in the correct order
        Map<String, Double> eggPrices = new LinkedHashMap<>();
        eggPrices.put("Jan", 3.68);
        eggPrices.put("Feb", 4.11);
        eggPrices.put("March", 4.13);
        eggPrices.put("April", 4.65);
        eggPrices.put("May", 4.69);
        eggPrices.put("June", 4.77);
        eggPrices.put("Aug", 4.80);
        eggPrices.put("Sep", 4.95);
        eggPrices.put("Oct", 4.89);
        eggPrices.put("Nov", 5.49);
        eggPrices.put("Dec", 6.88);

        // Calculate and print monthly inflation rates
        System.out.println("Monthly Inflation Rates:");
        DecimalFormat df = new DecimalFormat("#.##");
        
        // Convert the key set of eggPrices to an array of month names
        String[] months = eggPrices.keySet().toArray(new String[0]);

        // Iterate through the months to calculate monthly inflation rates
        for (int i = 1; i < months.length; i++) {
            // Get the current and previous month names
            String currentMonth = months[i];
            String previousMonth = months[i - 1];
            
            // Retrieve the prices for the current and previous months
            double currentPrice = eggPrices.get(currentMonth);
            double previousPrice = eggPrices.get(previousMonth);
            
            // Calculate the inflation rate as a percentage
            double inflationRate = ((currentPrice - previousPrice) / previousPrice) * 100;
            
            // Print the calculated inflation rate with formatting
            System.out.println(previousMonth + " to " + currentMonth + ": " + df.format(inflationRate) + "%");
        }
	}
}