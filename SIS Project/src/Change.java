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
		//list method
		
		int number = change.nextInt();
		
		if(number == 1)
		{
			Scanner first = new Scanner(System.in);
			System.out.println("What is the first name of the student whose grade you would like to change?");
			String fN = first.nextLine();
			
			for(int i = 0; i<Roster.RosterList.size(); i++)
			{
			if(fN.equals(Roster.RosterList.get(i).getFirstName()))
			{
				Scanner classes = new Scanner(System.in);
				System.out.println("Which class would you like to switch your grade in?");
				String classy = classes.nextLine();
				
				if(classy.equals(Roster.RosterList.get(i).getFirstClass()))
				{
					Scanner grades = new Scanner(System.in);
					System.out.println("What would you like the current grade to be changed to?");
					String newGrade = grades.nextLine();
					Roster.RosterList.get(i).setFirstGrade(newGrade);
					//list method
				}
				else if(classy.equals(Roster.RosterList.get(i).getSecondClass()))
				{
					Scanner grades2 = new Scanner(System.in);
					System.out.println("What would you like the current grade to be changed to?");
					String newGrade2 = grades2.nextLine();
					Roster.RosterList.get(i).setSecondGrade(newGrade2);
					//list method
				}
				else
				{
					Scanner grades3 = new Scanner(System.in);
					System.out.println("What would you like the current grade to be changed to?");
					String newGrade3 = grades3.nextLine();
					Roster.RosterList.get(i).setThirdGrade(newGrade3);
					//list method
				}
			}
			}
		}
		else if(number == 2)
		{
			Scanner first = new Scanner(System.in);
			System.out.println("What is the first name of the student whose class you would like to change?");
			String fN = first.nextLine();
			
			for(int i = 0; i<Roster.RosterList.size(); i++)
			{
			if(fN.equals(Roster.RosterList.get(i).getFirstName()))
			{
				Scanner classes = new Scanner(System.in);
				System.out.println("Which class would you like to be moved out of?");
				String classy = classes.nextLine();
				
				if(classy.equals(Roster.RosterList.get(i).getFirstClass()))
				{
					Scanner changing = new Scanner(System.in);
					System.out.println("What class would you like to be switched in to?");
					String newClass = changing.nextLine();
					Roster.RosterList.get(i).setFirstGrade(newClass);
					//list method
				}
				else if(classy.equals(Roster.RosterList.get(i).getSecondClass()))
				{
					Scanner changing2 = new Scanner(System.in);
					System.out.println("What class would you like to be switched in to?");
					String newClass2 = changing2.nextLine();
					Roster.RosterList.get(i).setSecondGrade(newClass2);
					//list method
				}
				else
				{
					Scanner changing3 = new Scanner(System.in);
					System.out.println("What class would you like to be switched in to?");
					String newClass3 = changing3.nextLine();
					Roster.RosterList.get(i).setThirdClass(newClass3);
					//list method
				}
			}
			}
		}
		else if(number == 3)
		{
			//return to main menu
		}
		else
		{
			System.out.println("Sorry that is not one of the options.");
		}
	}
}