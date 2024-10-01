package week3.day1;

public class InheritanceTest {

	public static void main(String[] args) {

		System.out.println("----------------Chrome------------------");
		Chrome chrome = new Chrome();
		chrome.openIncognito();
		chrome.clearCache();
		chrome.openURL();
		chrome.closeBrowser();
		System.out.println("----------------------------------\n");
		
		System.out.println("----------------Edge------------------");
		Edge edge = new Edge();
		edge.openIncognito();
		edge.clearCookies();
		edge.openURL();
		edge.takeSnap();
		edge.closeBrowser();
		System.out.println("----------------------------------\n");
		
		System.out.println("----------------Safari------------------");
		Safari safari = new Safari();
		safari.openIncognito();
		safari.clearCache();
		safari.clearCookies();
		safari.openURL();
		safari.readerMode();
		safari.fullScreenMode();
		safari.takeSnap();
		safari.navigateBack();
		safari.closeBrowser();
		System.out.println("----------------------------------\n");
	}

}
