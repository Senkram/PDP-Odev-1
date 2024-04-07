package buyuKullanicilari;
import buyuler.*;

/**
*
* @author Kadir Tuna Yiğit, kadirtunayigit@hotmail.com
* @since 02.04.2024
* <p>
* Buyucu sınıfı buyucu adli nesneleri olusturmak icin vardir.
* </p>
*/

public class Buyucu {
	private
		String adi;
		String soyAdi;
		int sagligi;
		int yasi;
		BuyuTuru anaBuyuTuru;
		BuyucuSeviyesi buyucuSeviyesi;
		Mana manaKapasitesi;
	public
		Buyucu() 
		{
			adi = null;
			soyAdi = null;
			sagligi = 0;
			yasi = 0;
			anaBuyuTuru = null;
			buyucuSeviyesi = null;
			manaKapasitesi = null;
		}
		public Buyucu(String adi, String soyAdi, int sagligi, int yasi, BuyuTuru anaBuyuTuru, BuyucuSeviyesi buyucuSeviyesi, Mana manaKapasitesi)
		{
			this.adi = adi;
			this.soyAdi = soyAdi;
			this.sagligi = sagligi;
			this.yasi = yasi;
			this.anaBuyuTuru = anaBuyuTuru;
			this.buyucuSeviyesi = buyucuSeviyesi;
			this.manaKapasitesi = manaKapasitesi;
		}
		public void BuyuKullan(Buyucu hedefBuyucu, Buyu kullanilacakBuyu /*String buyuAdi, BuyuYetenegi buyuYetenegi, BuyuTuru buyuTuru, int buyuMenzili, int yetenekDegeri, Mana harcanilanMana, BuyuSeviyesi buyuSeviyesi*/) 
		{
			// Buyu kullanilacakBuyu = new Buyu(buyuAdi, buyuYetenegi, buyuTuru, buyuMenzili, yetenekDegeri, harcanilanMana, buyuSeviyesi);
			BuyuYetenegi kullanilacakBuyuYetenegi = kullanilacakBuyu.getBuyuYetenegi();
			if(kullanilacakBuyu.getBuyuTuru() != anaBuyuTuru || this.buyucuSeviyesi.getSeviye() < kullanilacakBuyu.getBuyuSeviyesi().getSeviye())
			{
				BuyuEtkinlesmedi(); // Buyucu buyuyu kullanmaya uygun degil
			}
			if(kullanilacakBuyuYetenegi == BuyuYetenegi.AlanSaldirisi || kullanilacakBuyuYetenegi == BuyuYetenegi.KlonSaldirisi || kullanilacakBuyuYetenegi == BuyuYetenegi.TekYonluSaldiri) 
			{
				if(this == hedefBuyucu) {
					BuyuEtkinlesmedi();
				}
				hedefBuyucu.HasarAl(kullanilacakBuyu);
				if(manaKapasitesi.minus(kullanilacakBuyu.getHarcanilanMana()))
				{
				}
				else 
				{
					BuyuEtkinlesmedi(); // buyucu yeterli manaya sahip degil
				}
			}
			
		}
		String BuyuEtkinlesmedi() {
			return "Buyu Etkinlesmedi";
		}
		void HasarAl(Buyu saldiranBuyu) {
			BuyuYetenegi buyuYetenegi = saldiranBuyu.getBuyuYetenegi();
			if(buyuYetenegi == BuyuYetenegi.AlanSaldirisi || buyuYetenegi == BuyuYetenegi.KlonSaldirisi || buyuYetenegi == BuyuYetenegi.TekYonluSaldiri)
			sagligi -= saldiranBuyu.getYetenekdegeri();
			if(sagligi <= 0) {
				System.out.println(Oldun());
			}
		}
		String Oldun() {
			return "Ben oldum hadi bye.";
		}
		public Mana getManaKapasitesi() {
			return manaKapasitesi;
		}
}
