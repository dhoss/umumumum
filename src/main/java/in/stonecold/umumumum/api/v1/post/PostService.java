package in.stonecold.umumumum.api.v1.post;


import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService implements PostStorage {

  public PostNode create(PostNode post) {
    return post;
  }

  public Optional<PostNode> find(Integer postId) {
    return Optional.empty();
  }

}