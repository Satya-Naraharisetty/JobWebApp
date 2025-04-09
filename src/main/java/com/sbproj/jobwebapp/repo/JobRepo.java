package com.sbproj.jobwebapp.repo;

import java.util.ArrayList;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbproj.jobwebapp.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>{

}