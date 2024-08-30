package com.lab4dx.s04_mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest //스프링컨테이너에서 객체주입 테스트 지원 !!!
class OrderMapperTest {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    void findOrders() {
        System.out.println(orderMapper.findOrders());
    }

    @Test
    void findByCustomerId() {
        System.out.println(orderMapper.findByCustomerId(2));
    }

    @Test
    void findByOrderId() {
    }

    @Test
    void removeByOrderId() {
    }

    @Test
    void update() {
    }

    @Test
    void save() {
    }
}