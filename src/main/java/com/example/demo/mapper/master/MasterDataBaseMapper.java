package com.example.demo.mapper.master;

import java.util.List;
import com.example.demo.model.SalaryModel;

public interface MasterDataBaseMapper {
	public List<SalaryModel> getSalary() throws Exception;
}
