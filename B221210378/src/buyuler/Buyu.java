package buyuler;

public class Buyu {
	private
		String buyuAdi;
		BuyuYetenegi buyuYetenegi;
		BuyuTuru buyuTuru;
		int buyuMenzili;
		int yetenekDegeri; // Hasari - IyilestirmeDegeri vb.
		Mana harcanilanMana;
		BuyuSeviyesi buyuSeviyesi;
	
	public
		Buyu() 
		{
			buyuAdi = null;
			buyuYetenegi = null;
			buyuTuru = null;
			buyuMenzili = 0;
			yetenekDegeri = 0;
			harcanilanMana = null;
			buyuSeviyesi = null;
		}
		public Buyu(String buyuAdi, BuyuYetenegi buyuYetenegi, BuyuTuru buyuTuru, int buyuMenzili, int yetenekDegeri, Mana harcanilanMana, BuyuSeviyesi buyuSeviyesi)
		{
			this.buyuAdi = buyuAdi;
			this.buyuYetenegi = buyuYetenegi;
			this.buyuTuru = buyuTuru;
			this.buyuMenzili = buyuMenzili;
			this.yetenekDegeri = yetenekDegeri;
			this.harcanilanMana = harcanilanMana;
			this.buyuSeviyesi = buyuSeviyesi;
		}
		public int getYetenekdegeri() {
			return yetenekDegeri;
		}
		public BuyuYetenegi getBuyuYetenegi() {
			return buyuYetenegi;
		}
		public Mana getHarcanilanMana() {
			return harcanilanMana;
		}
		public int getBuyuMenzili() {
			return buyuMenzili;
		}
		public BuyuTuru getBuyuTuru() {
			return buyuTuru;
		}
		public BuyuSeviyesi getBuyuSeviyesi() {
			return buyuSeviyesi;
		}
}