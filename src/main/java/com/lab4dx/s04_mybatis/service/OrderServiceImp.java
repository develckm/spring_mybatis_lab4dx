package com.lab4dx.s04_mybatis.service;

import com.lab4dx.s04_mybatis.dto.Order;
import com.lab4dx.s04_mybatis.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderMapper orderMapper; //dao

    @Override
    public List<Order> read() {
        return orderMapper.findOrders();
    }

    @Override
    public List<Order> read(int customerId) {
        return orderMapper.findByCustomerId(customerId);
    }
    @Transactional //자동으로 오류발생시 rollback
    @Override
    public Order readOne(int id) {
        return null;
    }

    @Override
    public int remove(int id) {
        return 0;
    }

    @Override
    public int modify(Order order) {
        return 0;
    }

    @Override
    public int register(Order order) {
        return 0;
    }
}
