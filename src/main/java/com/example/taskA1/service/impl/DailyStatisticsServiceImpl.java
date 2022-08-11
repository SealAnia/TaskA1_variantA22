package com.example.taskA1.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskA1.model.entity.DailyStatistics;
import com.example.taskA1.model.repository.DailyStatisticsRepository;
import com.example.taskA1.service.DailyStatisticsService;

@Service
public class DailyStatisticsServiceImpl implements DailyStatisticsService {
	
	private final DailyStatisticsRepository dailyStatisticsServiceRepository;

	@Autowired
	public DailyStatisticsServiceImpl(DailyStatisticsRepository dailyStatisticsServiceRepository) {
		this.dailyStatisticsServiceRepository = dailyStatisticsServiceRepository;
	}

	@Override
	public List<DailyStatistics> getAll() {
		List<DailyStatistics> statistics = dailyStatisticsServiceRepository.findAll();
		
		List<DailyStatistics> todaysStatistics = new ArrayList<DailyStatistics>();
		
		Date today = new Date();
		
		for(DailyStatistics stats : statistics) {
			
			if(TimeUnit.MILLISECONDS.toDays(today.getTime()) - TimeUnit.MILLISECONDS.toDays(stats.getDate().getTime()) == 1) {
				todaysStatistics.add(stats);
			}
		}
		
		return todaysStatistics;
		
	}

}