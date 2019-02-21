package HauserPreis;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Stadtverwaltung verwaltung = new Stadtverwaltung();

		char wahl = ' ';
		int i = 0;
		int anzahl = 0;

		System.out.println("STADTVERWALTUNG\n---------------");
		System.out.println("1 = Einfamilienhaus\n2 = Mehrfamilienhaus\n3 = Hochhaus\n4 = Löschen\n5 = Stopp");

		do {
			System.out.println("1, 2, 3, 4 oder 5? >");
			wahl = scan.next().charAt(0);

			System.out.println("Anzahl Gebäude? >");
			anzahl = scan.nextInt();

			if (wahl == '1') {
				
				for (; i < anzahl; i++) {
					
					verwaltung.hinzufuegen(new EinfamilienHaus());
				}
			} else if (wahl == '2') {
				
				for (; i < anzahl; i++) {
					
					verwaltung.hinzufuegen(new MehrfamilienHaus());
				}
			} else if (wahl == '3') {
				
				for (; i < anzahl; i++) {
					
					verwaltung.hinzufuegen(new HochHaus());
				}
			} else if (wahl == '4' && verwaltung.haeuser.size() > 0) {
				verwaltung.loeschen();
			}

			int summe = verwaltung.preisSumme();
			System.out.println("Die Stadt hat einen Wert von CHF " + summe + " Milionen");

		} while (wahl != '5');

	}
}