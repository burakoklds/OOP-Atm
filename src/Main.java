
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		
		Hesap hesap = new Hesap("Burak","12345",2000);
		atm.calis(hesap);
		System.out.println("Programdan çýkýlýyor...");
	}

}
