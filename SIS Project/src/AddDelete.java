import java.util.Scanner;

public class AddDelete 
{
	public static void main(String[] args)
	{
		Scanner name = new Scanner(System.in);
		
		System.out.println("Add or Delete a Student");
		System.out.println("    (1) Add a Student");
		System.out.println("    (2) Delete a Student");
		System.out.println("    (3) Return to the Main Menu");
		
		int input = name.nextInt();
		
		if(input == 1)
		{
			System.out.println("What is the first and last name of the student you would like to add?");
			String wholeName = name.nextLine();
			Student.add(wholeName);
		}
		else if(input == 2)
		{
			System.out.println("What is the first and Last name of the student you would like to delete?");
			String wholeName = name.nextLine();
			
				for(int i = 0; i<Student.length; i++)
				{
					if(wholeName.equals(Student))
					{
						Student.remove(i);
					}
				}
		}
		else
		{
			//return them to the main menu
		}
		
			
	}
	
}
