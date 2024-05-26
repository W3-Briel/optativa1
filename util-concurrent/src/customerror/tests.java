package customerror;

public class tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountM angel = new AccountM("angel");

		try {
			angel.ingresarDinero(-12312);
		} catch (NegativeMoneyException e){
			e.printStackTrace(System.out);
		} finally {
			
			System.out.println("fin del programita");
		}
		
	}

}
