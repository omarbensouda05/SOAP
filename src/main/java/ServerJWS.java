import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args){
        Endpoint.publish("http://localhost:9191/", new BanqueService());
        System.out.println("Web service déployé sur http://localhost:9191 ");
    }
}
