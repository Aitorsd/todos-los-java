package businesslogic;

public class Karratua {
	public void marraztu(Integer aldea, Integer altuera) {
			for (Integer n = 0; n < altuera; ++n) {
				for (Integer m = 0; m < altuera; ++m)
					IO.print("*");
				IO.println();
			}
	}
}
