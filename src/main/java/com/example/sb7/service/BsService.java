package com.example.sb7.service;

import com.example.sb7.entity.Bs;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author admin
* @description 针对表【bs】的数据库操作Service
* @createDate 2023-03-16 14:46:55
*/
public interface BsService  {
     List<Bs> queryAll();

     void cc(int id);
}
