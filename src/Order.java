import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class Order
{
  //This line is assigning an instance of HashMap (a standard data structure class 
  //in Java).  A map is a bit like a dictionary, you have a key in this case the
  //beverage that allows you to look-up another value, the quantity.
  private Map<Beverage, Integer> beverages = new HashMap<Beverage, Integer>();

  public BigDecimal getTotal()
  {
    BigDecimal total = BigDecimal.ZERO;

    //Loop over all the beverages that have been added to the map summing the cost.
    for (Beverage beverage : this.beverages.keySet())
    {
      //Convert the quantity in the map to a BigDecimal needed for the multiply method.
      BigDecimal quantity = new BigDecimal(this.beverages.get(beverage));

      total = total.add(beverage.getCost().multiply(quantity));  
    }

    return total;
  }

  public void add(Beverage beverage, Integer quantity)
  {        
    //Store the quantity against the beverage.
    this.beverages.put(beverage, quantity);  
  }
}