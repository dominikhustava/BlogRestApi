package com.blogapi.repository;

import com.blogapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
 //JpaRepository extends PagingAndSortingRepository, CrudRepository
    //no need to add @Repository cuz JpaRepository has implementation SimpleJpaRepository, which is anotated with @Repository (and @Transactional too)
}
