import java.util.ArrayList;
import java.util.*;
public class Questions
	{
		private String question;
		private String aTrue;
		private String aFalse;
		private String answer;
		private int aNum;
		static ArrayList<Questions> problems = new ArrayList<Questions>();
		public Questions(String q, String t, String f, String a, int aN)
			{
				question=q;
				aTrue=t;
				aFalse=f;
				answer=a;
				aNum=aN;
				
			}
		public String getQuestion()
			{
				return question;
			}
		public void setQuestion(String question)
			{
				this.question = question;
			}
		public String getaTrue()
			{
				return aTrue;
			}
		public void setaTrue(String aTrue)
			{
				this.aTrue = aTrue;
			}
		public String getaFalse()
			{
				return aFalse;
			}
		public void setaFalse(String aFalse)
			{
				this.aFalse = aFalse;
			}
		
		public int getaNum()
			{
				return aNum;
			}
		public void setaNum(int aNum)
			{
				this.aNum = aNum;
			}
		public String getAnswer()
			{
				return answer;
			}
		public void setAnswer(String answer)
			{
				this.answer = answer;
			}
		
		
		public static void fillList()
		{
			problems.add(new Questions("If you were to attempt the code Vehicle v=new Car()    :    v.racecar();   :    Would it run correctly?", "True" , "False", "False", 2));
            problems.add(new Questions("If you were to attempt the code Car c=new Car()        :    c.racecar();   :    Would it run correctly?", "True" , "False", "True", 1));
            problems.add(new Questions("If you were to attempt the code Car c=new Vehicle()    :    c.racecar();   :    Would it run correctly?", "True" , "False", "False", 2));
            problems.add(new Questions("If you were to attempt the code Vehicle v=new Vehicle():    v.racecar();   :    Would it run correctly?", "True" , "False", "False", 2));

            problems.add(new Questions("If you were to attempt the code Vehicle v=new Car()    :    v.adrenalineRush();   :    Would it run correctly?", "True" , "False", "True", 1));
            problems.add(new Questions("If you were to attempt the code Car c=new Vehicle()    :    c.adrenalineRush();   :    Would it run correctly?", "True" , "False", "False", 2));
            problems.add(new Questions("If you were to attempt the code Car c=new Car()        :    c.adrenalineRush();   :    Would it run correctly?", "True" , "False", "True", 1));
            problems.add(new Questions("If you were to attempt the code Vehicle v=new Vehicle():    v.adrenalineRush();   :    Would it run correctly?", "True" , "False", "True", 1));


            problems.add(new Questions("If you were to attempt the code Truck t=new Car()      :   t.sleeperCab();   :    Would it run correctly?", "True" , "False", "False",2));
            problems.add(new Questions("If you were to attempt the code Truck t=new Vehicle()  :   t.sleeperCab();   :    Would it run correctly?", "True" , "False", "False", 2));
            problems.add(new Questions("If you were to attempt the code Vehicle v=new Truck()  : v.Truck(10); :    Would it run correctly?", "True" , "False", "False", 2));
            problems.add(new Questions("If you were to attempt the code Truck t=new Truck()    : t.Truck(20); :    Would it run correctly?", "True" , "False", "True", 1));

            problems.add(new Questions("If you were to attempt the code Truck t=new Truck()    :    t.racecar();   :    Would it run correctly?", "True" , "False", "False", 2));
            problems.add(new Questions("If you were to attempt the code Car c=new Car()    :    c.sleeperCab();   :    Would it run correctly?", "True" , "False", "True", 1));
            problems.add(new Questions("If you were to attempt the code Truck t=new Car()    :    t.sleeperCab();   :    Would it run correctly?", "True" , "False", "False", 2));
            problems.add(new Questions("If you were to attempt the code Vehicle v=new Car()    :    v.sleeperCab();   :    Would it run correctly?", "True" , "False", "False", 2));

            problems.add(new Questions("If you were to attempt the code Car c=new Truck()    :    c.sleeperCab();   :    Would it run correctly?", "True" , "False", "True", 1));
           
            
		}
		public static void askQuestions()
			{
				int counter=0;
				Scanner userAnswer=new Scanner(System.in);
				for (int i=0; i<problems.size(); i++)
					{
						
						
						System.out.println(problems.get(i).getQuestion());
						System.out.println("To answer, type 1 for 'True' and 2 for 'False'");
						int uA=userAnswer.nextInt();
						System.out.println();
						System.out.println("The answer was " + problems.get(i).getAnswer() + ".");
						if (uA==problems.get(i).getaNum())
							{
								System.out.println("You are correct!");
								counter++;
							}
						else
							{
								System.out.println("Sorry, you are incorrect");
							}
						System.out.println();
						
					}
			System.out.println("You got a " + counter + " out of " + problems.size() + ".");
			}

	}