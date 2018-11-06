package com.itheima.dao;

import com.itheima.domain.Province;

import java.util.List;

public interface ProvinceDao {

    List<Province> findAllProvinces() throws Exception;

}
