package com.lab4dx.s04_mybatis;

import com.lab4dx.s04_mybatis.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class S04MybatisApplicationTests {
    @Autowired
    private OrderMapper orderMapper;
    //단위 테스트 == unit
    //java에서 단위 테스트를 한다 Junit
    //TDD(Test-Driven Development) : 구현전에 테스트부터 -> 테스먼저하고 ->구현
    @Test
    void findOrders() {
        System.out.println(orderMapper.findOrders());
    }

}
