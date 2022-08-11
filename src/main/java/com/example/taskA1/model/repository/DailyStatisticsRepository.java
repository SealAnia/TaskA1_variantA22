package com.example.taskA1.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taskA1.model.entity.DailyStatistics;

@Repository
public interface DailyStatisticsRepository extends JpaRepository<DailyStatistics, Integer> {

}
