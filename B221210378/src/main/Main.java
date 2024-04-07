package main;
import buyuKullanicilari.*;
import buyuler.*;

public class Main {

	public static void main(String[] args) {
		
		Buyu atesTopu = new Buyu("atesTopu", BuyuYetenegi.AlanSaldirisi, BuyuTuru.Ates, 300, 1000, new Mana(100), new BuyuSeviyesi(3));
		Buyucu Tuna = new Buyucu("Tuna", "Yiğit", 3000, 20, BuyuTuru.Ates, new BuyucuSeviyesi(4), new Mana(600));
		Buyucu salihBuyucu = new Buyucu();
		Tuna.BuyuKullan(salihBuyucu, atesTopu);
		System.out.print(Tuna.getManaKapasitesi().getManaDegeri());
	}

	
}
