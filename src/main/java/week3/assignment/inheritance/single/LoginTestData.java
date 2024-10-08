package week3.assignment.inheritance.single;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginTestData extends TestData{

        public void enterUsername(){
        System.out.println("Enter the username");
    }

    public void enterPassword(){
        System.out.println("Enter the password");
    }

    public static void main(String[] args) {
        System.out.println("---------------Start-----------------");
        TestData testData = new TestData();
        testData.enterCredentials();
        testData.navigateToHomePage();
        System.out.println("-------------------------------------");

        LoginTestData loginTestData = new LoginTestData();
        loginTestData.enterCredentials();
        loginTestData.enterUsername();
        loginTestData.enterPassword();
        loginTestData.navigateToHomePage();
        System.out.println("-----------------End-----------------");

    }

}
