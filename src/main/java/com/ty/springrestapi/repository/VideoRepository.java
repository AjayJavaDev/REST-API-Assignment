package com.ty.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.springrestapi.dto.VideoModel;

@Repository
public interface VideoRepository extends JpaRepository<VideoModel, Integer>{

}
