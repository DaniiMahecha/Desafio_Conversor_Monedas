import com.daniidev.request.request.Deserialization;
import com.daniidev.request.request.Request;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        System.out.println(request.callApi("EUR", "COP"));
        Deserialization deserialization = new Deserialization(request.callApi("COP", "USA"));
        System.out.println(deserialization);
    }
}