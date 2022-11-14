import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Roster
	{
		static public ArrayList<Student> roster = new ArrayList<Student>();
		
		public static void main(String[] args) throws IOException
			{
				fillRoster();
				listRoster();
			}
		
		public static void fillRoster() throws IOException
			{

				Scanner file = new Scanner(new File("studentData.txt"));
				
				while(file.hasNext())
					{
						String firstName = file.next();
						String lastName = file.next();
						double gpa = 0.0;
						String period1 = file.next();
						String period1Grade = file.next();
						String period2 = file.next();
						String period2Grade = file.next();
						String period3 = file.next();
						String period3Grade = file.next();
						
						roster.add(new Student(firstName, lastName, gpa, period1, period1Grade, period2, period2Grade, period3, period3Grade));
					}
			}
		
		public static void listRoster()
		{
			for(int i = 0; i < roster.size(); i++)
				{
					System.out.println(roster.get(i).getFirstName() + " " + roster.get(i).getLastName() + " GPA: " + roster.get(i).getGpa() + " First Class: " + roster.get(i).getFirstClass() + " Grade: " + roster.get(i).getFirstGrade() + " Second Class: " + roster.get(i).getSecondClass() + " Grade: " + roster.get(i).getSecondGrade() + " Third Class: " + roster.get(i).getThirdClass() + " Grade: " + roster.get(i).getThirdGrade());
				}
		}
	}
