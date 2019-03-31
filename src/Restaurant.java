import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Restaurant
{
  /**
   * The main method is static meaning it can be accessed without creating an instance
   * of the Restaurant class.
   */
  public static void main(String[] args)
  //this is my second commit
  //this will be shown only after I commit!
  {
    Map<String, Beverage> menu = new HashMap<String, Beverage>();

    //Create the instances of Beverage and add them to the menu.
    menu.put("Fried Rice", new Beverage("Fried Rice", new BigDecimal(5.50)));
    menu.put("Chicken Rice", new Beverage("Chicken Rice", new BigDecimal(5.00)));
    menu.put("Toast Bread", new Beverage("Toast Bread", new BigDecimal(2.00)));
    menu.put("Mixed Rice", new Beverage("Mixed Rice", new BigDecimal(3.80)));

    //Create an order and add items from the menu to it.
    Order order1 = new Order();
    order1.add(menu.get("Fried Rice"), 2);
    order1.add(menu.get("Toast Bread"), 3);
    order1.add(menu.get("Mixed Rice"), 1);

    System.out.println("Total for order 1: " + order1.getTotal()); 

    //Create another order and add items from the menu to it.
    Order order2 = new Order();
    order2.add(menu.get("Chicken Rice"), 1);
    order2.add(menu.get("Mixed Rice"), 1);
    order2.add(menu.get("Toast Bread"), 2);

    System.out.println("Total for order 2: " + order2.getTotal()); 
  }
}
