package com.ty.springrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springrestapi.dto.VideoModel;
import com.ty.springrestapi.exception.ApiError;
import com.ty.springrestapi.responseentity.ResponseStructure;
import com.ty.springrestapi.service.ModelClassService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping
public class VideoModelController {

	@Autowired
	private ModelClassService modelClassService;

	@ApiOperation("Create a new video")
	@ApiResponses({ @ApiResponse(code = 201, message = "Created", response = ResponseStructure.class),
			@ApiResponse(code = 400, message = "Bad Request",response = ApiError.class) })
	@ResponseStatus(value = HttpStatus.CREATED)
	@PostMapping("/videos")
	public ResponseEntity<?> createVideo(@RequestBody VideoModel video) {
		ResponseStructure<Integer> responseStructure = modelClassService.createVideo(video);
		return new ResponseEntity<ResponseStructure<Integer>>(responseStructure, HttpStatus.CREATED);
	}
}
