
public abstract class Vehicle
	{
		protected String brand;
	    public Vehicle()
	    {
	    	System.out.println("Vehicle");
	           //{*some code here*}
	    }
	    public Vehicle(int numWheels)
	    {
	    	System.out.println("wheels");
	            //{*some code here*}
	    }
	    public boolean adrenalineRush()
	    {
	    	System.out.println("adrenaline rush");
			return false;
//	            {*some code here*}
	    }
	    public boolean racecar()
            {
            	System.out.println("vehicle racecar");
            return false;
            // {*some code here*}
            }
	}
