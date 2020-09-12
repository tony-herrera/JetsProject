package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
}
