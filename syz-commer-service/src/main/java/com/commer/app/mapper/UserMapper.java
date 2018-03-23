package com.commer.app.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.commer.app.entity.User;

@Component
public interface UserMapper {
	
    //根据用户id获取用户信息
    User getById(Integer id);

}
