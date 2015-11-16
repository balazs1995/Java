import java.io.*;
import java.util.*;


class HuszonEgy{
	public static void main(String [] args){
	String ellenfel ="Gábor";
	String jatekos ;
	String ker2 ;
	String valasz = "Igen";
	String ker3;
	String ker4;
	String ker5;

 	int Lap = 0 , jatekosLap = 0 , ellenLap = 0 , jatekosLap2 = 0 , ellenLap2 = 0 , jatekosLap3 = 0 , ellenLap3 = 0 , jatekosLap4 = 0 , ellenLap4 = 0 , osszesjatekosLap2 = 0 , osszesjatekosLap3 = 0 , osszesjatekosLap4 = 0 , osszesellenLap2 = 0 , osszesellenLap3 = 0 , osszesellenLap4 = 0 , ellenLap5 = 0 , jatekosLap5 = 0 , osszesellenLap5 = 0 , osszesjatekosLap5 = 0;

// Játékos nevének bekérése
	Scanner in = new Scanner(System.in);

	System.out.println(" Huszon Egy játék!");
	System.out.println();
	System.out.println("Írj be egy nevet :");
	jatekos = in.nextLine();

// Csak szöveget ír ki
	System.out.println("A játék elkezdődik: " + jatekos +" és " + ellenfel +" között.");
	System.out.println();
	System.out.println("Sok sikert kívánunk mindkét játékosnak!");
	System.out.println();
	System.out.println("Az első osztás követketik!");
	System.out.println();
	//Mert nincs benne 5-ös és 6-os
	do {
	ellenLap = (int) ((Math.random()*10)+2);
	}

	while (ellenLap == 5 || ellenLap == 6);
	Lap = (int) ((Math.random()*10)+2);
	Lap = ellenLap;


	do {
	jatekosLap = (int) ((Math.random()*10)+2);
	}
	while (jatekosLap == 5 || jatekosLap == 6);
	Lap = (int) ((Math.random()*10)+2);
	Lap = jatekosLap;

	System.out.println(ellenfel + " lapja :" +ellenLap);
	System.out.println(jatekos + " lapja :" +jatekosLap);
	System.out.println();

// Második Lap Osztás
// Megkérdezi hogy akarjuk e folytatni
	System.out.println("Kérsz lapot? ");
	System.out.println();
	System.out.println(" Igen vagy Nem (Igen/Nem)");
	ker2 = in.nextLine();

// Ha igen akor ismét osztás
	if (ker2.equals(valasz))
		{
			System.out.println();
		System.out.println("A következő osztás");
		System.out.println();

	do {
	ellenLap2 = (int) ((Math.random()*10)+2);
	}

	while (ellenLap2== 5 || ellenLap2 == 6);
	Lap = (int) ((Math.random()*10)+2);
	Lap = ellenLap2;

	do {
	jatekosLap2 = (int) ((Math.random()*10)+2);
	}
	while (jatekosLap2 == 5 || jatekosLap2 == 6);
	Lap = (int) ((Math.random()*10)+2);
	Lap = jatekosLap2;
	// Összeadjuk a lapokat a változókban
	osszesellenLap2=ellenLap+ellenLap2;
	osszesjatekosLap2=jatekosLap+jatekosLap2;

	System.out.println(ellenfel + " lapja :" +ellenLap +"," +ellenLap2 + "\t Összesen a két osztás után : "+ (osszesellenLap2));
	System.out.println(jatekos + " lapja :" +jatekosLap+","+jatekosLap2 +  "\t Összesen a két osztás után : "+ (osszesjatekosLap2));


		}
// Ha nem akkor feltételeknek megfelelően kiírja a dolgokat
		else {
			System.out.println("A játék végetért");
				if (ellenLap > jatekosLap)
				{
					System.out.println();
					System.out.println(ellenfel +" Nyert");
					System.exit(0);

				}
				if (ellenLap < jatekosLap) {
					System.out.println();
					System.out.println(jatekos+ " Nyert");
					System.exit(0);

				}
				if (ellenLap == jatekosLap)
				{
					System.out.println();
						System.out.println("A játék döntetlen");
						System.exit(0);

				}

			System.exit(0);


				}
//azért nyert kettő 11 sel mert ez 21 nek számít
	if (ellenLap == 11 && ellenLap2 == 11)
	{
		System.out.println(ellenfel + " Nyert" );
		System.exit(0);
	}
	if (jatekosLap == 11 && jatekosLap2 == 11)
	{
		System.out.println(jatekos + " Nyert");
		System.exit(0);
	}

		if (osszesellenLap2 > 21 || osszesjatekosLap2 == 21) {
			System.out.println();
			System.out.println("A játék véget ért.");
			System.out.println(jatekos + " Nyert");
			System.exit(0);
			}
		if (osszesjatekosLap2 > 21 || osszesellenLap2 == 21 ){
			System.out.println();
			System.out.println("A játék véget ért.");
			System.out.println(ellenfel + " Nyert");
			System.exit(0);
			}
			if (osszesellenLap2 == osszesjatekosLap2){
				System.out.println("A játék véget ért.");
				System.out.println("A játék döntetlen.");
				System.exit(0);
			}
// Harmadik Lap Osztás
	System.out.println();
	System.out.println("Folytatod? (Igen/Nem)");

	ker3=in.nextLine();

	if(ker3.equals(valasz))
		{
		System.out.println("A következő osztás");

	do {
	ellenLap3 = (int) ((Math.random()*10)+2);
	}

	while (ellenLap3== 5 || ellenLap3 == 6);
	Lap = (int) ((Math.random()*10)+2);
	Lap = ellenLap3;

	do {
	jatekosLap3 = (int) ((Math.random()*10)+2);
	}
	while (jatekosLap3 == 5 || jatekosLap3 == 6);
	Lap = (int) ((Math.random()*10)+2);
	Lap = jatekosLap3;
	osszesellenLap3=ellenLap+ellenLap2+ellenLap3;
	osszesjatekosLap3=jatekosLap+jatekosLap2+jatekosLap3;
	System.out.println(ellenfel + " lapja :" +ellenLap+","+ellenLap2+","+ellenLap3 + "\t Összesen a három osztás után : "+ (osszesellenLap3));
	System.out.println(jatekos + " lapja :" +jatekosLap+","+jatekosLap2+","+jatekosLap3 +  "\t Összesen a három osztás után : "+ (osszesjatekosLap3));

		}
		else {
			System.out.println("A játék végetért");
				if (osszesellenLap2 > osszesjatekosLap2)
				{
					System.out.println(ellenfel +" Nyert");
					System.exit(0);

				}
				if (osszesellenLap2 < osszesjatekosLap2) {
					System.out.println();
					System.out.println(jatekos+ " Nyert");
					System.exit(0);

				}
				if (osszesellenLap2 == osszesjatekosLap2)
				{
					System.out.println();
						System.out.println("A játék döntetlen");
						System.exit(0);

				}

			System.exit(0);


				}

		if(osszesellenLap3 > 21 && osszesjatekosLap3 > 21)
				 {
					 System.out.println();
					 System.out.println("A játék véget ért.");
					 System.out.println();
					 System.out.println("A játékot nem nyerte meg senki.");
					 System.exit(0);
				 }
		if (osszesellenLap3 > 21 || osszesjatekosLap3 == 21){
			System.out.println();
			System.out.println(jatekos + " Nyert");
			System.exit(0);
		}
		if (osszesjatekosLap3 > 21 || osszesellenLap3 == 21){
			System.out.println();
			System.out.println(ellenfel + " Nyert");
			System.exit(0);
		}

		if (osszesellenLap3==osszesjatekosLap3){
			System.out.println();
			System.out.println("A játék döntetlen.");
			System.exit(0);
		}

// Negyedik Lap Osztás

	System.out.println();
	System.out.println("Folytatod? (Igen/Nem)");

	ker4=in.nextLine();

	if(ker4.equals(valasz))
		{
			System.out.println("A következő osztás");

			do {
				ellenLap4 = (int) ((Math.random()*10)+2);
			}

			while (ellenLap4== 5 || ellenLap4 == 6);
			Lap = (int) ((Math.random()*10)+2);
			Lap = ellenLap4;

			do {
				jatekosLap4 = (int) ((Math.random()*10)+2);
			}
			while (jatekosLap4 == 5 || jatekosLap4 == 6);
			Lap = (int) ((Math.random()*10)+2);
			Lap = jatekosLap4;
			// Összegezzük a kiosztott lapokat a negyedik leosztás uzán
			osszesellenLap4=ellenLap+ellenLap2+ellenLap3+ellenLap4;
			osszesjatekosLap4=jatekosLap+jatekosLap2+jatekosLap3+jatekosLap4;

			System.out.println(ellenfel + " lapja :" +ellenLap+","+ellenLap2+","+ellenLap3 +","+ jatekosLap4 + "\t Összesen a négy osztás után : "+ (osszesellenLap4));
			System.out.println(jatekos + " lapja :" +jatekosLap+","+jatekosLap2+","+jatekosLap3 +","+jatekosLap4+  "\t Összesen a négy osztás után : "+ (osszesjatekosLap4));

	}
	else {
		System.out.println("A játék végetért");
			if (osszesellenLap3 > osszesjatekosLap3)
			{
				System.out.println();
				System.out.println(ellenfel +" Nyert");
				System.exit(0);

			}
			if (osszesellenLap3 < osszesjatekosLap3) {
				System.out.println();
				System.out.println(jatekos+ " Nyert");
				System.exit(0);

			}
			if (osszesellenLap3 == osszesjatekosLap3)
			{
				System.out.println();
					System.out.println("A játék döntetlen");
					System.exit(0);

			}

		System.exit(0);


			}

	if(osszesellenLap4 > 21 && osszesjatekosLap4 > 21)
			 {
				 System.out.println();
				 System.out.println("A játék véget ért.");
				 System.out.println();
				 System.out.println("A játékot nem nyerte meg senki.");
				 System.exit(0);
			 }
	if (osszesellenLap4 > 21 || osszesjatekosLap4 == 21){
		System.out.println();
		System.out.println(jatekos + " Nyert");
		System.exit(0);
	}
	if (osszesjatekosLap4 > 21 || osszesellenLap4 == 21){
		System.out.println();
		System.out.println(ellenfel + " Nyert");
		System.exit(0);
	}

	if (osszesellenLap4==osszesjatekosLap4){
		System.out.println();
		System.out.println("A játék döntetlen.");
		System.exit(0);
	}

	// Ötödik Lap Osztás ha szükség lenne rá

		System.out.println();
		System.out.println("Folytatod? (Igen/Nem)");

		ker5=in.nextLine();

		if(ker5.equals(valasz))
			{
				System.out.println("A következő osztás");

				do {
					ellenLap5 = (int) ((Math.random()*10)+2);
				}

				while (ellenLap5== 5 || ellenLap5 == 6);
				Lap = (int) ((Math.random()*10)+2);
				Lap = ellenLap5;

				do {
					jatekosLap5 = (int) ((Math.random()*10)+2);
				}
				while (jatekosLap5 == 5 || jatekosLap4 == 6);
				Lap = (int) ((Math.random()*10)+2);
				Lap = jatekosLap5;
				// Összegezzük a kiosztott lapokat az ötödik leosztás uzán
				osszesellenLap5=ellenLap+ellenLap2+ellenLap3+ellenLap4+ellenLap5;
				osszesjatekosLap5=jatekosLap+jatekosLap2+jatekosLap3+jatekosLap4+ellenLap5;

				System.out.println(ellenfel + " lapja :" +ellenLap+","+ellenLap2+","+ellenLap3 +","+ jatekosLap4 + ","+ellenLap5+ "\t Összesen az öt osztás után : "+ (osszesellenLap4));
				System.out.println(jatekos + " lapja :" +jatekosLap+","+jatekosLap2+","+jatekosLap3 +","+jatekosLap4+","+jatekosLap5 + "\t Összesen az öt osztás után : "+ (osszesjatekosLap4));

		}
		else {
			System.out.println("A játék végetért");
				if (osszesellenLap4 > osszesjatekosLap4)
				{
					System.out.println();
					System.out.println(ellenfel +" Nyert");
					System.exit(0);

				}
				if (osszesellenLap4 < osszesjatekosLap4) {
					System.out.println();
					System.out.println(jatekos+ " Nyert");
					System.exit(0);

				}
				if (osszesellenLap4 == osszesjatekosLap4)
				{
					System.out.println();
						System.out.println("A játék döntetlen");
						System.exit(0);

				}

			System.exit(0);


				}

		if(osszesellenLap5 > 21 && osszesjatekosLap5 > 21)
				 {
					 System.out.println();
					 System.out.println("A játék véget ért.");
					 System.out.println();
					 System.out.println("A játékot nem nyerte meg senki.");
					 System.exit(0);
				 }
		if (osszesellenLap5 > 21 || osszesjatekosLap5 == 21){
			System.out.println();
			System.out.println(jatekos + " Nyert");
			System.exit(0);
		}
		if (osszesjatekosLap5 > 21 || osszesellenLap5 == 21){
			System.out.println();
			System.out.println(ellenfel + " Nyert");
			System.exit(0);
		}

		if (osszesellenLap5 == osszesjatekosLap5){
			System.out.println();
			System.out.println("A játék döntetlen.");
			System.exit(0);
		}


		}
		}
