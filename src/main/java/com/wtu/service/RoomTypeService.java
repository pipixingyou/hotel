package com.wtu.service;

import com.wtu.entity.RoomType;

public interface RoomTypeService {
    //订房后 根据typeid 修改房间剩余数量rnums-1
    void orderRoomType(int typeid);
    //订房后 根据typeid 修改房间剩余数量rnums+1
    void quitRoomType(int typeid);


    RoomType selectPrice(int typeid);
}
