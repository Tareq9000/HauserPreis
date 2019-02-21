package HauserPreis;
import java.util.ArrayList;
import java.util.List;

public class Stadtverwaltung {

	public Haus haus = new Haus();

	List<Haus> haeuser = new ArrayList<Haus>();
	
	public int preisSumme() {

		int summe = 0;
		
		for (Haus haeuser : haeuser) {
			summe += haeuser.wert;
		}
		
		return summe;
	}
	public void hinzufuegen(Haus haus) {

		haeuser.add(haus);
	}

	public void loeschen() {

		haeuser.remove(haeuser.size() - 1);
	}
}
