package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.slave1.Slave1DataBaseMapper;
import com.example.demo.model.CountryModel;

@Service
public class Slave1DataBaseService {
	
	@Autowired
	Slave1DataBaseMapper slave1DataBaseMapper;

	public List<CountryModel> getCountry() throws Exception {
		return slave1DataBaseMapper.getCountry();
	}
}
