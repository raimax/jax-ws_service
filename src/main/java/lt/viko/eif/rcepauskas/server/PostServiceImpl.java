package lt.viko.eif.rcepauskas.server;

import lt.viko.eif.rcepauskas.blog.Comment;
import lt.viko.eif.rcepauskas.blog.DataService;
import lt.viko.eif.rcepauskas.blog.Post;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "lt/viko/eif/rcepauskas/server/PostService")
public class PostServiceImpl implements PostService {
    private List<Post> posts = DataService.createPosts();

    @Override
    public Post getPost(Integer postId) {
        for (Post post : this.posts) {
            if (post.getId() == postId) {
                return post;
            }
        }

        return null;
    }

    @Override
    public List<Post> getPosts() {
        return this.posts;
    }

    @Override
    public List<Comment> getComments(Integer postId) {
        for (Post post : this.posts) {
            if (post.getId() == postId) {
                return post.getComments();
            }
        }
        return null;
    }
}
