package week3.day1;

public class Edge extends Chrome {

	public void openURL() {
		System.out.println("Opening the URL in the Edge Browser");
	}

	public void takeSnap() {
		System.out.println("Taking snapshot");
	}

	public void clearCookies() {
		System.out.println("Cleaning Cookies");
	}

	public static void main(String[] args) {
		Edge eg = new Edge();
		eg.openIncognito();
		eg.clearCookies();
		eg.openURL();
		eg.takeSnap();
		eg.closeBrowser();

	}

}
