package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.CountryModel;
import com.example.demo.model.SalaryModel;
import com.example.demo.service.MasterDataBaseService;
import com.example.demo.service.Slave1DataBaseService;

@Controller
public class HomeController {
	@Autowired
	private MasterDataBaseService masterDataBaseService;
	@Autowired
	private Slave1DataBaseService slave1DataBaseService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView goHome(HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		List<SalaryModel> salaryList = masterDataBaseService.getSalary();
		List<CountryModel> countryList = slave1DataBaseService.getCountry();
		mav.addObject("salaryList", salaryList);
		mav.addObject("countryList", countryList);
		mav.setViewName("content/home.html");
		return mav;
	}
}