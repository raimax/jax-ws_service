package lt.viko.eif.rcepauskas.server;

import lt.viko.eif.rcepauskas.blog.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface BlogService {

    @WebMethod
    public List<User> getUsers();
}
