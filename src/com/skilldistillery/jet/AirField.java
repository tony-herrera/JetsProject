package com.skilldistillery.jet;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AirField {

	List<Jet> ListOfJets = new ArrayList<>();

	public AirField() {
		populateFleet();
		JetMenu();
	}

	public void populateFleet() {
		try {

			FileReader fr = new FileReader("LoJ");
			BufferedReader br = new BufferedReader(fr);
			String field;
			while ((field = br.readLine()) != null) {
				String[] fields = field.split(",");
				{
					if (fields[4].contains("cargo")) {
						CargoPlane newJet = new CargoPlane(fields[0], Double.parseDouble(fields[1]),
								Integer.parseInt(fields[2]), Double.parseDouble(fields[3]));
						ListOfJets.add(newJet);
					} else if (fields[4].contains("fighter")) {
						FighterJet newJet = new FighterJet(fields[0], Double.parseDouble(fields[1]),
								Integer.parseInt(fields[2]), Float.parseFloat(fields[3]));
						ListOfJets.add(newJet);
					} else if (fields[4].contains("plain")) {
						PlainJet newJet = new PlainJet(fields[0], Double.parseDouble(fields[1]),
								Integer.parseInt(fields[2]), Float.parseFloat(fields[3]));
						ListOfJets.add(newJet);
					}
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

//		 switch statement here

	public void JetMenu() {

		Scanner sc = new Scanner(System.in);
		boolean keepGoing = false;
		while (!keepGoing) {
			{

				System.out.println("                    `. ___\n"
						+ "                    __,' __`.                _..----....____\n"
						+ "        __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\n"
						+ "  _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\n"
						+ ",'________________                          \\`-._`-','\n"
						+ " `._              ```````````------...___   '-.._'-:\n"
						+ "    ```--.._      ,.                     ````--...__\\-.\n"
						+ "            `.--. `-`                       ____    |  |`\n"
						+ "              `. `.                       ,'`````.  ;  ;`\n"
						+ "                `._`.        __________   `.      \\'__/`\n"
						+ "                   `-:._____/______/___/____`.     \\  `\n"
						+ "                               |       `._    `.    \\\n"
						+ "                               `._________`-.   `.   `.___\n"
						+ "                                             SSt  `------'`");
				// Enter user options here for next part
				System.out.println("Enter 1 for the fleet list");
				System.out.println("Enter 2 to fly all jets.");
				System.out.println("Enter 3 to view the fastest jet.");
				System.out.println("Enter 4 to view jet with the longest range.");
				System.out.println("Enter 5 to load the cargo jets.");
				System.out.println("Enter 6 DogFight");
				System.out.println("Enter 7 to add jet to the fleet.");
				System.out.println("Enter 8 to remove a jet from fleet.");
				System.out.println("Enter 9 to quit.");
				System.out.println("Please make a selection: ");
				String userInput = sc.next();

				switch (userInput) {

				case "1":
					ListOfJets();
					break;

				case "2":
					for (Jet jet : ListOfJets) {
						if (ListOfJets != null) {
							jet.fly();
							System.out.println();
						}
					}
					break;

				case "3":
					SpeedOfJets();
					break;

				case "4":
					RangeOfJets();
					break;

				case "5":
					LoadTheJets();
					break;

				case "6":
					DogFight();
					break;

				case "7":
					addJet();
					break;

				case "8":
					RemoveJet();
					break;

				case "9":
					System.out.println("       /\\\n" + "                         |  |\n"
							+ "                         |  |\n" + "                        .'  '.\n"
							+ "                        |    |\n" + "                        |    |\n"
							+ "                        | /\\ |\n" + "                      .' |__|'.\n"
							+ "                      |  |  |  |\n" + "                     .'  |  |  '.\n"
							+ "                /\\   |   \\__/   |   /\\\n"
							+ "               |  |  |   |  |   |  |  |\n"
							+ "           /|  |  |,-\\   |  |   /-,|  |  |\\\n"
							+ "           ||  |,-'   |  |  |  |   '-,|  ||\n"
							+ "           ||-'       |  |  |  |       '-||\n"
							+ "|\\     _,-'           |  |  |  |           '-,_     /|\n"
							+ "||  ,-'   _           |  |  |  |               '-,  ||\n"
							+ "||-'    =(*)=         |  |  |  |                  '-||\n"
							+ "||                    |  \\  /  |                    ||\n"
							+ "|\\________....--------\\   ||   /--------....________/|\n"
							+ "                      /|  ||  |\\\n" + "                     / |  ||  | \\\n"
							+ "                    /  |  \\/  |  \\\n" + "                   /   |      |   \\   \n"
							+ "                 //   .|      |.   \\\\\n" + "               .' |_./ |      | \\._| '.\n"
							+ "              /     _.-|||  |||-._     \\\n"
							+ "              \\__.-'   \\||/\\||/   '-.__/ ");
					System.out.println("Good-Bye!");
					keepGoing = true;
				default:
				}
			}
		}
		sc.close();
	}

	public void ListOfJets() {
		for (Jet jet : ListOfJets) {
			if (ListOfJets != null) {
				System.out.println(jet);
			}
		}

	}

	public void SpeedOfJets() {
		Jet speedOfJets = ListOfJets.get(0);
		for (int i = 0; i < ListOfJets.size(); i++) {
			Jet speedOfJetTracker = ListOfJets.get(i);
			if (speedOfJets.getSpeed() < speedOfJetTracker.getSpeed()) {
				speedOfJets = speedOfJetTracker;
			}
		}
		System.out.println(speedOfJets);
	}

	public void RangeOfJets() {
		Jet rangeOfJets = ListOfJets.get(0);
		for (int i = 0; i < ListOfJets.size(); i++) {
			Jet rangeOfJetTracker = ListOfJets.get(i);
			if (rangeOfJets.getRange() < rangeOfJetTracker.getRange()) {
				rangeOfJets = rangeOfJetTracker;
			}
		}
		System.out.println(rangeOfJets);
	}

	public void LoadTheJets() {
		for (Jet jet : ListOfJets) {
			if (jet instanceof XJet) {
				((XJet) jet).loadCargo();
			} else {
				continue;
			}
		}
	}

	public void DogFight() {
		for (Jet jet : ListOfJets) {
			if (jet instanceof UNSCInfinity) {
				((UNSCInfinity) jet).bringMasterChief();
			} else {
				continue;
			}
		}
	}

	public void addJet() {
		Scanner sc = new Scanner(System.in);
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("Please, select either a fighter, cargo, or plain type of aircraft: ");
			String model = sc.nextLine();
			model = model.toLowerCase();
			System.out.println("Please, select the name: ");
			String name = sc.nextLine();
			System.out.println("Enter the speed in MPH: ");
			double speed = sc.nextDouble();
			System.out.println("Enter the range: ");
			int range = sc.nextInt();
			System.out.println("Enter the price: ");
			double price = sc.nextDouble();
			if (model.contentEquals("fighter")) {
				this.ListOfJets.add(new FighterJet(name, speed, range, price));
			}

			if (model.contentEquals("cargo")) {
				this.ListOfJets.add(new CargoPlane(name, speed, range, price));
			}

			if (model.contentEquals("plain")) {
				this.ListOfJets.add(new PlainJet(name, speed, range, price));
			}
			sc.nextLine();
			keepGoing = false;
//			sc.close();
		}

	}

	public void RemoveJet() {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		for (Jet jet : ListOfJets) {
			System.out.println(i + " " + jet.getModel());
			;
			i++;
		}
		System.out.println("Select the number corresponding to the ship you would like to delete:");
		int delete = sc.nextInt();
		this.ListOfJets.remove(delete - 1);
//		sc.close();
	}

}
