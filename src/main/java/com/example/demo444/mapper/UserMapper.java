package com.example.demo444.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo444.entity.User;
import org.springframework.stereotype.Repository;
//需要声明对象
@Repository
public interface UserMapper extends BaseMapper<User> {

}
