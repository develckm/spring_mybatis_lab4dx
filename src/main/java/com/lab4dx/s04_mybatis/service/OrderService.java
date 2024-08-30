package com.lab4dx.s04_mybatis.service;

import com.lab4dx.s04_mybatis.dto.Order;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //트랜잭션을 자동으로 관리하는 컴포넌트
public interface OrderService {
    /* service : dao == 1:1 (너무 간단한 서비를 제공중)
    service : dao == 1:N

    관리자 : 주문 전체  조회 (read)
    유저 : 내가 주문한 주문리스트 조회(read(customerId))
    유저 : 내가 주문한 주문상세 조회(readOne(id))
    유저가 주문을 취소 ( remove(id) )
    유저가 주문의 수량변경 (modify(Order))
    유저가 주문 (register(Order))*/
    List<Order> read();
    List<Order> read(int customerId);
    Order readOne(int id);
    int remove(int id);
    int modify(Order order);
    int register(Order order);
}
