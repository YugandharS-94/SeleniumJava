package week3.assignment;

public class APIClient {

    public void sendRequest(String endpoint){
        System.out.println("request sent to : " + endpoint);
    }
    public void sendRequest(String endpoint, String requestBody,boolean requestStatus){
        System.out.println("Request sent to : " + endpoint);
        System.out.println("Request body : " + requestBody);
        System.out.println("Request status : " + requestStatus);
    }

    public static void main(String[] args) {

        APIClient apiClient = new APIClient();
        String URL = "https://reqres.in/api/users";
        String requestBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        boolean status = true;
        System.out.println("------------Single parameter---------------");
        apiClient.sendRequest(URL);

        System.out.println("------------Multiple parameters---------------");
        apiClient.sendRequest(URL,requestBody,status);
        System.out.println("----------------------------------------------");
    }

}
