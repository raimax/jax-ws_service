package lt.viko.eif.rcepauskas.server;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        String LOCAL_URL = "http://localhost:5050/";

        try {
            Endpoint.publish(LOCAL_URL + "HappyService/BeHappy", new HappyServiceImpl());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
