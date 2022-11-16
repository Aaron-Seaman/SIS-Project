import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class MainMenu
	{
		static Scanner userIntInput = new Scanner(System.in);
		static int input = 0;
		static Scanner userStringInput = new Scanner(System.in);
		static String pause = "";
		

		public static void mainMenu() throws IOException
			{
				System.out.println("What would you like to do next?\n (1) List Students\n (2) Add or Delete a Student\n (3) Change Grades/Schedule\n (4) Sort Students");
				input = userIntInput.nextInt();
				
				if(input == 1)
					{
						//list method
						Roster.listRoster();
					}
				else if(input == 2)
					{
						//Add/Delete
						System.out.println("Please press enter to return to the main menu.");
						pause = userIntInput.nextLine();
						mainMenu();
					}
				else if(input == 3)
					{
						//Grades/Schedule
						System.out.println("Please press enter to return to the main menu.");
						pause = userIntInput.nextLine();
						mainMenu();
					}
				else if(input == 4)
					{
						System.out.println("How would you like to sort the students?\n (1) Sort Students by Last Name\n (2) Sort Students by GPA\n (3) Sort Students by Period");
						input = userIntInput.nextInt();
						
							if(input == 1)
								{
									Collections.sort(Roster.RosterList, new SortLastname());
									MainMenu.displayStudentList();
									MainMenu.mainMenu();
								}
							else if(input == 2)
								{
									Collections.sort(Roster.RosterList, new SortGPA());
									MainMenu.displayStudentList();
									MainMenu.mainMenu();
								}
							else if(input == 3)
								{
									Collections.sort(Roster.RosterList, new SortPeriod());
									MainMenu.displayStudentList();
									MainMenu.mainMenu();
								}
							else
								{
									System.out.println("I'm sorry, that is not an option. Please try again.\n");
									mainMenu();
								}
							
						System.out.println("Please press enter to return to the main menu.");
						pause = userIntInput.nextLine();
						mainMenu();
					}
				else
					{
						System.out.println("I'm sorry, that is not an option. Please try again.\n");
						mainMenu();
					}
			}
		public static void displayStudentList()
			{
				int menuCounter = 1;
				for(Student s : Roster.RosterList)
					{
						System.out.printf("%-4d" , menuCounter);
						System.out.printf("%-8s %-12s" , s.getFirstName() , s.getLastName());
						System.out.printf("GPA: %.2f" , s.getGpa());
						System.out.printf("%-8s %-2s" , "  P1 " + s.getFirstClass() , s.getFirstGrade());
						System.out.printf("%-8s %-2s" , " P2 " + s.getSecondClass() , s.getSecondGrade());
						System.out.printf("%-8s %-2s" , " P3 " + s.getThirdClass() , s.getThirdGrade() + "\n");
						
						menuCounter++;
					} 
			}
	}
