package com.eventmanagement.dto;

import java.util.ArrayList;
import java.util.List;

import com.eventmanagement.entity.Category;

import lombok.Data;

@Data
public class CategoryResponseDto extends CommonApiResponse {
	
	private List<Category> categories = new ArrayList<>();

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	} 
	
	
	

}
