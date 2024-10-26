package com.example.demo.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.repo.DynamicAzanTimeRepo;
import com.exaple.demo.modal.DynamicAzanTime;

@Service
public class DynamicAzanTimeService {
    
	@Autowired
	private DynamicAzanTimeRepo dynamicAzanTimerepo;
	
	public DynamicAzanTime addTime(DynamicAzanTime dynamicAzanTime) {
		dynamicAzanTime.setId(UUID.randomUUID().toString().split("_")[0]);
		return dynamicAzanTimerepo.save(dynamicAzanTime);
	}
	
	public List<DynamicAzanTime> findAllTimes(){
		return dynamicAzanTimerepo.findAll();
	}
	
//	public DynamicAzanTime getdynamicAzanTimebyId(String id) {
//		return dynamicAzanTimerepo.findById(id).get();
//		
//	}
	
	 public Optional<DynamicAzanTime> getdynamicAzanTimebyId(String id) {
	        return dynamicAzanTimerepo.findById(id);  // Assuming the repository returns a DynamicAzanTime object
	    }
	 
	 public Page<DynamicAzanTime> getDynamicAzanTime(int page, int size) {
	        PageRequest pageable = PageRequest.of(page, size);
	        return dynamicAzanTimerepo.findAll(pageable);
	    }
}
