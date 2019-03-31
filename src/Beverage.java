import java.math.BigDecimal;


public class Beverage {

	  //These are the attributes (fields) of the class.  It's good practice to make them
	  //private so that they can only be accessed from within the class.
	  private String name;
	  private BigDecimal cost;

	  /**
	   * This is the constructor, which is used to create instances of the class.  In
	   * this case it takes the arguments used to initialize the attributes of the class.
	   */
	  public Beverage(String name, BigDecimal cost)
	  {
	    this.name = name;
	    this.cost = cost;
	  }

	  /**
	   * This is a getter, which provides access to the attributes from outside of the  
	   * class.
	   */
	  public BigDecimal getCost()
	  { 
	    return this.cost;
	  }

	  public String getName()
	  { 
	    return this.name;
	  }
}
