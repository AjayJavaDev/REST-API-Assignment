package com.ty.springrestapi.dto;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
public class VideoModel {

	    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String title;
	    private String description;
	    private long duration;
	    private String thumbNail;
	    @DateTimeFormat
	    private Date createdTime;

}
