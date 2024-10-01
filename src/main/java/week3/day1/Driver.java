package week3.day1;

public class Driver {

	public void loadUrl(String url, boolean status) {

		System.out.println("Url: " + url + '\n' + "Status: " + status);

	}

	public void loadUrl(String url) {
		System.out.println("Url: " + url);
	}

	public static void main(String[] args) {
		Driver driver = new Driver();

		driver.loadUrl("https://wwww.google.com");
		System.out.println("\n");
		driver.loadUrl("https://wwww.google.com", true);
	}
}
