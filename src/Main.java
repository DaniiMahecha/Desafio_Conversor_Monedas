import com.daniidev.request.Request;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        System.out.println(request.callApi("USD", "COP"));
    }
}