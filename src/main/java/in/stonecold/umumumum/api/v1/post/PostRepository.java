package in.stonecold.umumumum.api.v1.post;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostNode, Integer> {
}