package com.example.sb7.mapper;

import com.example.sb7.entity.Bs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author admin
* @description 针对表【bs】的数据库操作Mapper
* @createDate 2023-03-16 14:46:55
* @Entity com.example.sb7.entity.Bs
*/
public interface BsMapper extends BaseMapper<Bs> {

        //通过id查询User
        Bs findById(int id);
    }






