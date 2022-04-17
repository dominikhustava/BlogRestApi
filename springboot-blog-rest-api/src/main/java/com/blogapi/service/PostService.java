package com.blogapi.service;

import com.blogapi.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
