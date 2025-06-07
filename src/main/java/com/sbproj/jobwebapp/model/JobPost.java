package com.sbproj.jobwebapp.model;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_posts")
public class JobPost {
	@Id
	private int postId;
	private String postProfile;
	private String postDesc;
	private Integer reqExperience;
	private List<String> postTechStack;
}