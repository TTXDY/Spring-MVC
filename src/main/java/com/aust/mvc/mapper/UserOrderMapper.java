package com.aust.mvc.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
// 接口
public interface UserOrderMapper {
    void insertOrder(@Param("userno") String userno,
                     @Param("orderno") String orderno,
                     @Param("price") Double price);
}