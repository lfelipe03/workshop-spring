package com.luizfelipe.course.repositories;

import com.luizfelipe.course.entities.Category;
import com.luizfelipe.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
