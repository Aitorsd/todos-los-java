package ariketak;

import java.util.Scanner;

public class BatazBestekoa {
	
	private Integer[] zerrenda;
	private double emaitza;
	
	public BatazBestekoa() {
		sortuZerrenda();
		ZenbakiakIrakurri();
		kalkulatu();
		inprimatu();
	}
	
	private void sortuZerrenda() {
		zerrenda = new Integer[5];
	}

	private void ZenbakiakIrakurri() {
		Scanner sc = new java.util.Scanner(System.in);
		for(Integer i=0;i<zerrenda.length; ++i)
			zerrenda[i] = sc.nextInt();
		sc.close();
	}
	
	private void kalkulatu() {
		Integer batuketa = 0;
		for (Integer i = 0; i < zerrenda.length; ++i)
			batuketa = batuketa + zerrenda[i];
		emaitza = batuketa / zerrenda.length;
	}
	
	private void inprimatu(){
		IO.println("Batazbestekoa hau da: " + emaitza);
	}

	
	public static void main(String[] args) {
		new BatazBestekoa();
	}

}
