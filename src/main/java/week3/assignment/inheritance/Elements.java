package week3.assignment.inheritance;

public class Elements extends Button{

    public static void main(String[] args) {

        Button button = new Button();

        TextField textField = new TextField();

        CheckBoxButton checkBoxButton = new CheckBoxButton();

        RadioButton radioButton = new RadioButton();

        button.click();
        button.submit();

        textField.setText("Hello World");
        textField.getText();

        checkBoxButton.clickCheckButton();
        checkBoxButton.click();

        radioButton.selectRadioButton();
        radioButton.click();
    }
}
