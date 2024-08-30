package com.lab4dx.s04_mybatis.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter@Setter //Lombok : 컴파일할때 자동으로 get set 을 명시(Structure)
@ToString
public class Order {
    /* table ORDERS
    ORDER_ID
    ORDER_DATE
    CUSTOMER_ID
    PRODUCT_ID
    QUANTITY*/
    private int orderId;//** 변수명을 _로 작성하면 나중에 해결할 수 없는 문제가 발생
    private Date orderDate;
    private int customerId;
    private int productId;
    private int quantity;
}
