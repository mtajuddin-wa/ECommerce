package com.Ecommerce.project.repositories;

import com.Ecommerce.project.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
