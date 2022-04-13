package lt.viko.eif.rcepauskas.server;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        final String LOCAL_URL = "http://localhost:5050/";

        try {
            Endpoint.publish(LOCAL_URL + "BlogService", new BlogServiceImpl());
            Endpoint.publish(LOCAL_URL + "PostService", new PostServiceImpl());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
