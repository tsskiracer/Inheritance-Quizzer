
public class InheritanceQuizzer
	{

		public static void main(String[] args)
			{
				System.out.println("Hello and welcome to the inheritance quizzer");
				System.out.println();
				System.out.println();
				System.out.println("The code below will be referenced for this quiz:");
				printCode();
				
		        
				
			}
		public static void printCode()
		{
			System.out.println("public class Vehicle");
			System.out.println("     { ");
			System.out.println("     protected String brand;");
			System.out.println("     public Vehicle()");
			System.out.println("            {*some code here*}");
			System.out.println("     public Vehicle(int numWheels)");
			System.out.println("            {*some code here*}");
			System.out.println("     public boolean adrenalineRush()");
			System.out.println("            {*some code here*}");
			System.out.println("     }");
			System.out.println();
			System.out.println();
			System.out.println("public class Car extends Vehicle     ");
			System.out.println("     {");
			System.out.println("     public Car()");
			System.out.println("            {*some code here*}");
			System.out.println("     public boolean racecar()");
			System.out.println("            {*some code here*}");
			System.out.println("     }");
			System.out.println();
			System.out.println();
			System.out.println("     public class Truck extends Vehicle");
			System.out.println("     {");
			System.out.println("     public Truck()");
			System.out.println("            {*some code here*}");
			System.out.println("     public Truck(int loadCapacity) ");
			System.out.println("            {*some code here*}");
			System.out.println("     public boolean sleeperCab()");
			System.out.println("            {*some code here*}");
			System.out.println("     }");
			
			
		}
	}
