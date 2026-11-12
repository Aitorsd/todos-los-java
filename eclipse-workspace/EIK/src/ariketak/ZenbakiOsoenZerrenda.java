package ariketak;

public class ZenbakiOsoenZerrenda {

	private Integer[] zerrenda;

	public ZenbakiOsoenZerrenda() {
		sortuZerrenda();
		zerrendaBete();
		inprimatuZerrenda();
	}

	public Integer[] getZerrenda() {
		return zerrenda;
	}
	
	private void sortuZerrenda() {
		zerrenda = new Integer[5];
	}

	private void zerrendaBete() {
		zerrenda[0] = -1;
		zerrenda[1] = 7;
		zerrenda[2] = 100;
		zerrenda[3] = 5;
		zerrenda[4] = 0;

	}

	public void inprimatuZerrenda() {
		for (Integer i = 0; i < zerrenda.length; ++i)
			IO.println(zerrenda[i]);
	}

}
