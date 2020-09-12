package com.skilldistillery.jet;

import java.util.Scanner;


public class JetMenu {

	public JetMenu() {

//		 switch statement here
		boolean keepGoing = true;
		while (keepGoing) {
			// Enter user options here for next part
			System.out.println("Enter 1 for the fleet list");
			System.out.println("Enter 2 to fly all jets.");
			System.out.println("Enter 3 to view the fastest jet.");
			System.out.println("Enter 4 to view jet with the longest range.");
			System.out.println("Enter 4 to view jet with the longest range.");
			System.out.println("Enter 6 DogFight");
			System.out.println("Enter 7 to add jet to the fleet.");
			System.out.println("Enter 8 to remove a jet from fleet.");
			System.out.println("Enter 9 to quit.");
			String userInput = sc.next();
			switch (userInput) {

			case "1":
				countTrucks(inputArray);

				System.out.println("Would you like to make another selection?");
				break;

			case "2":
				averageRating(inputArray);
				break;
			case "3":
				highestRatedTruck(inputArray);
				break;
			case "4":
				System.out.println("Good-Bye!");
				keepGoing = false;
				break;
			default:
				System.out.println("That's not an option!");
				break;
			}
		}

	}
	}

}
