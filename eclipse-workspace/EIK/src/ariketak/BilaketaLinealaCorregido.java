package ariketak;


import java.util.Scanner;


public class BilaketaLinealaCorregido {

	private Integer[] balioak;

	private Integer bilatzekoBalioa;

	private final Integer muga = 5;

	private Scanner sc;

	private Boolean topatuDa;


	public BilaketaLinealaCorregido() {

		sc = new Scanner(System.in);


		abiarazi();

		balioakEskatu();

		bilatzekoBalioaEskatu();

		bilatu();

		inprimatuEmaitza();

		

		sc.close();

	}


	private void abiarazi() {

		balioak = new Integer[muga];

	}


	private void balioakEskatu() {

		IO.println("Sartu zerrendaren balioak");

		for (Integer i = 0; i < balioak.length; ++i)

			balioak[i] = sc.nextInt();

	}


	private void bilatzekoBalioaEskatu() {

		IO.println("Sartu bilatzeko balioa");

		bilatzekoBalioa = sc.nextInt();

	}


	private void bilatu() {

		topatuDa = false;

		for (Integer i = 0; i < balioak.length; ++i)

			if (balioak[i] == bilatzekoBalioa)

				topatuDa = true;

	}


	private void inprimatuEmaitza() {

		if (topatuDa == true)

			IO.print("Topatu da");

		else

			IO.print("Ez da topatu");

	}


	public static void main(String[] args) {

		new BilaketaLinealaCorregido();

	}


}