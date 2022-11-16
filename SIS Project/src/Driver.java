import java.io.IOException;
import java.util.Scanner;

public class Driver
	{

		static Scanner userIntInput = new Scanner(System.in);
		static int input = 0;
		static Scanner userStringInput = new Scanner(System.in);
		static String pause = "";
//		static ArrayList<Student> Roster = new ArrayList<Student>();
		
		public static void main(String[] args) throws IOException
			{
				// TODO Auto-generated method stub
				Roster.fillRoster();
				System.out.println("Welcome to the student information system! Press enter to continue.");
				pause = userIntInput.nextLine();
				MainMenu.mainMenu();
			}

	}
