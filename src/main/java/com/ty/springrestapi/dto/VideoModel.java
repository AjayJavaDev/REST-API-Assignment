package com.ty.springrestapi.dto;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Entity
@Data
public class VideoModel {
	    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    @NotBlank(message = "Title should be not Blank")
	    private String title;
	    private String description;
	    @Min(value=1000, message="Duration must be at least 1 second")
	    private long duration;
	    private String thumbNail;
	    @DateTimeFormat
	    private Date createdTime;

}
