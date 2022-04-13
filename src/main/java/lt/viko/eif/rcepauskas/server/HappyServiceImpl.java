package lt.viko.eif.rcepauskas.server;

import javax.jws.WebService;

@WebService(endpointInterface = "lt.viko.eif.rcepauskas.server.HappyService")
public class HappyServiceImpl implements HappyService  {
    @Override
    public String getHappyness(String name) {
        return name + ", be happy!";
    }
}
