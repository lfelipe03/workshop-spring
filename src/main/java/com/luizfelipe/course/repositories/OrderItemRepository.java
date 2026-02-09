package com.luizfelipe.course.repositories;

import com.luizfelipe.course.entities.OrderItem;
import com.luizfelipe.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
