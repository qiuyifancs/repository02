package com.itheima.dao.impl;

import com.itheima.dao.ProvinceDao;
import com.itheima.domain.Province;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProvinceDaoImpl implements ProvinceDao {
    @Override
    public List<Province> findAllProvinces() throws Exception {
        List<Province> list=new ArrayList<>();
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///day23", "root", "root");
            pst = conn.prepareStatement("SELECT * FROM province");
            rs = pst.executeQuery();
            while (rs.next()){
                Province province=new Province();
                province.setId(rs.getInt("id"));
                province.setName(rs.getString("name"));
                list.add(province);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(rs!=null){
                rs.close();
            }
            if(pst!=null){
                pst.close();
            }
            if(conn!=null){
                conn.close();
            }
        }

        return list;
    }
}
