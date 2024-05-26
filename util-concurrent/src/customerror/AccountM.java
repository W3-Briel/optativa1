package customerror;

public class AccountM {
	public int saldo = 0;
	public String name;
	
	public AccountM(String name_account){
		this.name = name_account;
	}
	
	public void ingresarDinero(int dinero) {
		if (dinero < 0) {
			throw new NegativeMoneyException("no puedes ingresar dinero negativo");
		}
		
		saldo+=dinero;
		
		System.out.println("saldo ingresado "+ dinero+ " saldo actual "+ this.saldo);
	};
	
}
