package com.sts.dataVisualization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.dataVisualization.entity.DataEntity;
import com.sts.dataVisualization.service.DataService;

@RestController
@RequestMapping("/api/data")
public class DataController {
	
	@Autowired
	private DataService dataService;
	
	@GetMapping("all")
    public List<DataEntity> fetchData() {
        return dataService.fetchData();
    }
}
