
public class Hesap {
	private String kullanýci_Adi;
	private String parola;
	private int bakiye;
	
	public Hesap(String kullanýci_Adi, String parola, int bakiye) {
		super();
		this.kullanýci_Adi = kullanýci_Adi;
		this.parola = parola;
		this.bakiye = bakiye;
	}

	public String getKullanýci_Adi() {
		return kullanýci_Adi;
	}

	public void setKullanýci_Adi(String kullanýci_Adi) {
		this.kullanýci_Adi = kullanýci_Adi;
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
