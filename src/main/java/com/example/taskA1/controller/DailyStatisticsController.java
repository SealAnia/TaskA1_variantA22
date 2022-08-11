package com.example.taskA1.controller;

import com.example.taskA1.service.impl.DailyStatisticsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DailyStatisticsController {

    private final DailyStatisticsServiceImpl dailyStatisticsService;
    
    @Autowired
    public DailyStatisticsController(DailyStatisticsServiceImpl dailyStatisticsService) {
        this.dailyStatisticsService = dailyStatisticsService;
    }

    @GetMapping(value = "/dailystats")
    public String showDailyStatistics(Model model) {
        var statistics = dailyStatisticsService.getAll();
        model.addAttribute("statistics", statistics);
        return "daily_statistics";
    }			

}
