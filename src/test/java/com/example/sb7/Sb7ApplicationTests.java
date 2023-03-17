package com.example.sb7;

import com.example.sb7.entity.Bs;
import com.example.sb7.mapper.BsMapper;
import com.example.sb7.service.BsService;
import com.example.sb7.service.impl.BsServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@MapperScan("com.example.sb7")
class Sb7ApplicationTests {
    @Autowired
    BsServiceImpl bsService;
    @Test
    void contextLoads() {
    }

//    @Test
//    public void testInsert(){
//        Bs bs = new Bs();
//        bs.setStuId(3);
//        bs.setStuName("林");
//        bsMapper.insert(bs);
    @Test


    public void queryAll() {
        bsService.queryAll().forEach(System.out::println);
    }
    public void findById(int id){
        bsService.cc(1);
    }
}

