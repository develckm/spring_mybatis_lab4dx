package com.lab4dx.s04_mybatis.mapper;

import com.lab4dx.s04_mybatis.dto.Order;
import org.apache.ibatis.annotations.Mapper;

//com.lab4dx.s04_mybatis.mapper.OrderMapper
import java.util.List;
//Spring Mybatis Container 에서 생성(구현)되고 관리될 객체의 타입이야!
@Mapper
public interface OrderMapper {
    /*
    jpa -> 이름만 작성하면 쿼리를 만들어줍니다.(미리공부)
    jpa 규칙을 dao의 이름으로 많이 사용한다.
    관리자 : 주문 전체  조회 (findAll)
    **로그인 한 유저만 주문가능
    유저 : 내가 주문한 주문리스트 조회(findByCustomerId)
    유저 : 내가 주문한 주문상세 조회(findByOrderId)
    유저가 주문을 취소 (removeByOrderId or remove)
    유저가 주문의 수량변경 (updateQuantity or update)
    유저가 주문 (insert or save)
    */
    List<Order> findOrders();
    List<Order> findByCustomerId(int customerId);
    Order findByOrderId(int orderId);
    int removeByOrderId(int orderId);
    int update(Order order);
    int save(Order order);
}
