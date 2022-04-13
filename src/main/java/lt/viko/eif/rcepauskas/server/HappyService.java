package lt.viko.eif.rcepauskas.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HappyService {

    @WebMethod
    public String getHappyness(String name);
}
