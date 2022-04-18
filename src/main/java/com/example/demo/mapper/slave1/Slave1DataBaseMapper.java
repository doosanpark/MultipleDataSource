package com.example.demo.mapper.slave1;

import java.util.List;
import com.example.demo.model.CountryModel;

public interface Slave1DataBaseMapper {
	public List<CountryModel> getCountry() throws Exception;
}
