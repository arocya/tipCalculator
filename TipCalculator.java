
/**
 * Write a description of class TipCalculator here.
 * 
 * @author Arion Almond 
 * @version 1/28/14
 */

public class TipCalculator
{
    private double mealCost;
    private double percent;
    private double tipAmount;
    
    public TipCalculator(double inMeal, double inPercent)
    {
        mealCost = inMeal;
        percent = inPercent/100.0;
        tipAmount = mealCost * percent;
        
    }
}
