package com.example.demo444;

import com.example.demo444.entity.User;
import com.example.demo444.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Demo444ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    //测试功能。查询user表中的所有数据
    @Test
    public void fiall() {
        List<User> uers = userMapper.selectList(null);
        System.out.println(uers);
    }

}
