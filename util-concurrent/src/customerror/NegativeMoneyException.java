package customerror;

public class NegativeMoneyException extends RuntimeException{
 
	public NegativeMoneyException(String message) {
		super(message);
	}
}
