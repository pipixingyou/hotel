package com.wtu.service;

import com.github.pagehelper.PageHelper;
import com.wtu.entity.User;
import com.wtu.mapper.UserMapper;
import com.wtu.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> joinUserParams(Params params) {
        if(params.getPageNum()==0){
            params.setPageNum(1);
        }
        PageHelper.startPage(params.getPageNum(),params.getPageSize());
        return userMapper.joinUserParams(params);
    }

    @Override
    public List<User> nullUserParams(Params params) {
        if(params.getPageNum()==0){
            params.setPageNum(1);
        }
        PageHelper.startPage(params.getPageNum(),params.getPageSize());
        return userMapper.nullUserParams(params);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public void deleteUser(int uid) {
        userMapper.deleteUser(uid);
    }

    @Override
    public User selectUser(int uid) {
        return userMapper.selectUser(uid);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public List<User> ingUserParams(Params params) {
        if(params.getPageNum()==0){
            params.setPageNum(1);
        }
        PageHelper.startPage(params.getPageNum(),params.getPageSize());
        return userMapper.ingUserParams(params);
    }

    @Override
    public void quitRoom(int rid) {
        userMapper.quitRoom(rid);
    }

    @Override
    public void ustatusUser(int rid) {
        userMapper.ustatusUser(rid);
    }

    @Override
    public List<User> selectIngUser(int rid) {
        return userMapper.selectIngUser(rid);
    }

    @Override
    public void updateDateUser(int rid, String totime) {
        userMapper.updateDateUser(rid,totime);
    }


}
