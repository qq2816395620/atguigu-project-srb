package com.soraka.srb.core;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.soraka.srb.core.mapper.DictMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    DictMapper dictMapper;

    @Test
    public void testDataSource() {
        System.out.println("dataSource = " + dataSource);
    }

    @Test
    public void testConnection() throws SQLException {
        log.debug("dataSource.getConnection() = " + dataSource.getConnection());;
    }

    @Test
    public void testDictMapperSelectList() {
        log.debug("dictMapper.selectList() = " + dictMapper.selectList(new QueryWrapper<>()));
    }


}
