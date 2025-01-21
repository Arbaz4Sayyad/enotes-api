package in.arbii.service;

import java.util.List;

import in.arbii.dto.CategoryDto;
import in.arbii.dto.CategoryReponse;

public interface CategoryService {

	public Boolean saveCategory(CategoryDto categoryDto);
	
	public List<CategoryDto> getAllCategory();
	
	public List<CategoryReponse> getActiveCategory();

	public CategoryDto getCategoryById(Integer id);

	public Boolean deleteCategory(Integer id);
}
