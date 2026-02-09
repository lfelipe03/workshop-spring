package com.luizfelipe.course.repositories;

import com.luizfelipe.course.entities.Category;
import com.luizfelipe.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
