import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Roster
	{
		static public ArrayList<Student> RosterList = new ArrayList<Student>();
		
		
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


				

				// test case 

				
						RosterList.add(new Student(firstName, lastName, gpa, period1, period1Grade, period2, period2Grade, period3, period3Grade));
					}
			
			}
		public static void listRoster() throws IOException
		{
			for(int i = 0; i < RosterList.size(); i++)
				{
					System.out.println(RosterList.get(i).getFirstName() + " " + RosterList.get(i).getLastName() + " GPA: " + RosterList.get(i).getGpa() + " First Class: " + RosterList.get(i).getFirstClass() + " Grade: " + RosterList.get(i).getFirstGrade() + " Second Class: " + RosterList.get(i).getSecondClass() + " Grade: " + RosterList.get(i).getSecondGrade() + " Third Class: " + RosterList.get(i).getThirdClass() + " Grade: " + RosterList.get(i).getThirdGrade());
				}
			MainMenu.mainMenu();
		}
	}
