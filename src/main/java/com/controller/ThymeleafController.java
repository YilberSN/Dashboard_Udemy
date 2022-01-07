package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.service.DashboardService;

@Controller
public class ThymeleafController {

	@Autowired
	private DashboardService dashboardService;
	
	@GetMapping("/")
	public String getDashDetail(Model model) {
		model.addAttribute("cr", dashboardService.getTodayRevenueDash());
		model.addAttribute("ei", dashboardService.getAllEmployee());
		return "/index";
	}
}
