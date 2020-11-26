
public class Hesap {
	private String kullan�ci_Adi;
	private String parola;
	private int bakiye;
	
	public Hesap(String kullan�ci_Adi, String parola, int bakiye) {
		super();
		this.kullan�ci_Adi = kullan�ci_Adi;
		this.parola = parola;
		this.bakiye = bakiye;
	}

	public String getKullan�ci_Adi() {
		return kullan�ci_Adi;
	}

	public void setKullan�ci_Adi(String kullan�ci_Adi) {
		this.kullan�ci_Adi = kullan�ci_Adi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	
	public void paraYatir(int tutar) {
		this.bakiye += tutar;
		System.out.println("Yeni Bakiyeniz: " + bakiye);
	}
	
	public void paraCek(int tutar) {
		if((bakiye -tutar) < 0) {
			System.out.println("Yeterli bakiye yok...");
		}
		else {
			bakiye -= tutar;
			System.out.println("Yeni bakiyeniz : " + bakiye);
		}
	}
	
	
	
}
