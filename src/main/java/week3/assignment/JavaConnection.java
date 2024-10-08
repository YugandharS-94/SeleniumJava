package week3.assignment;

public class JavaConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("Connected to db");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from db");
    }

    @Override
    public void executeUpdate() {
        System.out.println("updated successfully");
    }

    public static void main(String[] args) {
        JavaConnection jConnect = new JavaConnection();

        jConnect.connect();
        jConnect.executeUpdate();
        jConnect.disconnect();
    }
}
