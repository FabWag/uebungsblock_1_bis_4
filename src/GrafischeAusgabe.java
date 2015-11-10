
public class GrafischeAusgabe {

	public static double rotAnteil(int s, int z) {
	
		double abstand;
		
		abstand = Math.sqrt( ((250 - s) * (250 - s)) + ((270 - z) * (270 - z)) );
		
		double anteil;
		
		if (abstand >= 400) {
			anteil = 0;
		} else if (abstand <= 200) {
			anteil = 1;
		} else {
			anteil = abstand * (- 0.005) + 2;
		}
		
		return anteil;
	}
	
	public static double gruenAnteil(int s, int z) {
		
		double abstand;
		
		abstand = Math.sqrt( ((550 - s) * (550 - s)) + ((270 - z) * (270 - z)) );
		
		double anteil;
		
		if (abstand >= 400) {
			anteil = 0;
		} else if (abstand <= 200) {
			anteil = 1;
		} else {
			anteil = abstand * (- 0.005) + 2;
		}
		
		return anteil;
	}
	
	public static double blauAnteil(int s, int z) {
		
		double abstand;
		
		abstand = Math.sqrt( ((400 - s) * (400 - s)) + ((530 - z) * (530 - z)) );
		
		double anteil;
		
		if (abstand >= 400) {
			anteil = 0;
		} else if (abstand <= 200) {
			anteil = 1;
		} else {
			anteil = abstand * (- 0.005) + 2;
		}
		
		return anteil;
	}


	
	public static void main(String[] args) {
	
	/*	Aufgabe1
	 
		Zeichenfenster.zeigeZeichenfenster();
		Zeichenfenster.zeichnePunkt(10 , 10);
		Zeichenfenster.zeichnePunkt(20 , 20);
		Zeichenfenster.zeichnePunkt(30 , 30);
		Zeichenfenster.zeichneLinie(10, 5, 110, 115);
	
		
		Zeichenfenster.zeigeZeichenfenster();
		Zeichenfenster.zeichneLinie(100, 100, 300, 100);
		Zeichenfenster.zeichneLinie(300, 100, 300, 200);
		Zeichenfenster.zeichneLinie(300, 200, 100, 200);
		Zeichenfenster.zeichneLinie(100, 200, 100, 100);
		Zeichenfenster.zeichneEllipse(200, 150, 200, 100);
	*/	
		
		
	/* Aufgabe2
				
		Zeichenfenster.zeigeZeichenfenster();
		
		for (int i = 800; i > 0; i = i - 10) {
			
			Zeichenfenster.zeichneLinie(0, i, i, 0);
		}
	*/	
		
		
	/* Aufgabe 3
		
		Zeichenfenster.zeigeZeichenfenster();
		int d = 100;
		
		for (int i = 200; i <= 500; i = i + 5) {
			
			Zeichenfenster.zeichneEllipse(i, 400, d, d);
			d = d + 5;
		}
	*/	
		
	
	/* Aufgabe 4
		
		Zeichenfenster.zeigeZeichenfenster();
		
		for (int i = 800; i >= 200; i = i - 10) {
			Zeichenfenster.zeichneEllipse(400, 400, i, 1000 - i);
		}
	*/
		
	/* Aufgabe 5
	
		Zeichenfenster.zeigeZeichenfenster();
		
		for (int i = 0; i <= 800; i = i + 8) {
			Zeichenfenster.zeichneLinie(i, 0, 800, i);
			Zeichenfenster.zeichneLinie(0, 800 - i, i, 0);
			Zeichenfenster.zeichneLinie(0, i, i, 800);
			Zeichenfenster.zeichneLinie(i, 800, 800, 800 - i);
		}
	*/
		
	/* Aufgabe 6 + 7
	
	 */
		
		Zeichenfenster.zeigeZeichenfenster();
		for (int z = 0; z <= 800; z++) {
			for (int s = 0; s <= 800; s++) {
				Zeichenfenster.setzeFarbe(rotAnteil(s,z), gruenAnteil(s,z), blauAnteil(s,z));
				Zeichenfenster.zeichnePunkt(s, z);
			}
		}
		
		
	}

}
