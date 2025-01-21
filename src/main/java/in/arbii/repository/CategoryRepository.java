package in.arbii.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arbii.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

	List<Category> findByIsActiveTrue();
}
