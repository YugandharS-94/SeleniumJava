package week3.assignment.inheritance;

public class TextField extends WebElement {

    public void getText() {
        String text = super.text;
        System.out.println("Text retrieved: " + text);
    }
}
