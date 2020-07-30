package com.aust.mvc.service;

import org.springframework.stereotype.Service;

@Service
public interface IUserOrderService {

    void placeOrder(String userno, String orderno, Double price);
}