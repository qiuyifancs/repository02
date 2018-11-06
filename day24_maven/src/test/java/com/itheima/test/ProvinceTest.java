package com.itheima.test;

import com.itheima.dao.ProvinceDao;
import com.itheima.dao.impl.ProvinceDaoImpl;
import com.itheima.domain.Province;
import org.junit.Test;

import java.util.List;

public class ProvinceTest {
    @Test
    public void test() throws Exception {
        ProvinceDao dao=new ProvinceDaoImpl();
        List<Province> provinces = dao.findAllProvinces();
        System.out.println(provinces);
    }

}
