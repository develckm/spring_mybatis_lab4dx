package com.lab4dx.s04_mybatis.mapper;

import com.lab4dx.s04_mybatis.dto.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest //스프링컨테이너에서 객체주입 테스트 지원 !!!
class OrderMapperTest {
    @Autowired
    private OrderMapper orderMapper;
    @Test
    void save() {
        Order order = new Order();
        order.setOrderId(999);
        order.setCustomerId(1); //fk 는 있는 고객만 참조 가능
        order.setProductId(1);
        order.setQuantity(5);
        int save=orderMapper.save(order);
        System.out.println(save);
    }
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
        System.out.println(orderMapper.findByOrderId(999));
    }


    @Test
    void update() {
        Order order = new Order();
        order.setOrderId(999);
        order.setQuantity(1); //수량을 5개에서 1개로 수정
        int update=orderMapper.update(order);
        System.out.println(update);
        System.out.println(orderMapper.findByOrderId(999));

    }

    @Test
    void removeByOrderId() {
        int remove=orderMapper.removeByOrderId(999);
        System.out.println(remove);
        System.out.println(orderMapper.findByOrderId(999));

    }

}