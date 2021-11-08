package com.wtu.service;

import com.wtu.entity.Manage;
import com.wtu.mapper.ManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private ManageMapper manageMapper;

    @Override
    public Manage MangeLogin(String mcode, String password) {
        return manageMapper.MangeLogin(mcode,password);
    }
}
