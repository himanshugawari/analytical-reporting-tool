package com.himanshu.art.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.art.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
