package com.example.sb7.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sb7.entity.Bs;
import com.example.sb7.mapper.BsMapper;
import com.example.sb7.service.BsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author admin
* @description 针对表【bs】的数据库操作Service实现
* @createDate 2023-03-16 14:46:55
*/
@Service
public class BsServiceImpl extends ServiceImpl<BsMapper, Bs>
    implements BsService {
   @Autowired
    BsMapper bsMapper;
    public List<Bs> queryAll() {
        return this.list();
    }

    @Override
    public void cc(int id) {
        bsMapper.findById(id);
    }



}




