package com.wtu.service;

import com.wtu.entity.RoomType;
import com.wtu.mapper.RoomTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {
    @Autowired
    private RoomTypeMapper roomTypeMapper;


    @Override
    public void orderRoomType(int typeid) {
        roomTypeMapper.orderRoomType(typeid);
    }

    @Override
    public void quitRoomType(int typeid) {
        roomTypeMapper.quitRoomType(typeid);
    }

    @Override
    public RoomType selectPrice(int typeid) {
        return roomTypeMapper.selectPrice(typeid);
    }
}
