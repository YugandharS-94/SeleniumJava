package week3.day1;

public class Chrome extends Browser {

	public void openIncognito() {

		System.out.println("Opening the Incognito browser");
	}

	public void clearCache() {
		System.out.println("Clearing Cache");
	}

	public static void main(String[] args) {

		Chrome cr = new Chrome();
		cr.openIncognito();
		cr.clearCache();
		cr.openURL();
		cr.navigateBack();
		cr.closeBrowser();

	}

}
