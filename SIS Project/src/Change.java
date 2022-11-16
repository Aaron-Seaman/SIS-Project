import java.util.Scanner;

public class Change 
{

	public static void main(String[] args) 
	{
		Scanner change = new Scanner(System.in);
		
		System.out.println("Change Student Grades/Schedule");
		System.out.println("    (1) Change Grade");
		System.out.println("    (2) Switch Classes");
		System.out.println("    (3) Return to the Main Menu");
		
		int number = change.nextInt();
		
		if(number == 1)
		{
			for(int i = 0; i<Roster.roster.size(); i++)
			{
			System.out.println("What is the first name of the student whose grade you would like to change?");
			String grade = change.nextLine();
			if(grade.equals(studentNamesFile))
			{
				System.out.println("Which class would you like to switch your grade in?");
				String classy = change.nextLine();
				
				if(classy.equals(studentNamesFile))
				{
					System.out.println("What would you like the current grade to be changed to?");
					String newGrade = change.nextLine();

					for(int i = 0; i<studentNamesFile.length; i++)
					{
						if(newGrade.equals(StudentNamesFile))
						{
							//studentNamesFile.setGrade(i);
						}
					}
				}
				else
				{
					System.out.println("That is not a student.");
				}
			}
			}
		}
		else if(number == 2)
		{
			System.out.println("What is the first name of the student whose class you would like to change?");
			String student = change.nextLine();
			
			if(student.equals(studentNamesFile))
			{
				System.out.println("What class would you like to change?");
				String classy = change.nextLine();
				
				if(classy.equals(studentNamesFile))
				{
					System.out.println("What is the new class you would like to be put into?");
					String newClass = change.nextLine();
					
					for(int i = 0; i<studentNamesFile.length; i++)
					{
						if(newClass.equals(StudentNamesFile))
						{
							//studentNamesFile.setClass(i)
						}
					}
				}
				else
				{
					System.out.println("That is not one of the options.");
				}
			}
			else
			{
				System.out.println("That is not a student.");
			}
		}
		else
		{
			//return them to the main menu
		}
		

	}

}
