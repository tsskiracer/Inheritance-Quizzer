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
				q=question;
				t=aTrue;
				f=aFalse;
				a=answer;
				aN=aNum;
				
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
			problems.add(new Questions("If you were to attempt the code Vehicle v=new Car()    :    v.racecar();   :    Would it run correctly?", "True" , "False", "True", 1));
			
			
		}
		public static void askQuestions()
			{
				Scanner userAnswer=new Scanner(System.in);
				for (int i=0; i<problems.size(); i++)
					{
						System.out.println(problems.get(i).getQuestion());
						System.out.println("To answer, type 1 for 'True' and 2 for 'False'");
						int uA=userAnswer.nextInt();
						if (uA=problems.get(i).getaNum())
							{
								
							}
						
					}
			}
		
	}
