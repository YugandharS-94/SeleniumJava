package week3.assignment.inheritance;

public class WebElement {
    String text;

    public void click() {
        System.out.println("Clicked");
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("Text entered: " + text);
    }

}
