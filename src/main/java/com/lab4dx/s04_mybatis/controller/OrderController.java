package com.lab4dx.s04_mybatis.controller;

import com.lab4dx.s04_mybatis.dto.Order;
import com.lab4dx.s04_mybatis.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/list.do")
    public void list(Model model) {
        List<Order> orders=orderService.read();
        model.addAttribute("orders",orders);

    }
    @GetMapping("/detail.do")
    public void detail(int id, Model model) {
        Order order=orderService.readOne(id);
        model.addAttribute("order",order);

    }
    @GetMapping("/modify.do")
    public void modify(int id, Model model) {
        Order order=orderService.readOne(id);
        model.addAttribute("order",order);

    }

}
