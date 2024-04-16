package com.caglarevren.joblisting.repository;

import com.caglarevren.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
