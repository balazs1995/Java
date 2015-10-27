import java.util.Scanner;

class Scan {

	public static void main(String[] args){

				System.out.println("Írj be számot: ");
				Scanner number = new Scanner(System.in);
				int number1 = number.nextInt();

				System.out.println("Mennyit adjunk a számhoz? \n Add meg :");
				int number2 = number.nextInt();

				System.out.println(number1 + " Hozzáadunk : " + number2);
				int result = 0;
				result = number1+number2;
				System.out.println("Az összeg: " + result);

				String nev ;
				Scanner in = new Scanner(System.in);
				System.out.println("Írj be egy nevet :");
				nev = in.nextLine();

				System.out.println("A beírt név: " +nev);

				System.out.println();
	}

	}
