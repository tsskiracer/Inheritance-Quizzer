

public class Car extends Vehicle
        {
        public Car()
                {
                	System.out.println("Car");
                // {*some code here*}
                }
        public boolean racecar()
        
                {
                	super.racecar();
                	System.out.println("Racecar");
                return false;
                // {*some code here*}
                }
}