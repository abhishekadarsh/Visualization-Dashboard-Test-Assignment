package com.sts.dataVisualization.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.dataVisualization.entity.DataEntity;
import com.sts.dataVisualization.repository.DataRepository;

@Service
public class DataService {
	
	@Autowired
	private DataRepository dataRepository;
	
	public List<DataEntity> fetchData() {
        return dataRepository.findAll();
    }
}
