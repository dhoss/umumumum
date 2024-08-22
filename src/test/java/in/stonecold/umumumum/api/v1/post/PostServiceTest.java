package in.stonecold.umumumum.api.v1.post;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("unit-test")
@Tag("unit-test")
public class PostServiceTest {


  private final PostService ps = new PostService();


  private final PostNode expectedPost = PostNodeBuilder.builder().id(1).build();

  @Test
  public void create() {
    assertEquals(expectedPost, ps.create(expectedPost));
  }


  @Test
  public void find() {
    assertEquals(Optional.of(expectedPost), ps.find(1));
  }

}