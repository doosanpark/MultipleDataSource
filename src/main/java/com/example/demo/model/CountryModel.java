package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
public class CountryModel {
	
	private int id;
	
	@NonNull
	@Builder.Default
	private String continent = "No CONTINENT";
	
	@NonNull
	@Builder.Default
	private String country = "No Country";
}
