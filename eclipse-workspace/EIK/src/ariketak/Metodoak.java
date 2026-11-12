package ariketak;

public class Metodoak {
	private int balioa = 1;
	
	
	void jakinarazi() {
		balioa++;
		IO.println(balioa);
	}

	void inprimatu(String mezua) {
		IO.println(mezua);
	}
	
	int getBalioa() {
		return balioa*2;
	}
	
	String bueltatu(String mezua) {
		return mezua + "*";
	}
	
	public static void main(String[] args) {
		
		ZenbakiOsoenZerrenda zoz = new ZenbakiOsoenZerrenda();
		

	}

}
