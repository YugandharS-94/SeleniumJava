package week3.day1;

public class Safari extends Edge {

	public void readerMode() {
		System.out.println("Entering reader mode");
	}

	public void fullScreenMode() {
		System.out.println("Entering fullscreen mode");
	}

	public static void main(String[] args) {

		Safari sf = new Safari();

		sf.openIncognito();
		sf.clearCache();
		sf.clearCookies();
		sf.openURL();
		sf.readerMode();
		sf.fullScreenMode();
		sf.takeSnap();
		sf.navigateBack();
		sf.closeBrowser();
	}

}
