package com.sts.dataVisualization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.dataVisualization.entity.DataEntity;

public interface DataRepository extends JpaRepository<DataEntity, Long> {

}
