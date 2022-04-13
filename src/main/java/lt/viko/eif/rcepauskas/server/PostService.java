package lt.viko.eif.rcepauskas.server;

import lt.viko.eif.rcepauskas.blog.Comment;
import lt.viko.eif.rcepauskas.blog.Post;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface PostService {

    @WebMethod
    public Post getPost(Integer postId);
    @WebMethod
    public List<Post> getPosts();
    @WebMethod
    public List<Comment> getComments(Integer postId);
}
