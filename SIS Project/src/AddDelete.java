import java.io.IOException;
import java.util.Scanner;

public class AddDelete 
{
	public static void AddStart() throws IOException
	{
		Scanner name = new Scanner(System.in);
		
		System.out.println("Add or Delete a Student");
		System.out.println("    (1) Add a Student");
		System.out.println("    (2) Delete a Student");
		System.out.println("    (3) Return to the Main Menu");
		
		//list method
		
		int input = name.nextInt();
		
		if(input == 1)
		{
			Scanner first = new Scanner(System.in);
			System.out.println("What is the first name of the student you would like to add?");
			String fN = first.nextLine();
			
			Scanner last = new Scanner(System.in);
			System.out.println("What is the last name of the student you would like to add?");
			String lN = last.nextLine();
			
			Scanner gpa = new Scanner(System.in);
			System.out.println("What is the gpa of the student you would like to add?");
			double g = gpa.nextDouble();
			
			Scanner firstC = new Scanner(System.in);
			System.out.println("What is the first class you would like to add?");
			String fC = firstC.nextLine();
			
			Scanner firstG = new Scanner(System.in);
			System.out.println("What is the first grade you would like to add?");
			String fG = firstG.nextLine();
			
			Scanner secondC = new Scanner(System.in);
			System.out.println("What is the second class you would like to add?");
			String sC = secondC.nextLine();
			
			Scanner secondG = new Scanner(System.in);
			System.out.println("What is the second grade you would like to add?");
			String sG = secondG.nextLine();
			
			Scanner thirdC = new Scanner(System.in);
			System.out.println("What is the third class you would like to add?");
			String tC = thirdC.nextLine();
			
			Scanner thirdG = new Scanner(System.in);
			System.out.println("What is the third grade you would like to add?");
			String tG = thirdG.nextLine();
			
			Roster.RosterList.add(new Student(fN, lN, g, fC, fG, sC, sG, tC, tG));
			
			//list method

		}
		else if(input == 2)
		{
			Scanner remove = new Scanner(System.in);
			System.out.println("What is the first name of the student you would like to delete?");
			String delete = remove.nextLine();
			
				for(int i = 0; i<Roster.RosterList.size(); i++)
				{
					if(delete.equals(Roster.RosterList.get(i).getFirstName()))
					{
						Roster.RosterList.remove(i);
					}
				}
		}
		else
		{
			MainMenu.mainMenu();
		}
	
	}

}



