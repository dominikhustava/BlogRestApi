package com.blogapi.payload;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
public class PostDto {
    private Long id;
    private String title;
    private String description;
    private String content;
}
