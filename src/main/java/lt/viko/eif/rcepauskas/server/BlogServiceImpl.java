package lt.viko.eif.rcepauskas.server;

import lt.viko.eif.rcepauskas.blog.DataService;
import lt.viko.eif.rcepauskas.blog.User;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "lt.viko.eif.rcepauskas.server.BlogService")
public class BlogServiceImpl implements BlogService {
    @Override
    public List<User> getUsers() {
        return DataService.createUsers();
    }
}
