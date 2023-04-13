package com.ty.springrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springrestapi.dto.VideoModel;
import com.ty.springrestapi.repository.VideoRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping
public class VideoModelController {

	    
	    @Autowired
	    private VideoRepository videoRepository;
	    
	    @ApiOperation("Create a new video")
	    @ApiResponses({
	        @ApiResponse(code = 201, message = "Created", response = Integer.class),
	        @ApiResponse(code = 400, message = "Bad Request")
	    })
	    @PostMapping("/videos")
	    public ResponseEntity<?> createVideo(@RequestBody VideoModel video) {
	    	if (video.getTitle() == null || video.getTitle().isEmpty()) {
	            return ResponseEntity.badRequest().body("Title cannot be empty");
	        }
	        if (video.getDuration() < 1000) {
	            return ResponseEntity.badRequest().body("Duration should be 1 or above");
	        }
	        if (video.getCreatedTime() == null) {
	            return ResponseEntity.badRequest().body("Created time should be valid");
	        }
	        System.out.println(video.getThumbNail());
	        VideoModel savedVideo = videoRepository.save(video);
	        return ResponseEntity.status(HttpStatus.CREATED).body(savedVideo.getId());
	    }
}
