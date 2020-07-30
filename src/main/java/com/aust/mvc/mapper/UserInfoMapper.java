package com.aust.mvc.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
// 接口
public interface UserInfoMapper {
    void updatePoint(@Param("point") Integer point, @Param("userno") String userno);
}