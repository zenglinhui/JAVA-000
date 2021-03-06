package com.example.demo.ds2.dao;

import com.example.demo.config.datasource.dynamic.annotation.DynamicDataSource;
import com.example.demo.ds2.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("orderReadDao")
public interface OrderDao {

    @DynamicDataSource(name = "ds2")
    Order findByOrderId(@Param("id") Long id);

}
