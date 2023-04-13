package com.ty.springrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ty.springrestapi.dao.ModelDAO;
import com.ty.springrestapi.dto.VideoModel;
import com.ty.springrestapi.responseentity.ResponseStructure;

@Service
public class ModelClassService {

	@Autowired
	ModelDAO modelDAO;
	
	public ResponseStructure<Integer> createVideo(VideoModel video){
		
		VideoModel createVideo=modelDAO.createVideo(video);
		
		ResponseStructure<Integer> responseStructure= new ResponseStructure<>();
		responseStructure.setData(createVideo.getId());
		responseStructure.setCode(201);
		responseStructure.setStatusmsg(HttpStatus.CREATED);
		responseStructure.setMsg("Data Inserted Successfully");
		
		return responseStructure;
	}
}
