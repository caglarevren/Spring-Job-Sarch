package com.caglarevren.joblisting.repository;

import com.caglarevren.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String>{
}
