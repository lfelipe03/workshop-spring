package com.luizfelipe.course.repositories;

import com.luizfelipe.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {
}
