package in.stonecold.umumumum.api.v1.post;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ActiveProfiles("unit-test")
@Tag("unit-test")
public class PostServiceTest {


  private final PostRepository postRepository = mock(PostRepository.class);

  private final PostService ps = new PostService(postRepository);

  private final int expectedPostId = 1;

  private final PostNode expectedPost = PostNodeBuilder.builder().id(expectedPostId).build();

  @Test
  public void create() {
    when(postRepository.save(any(PostNode.class))).thenReturn(expectedPost);
    assertEquals(expectedPost, ps.create(expectedPost));
  }


  @Test
  public void find() {
    when(postRepository.findById(expectedPostId)).thenReturn(Optional.of(expectedPost));
    assertEquals(Optional.of(expectedPost), ps.find(expectedPost.id()));
  }

}