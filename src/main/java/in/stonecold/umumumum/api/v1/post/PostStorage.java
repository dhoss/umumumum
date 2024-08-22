package in.stonecold.umumumum.api.v1.post;

import java.util.Optional;

public interface PostStorage {

  PostNode create(PostNode post);

  Optional<PostNode> find(Integer postId);

}