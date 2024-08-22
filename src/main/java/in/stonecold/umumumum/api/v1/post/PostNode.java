package in.stonecold.umumumum.api.v1.post;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.time.OffsetDateTime;
import java.util.List;

@RecordBuilder
public record PostNode(
    Integer id,
    String title,
    String body,
    OffsetDateTime created,
    OffsetDateTime updated,
    List<PostNode> children
) implements PostNodeBuilder.With {}