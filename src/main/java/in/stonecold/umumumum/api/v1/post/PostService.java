package in.stonecold.umumumum.api.v1.post;


import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService implements PostStorage {

  private final PostRepository postRepository;

  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public PostNode create(PostNode post) {
    return postRepository.save(post);
  }

  public Optional<PostNode> find(Integer postId) {
    return postRepository.findById(postId);
  }

}