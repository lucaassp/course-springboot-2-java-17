package com.ayty.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayty.course.entities.OrderItem;
import com.ayty.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}