package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	List<Jet> ListOfJets = new ArrayList<>();

	public AirField() {
		populateFleet();
	}

	public void populateFleet() {
		try {

			FileReader fr = new FileReader("LoJ");
			BufferedReader br = new BufferedReader(fr);
			String field;
			while ((field = br.readLine()) != null) {
				String[] fields = field.split(",");
				for (int i = 0; i < fields.length; i++) {
					System.out.println(fields[i]);
					if (fields[0].contains("cargo")) {
						CargoPlane newJet = new CargoPlane(fields[0], Double.parseDouble(fields[1]),
								Integer.parseInt(fields[2]), Double.parseDouble(fields[3]));
						ListOfJets.add(newJet);

					}
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void JetMenu() {

		Scanner sc = new Scanner(System.in);
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

				System.out.println("Would you like to make another selection?");
				break;

			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				break;
			case "7":
				break;
			case "8":
				break;
			case "9":
				System.out.println("Good-Bye!");
				keepGoing = false;
			default:
			}
		}
		sc.close();
	}
}
