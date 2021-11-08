package com.wtu.mapper;

import com.wtu.entity.Manage;
import org.apache.ibatis.annotations.Param;

public interface ManageMapper {
    //登录
    Manage MangeLogin(@Param("mcode") String mcode,@Param("password") String password);
    
    //测试接口
    void myTest();


}
