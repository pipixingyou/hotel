package com.wtu.service;

import com.wtu.entity.User;
import com.wtu.util.Params;

import java.util.List;

public interface UserService {

    //分页查询入住的用户
    List<User> joinUserParams(Params params);

    //分页退房的用户查询
    List<User> nullUserParams(Params params);

    //添加住户
    int addUser(User user);
    //删除用户信息
    void deleteUser(int uid);

    //根据id查询用户信息
    User selectUser(int uid);
    // 修改房间内所有用户的状态
    void updateUser(User user);
    //查询已预定用户信息
    List<User> ingUserParams(Params params);

    void quitRoom(int rid);


    //退房 由房间号 将用户状态改为0
    void ustatusUser(int rid);

    //根据rid 查询房间内状态为1的用户
    List<User> selectIngUser(int rid);

    //退房 由rid 和状态=1写入退房日期
    void updateDateUser(int rid, String totime);
}
