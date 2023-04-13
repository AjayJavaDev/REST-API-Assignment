package com.ty.springrestapi.dao;

import org.hibernate.tool.schema.spi.CommandAcceptanceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springrestapi.dto.VideoModel;
import com.ty.springrestapi.repository.VideoRepository;

@Repository
public class ModelDAO {

	@Autowired
    private VideoRepository videoRepository;

	public VideoModel createVideo(VideoModel video) {
		if(video!=null) {
        return videoRepository.save(video);
		}
		else {
			throw new CommandAcceptanceException("Validation Error");
		}
 //   return ResponseEntity.status(HttpStatus.CREATED).body(savedVideo.getId());
    
    
	}
}
