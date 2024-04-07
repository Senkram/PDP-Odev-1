package buyuler;

public class Mana {
	private
	int manaDegeri;
	
	public Mana(int manaDegeri) {
		this.manaDegeri = manaDegeri;
	}
	public boolean minus(Mana other) {
		if(manaDegeri >= other.getManaDegeri()) {
			manaDegeri -= other.getManaDegeri();
			return true;
		}
		else {
			return false;
		}
	}
	public int getManaDegeri() {
		return manaDegeri;
	}
}
