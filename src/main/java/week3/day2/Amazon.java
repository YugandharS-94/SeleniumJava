package week3.day2;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery");

	}

	@Override
	public void upiPayments() {
		System.out.println("UPI Payments");

	}

	@Override
	public void cardPayments() {
		System.out.println("Card Payments");

	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking");

	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Payment details recorded");

	}
	
	public static void main(String[] args) {
		
		Amazon amazon = new Amazon();
		
		amazon.cashOnDelivery();
		amazon.upiPayments();
		amazon.cardPayments();
		amazon.internetBanking();
		amazon.recordPaymentDetails();
	}

}
