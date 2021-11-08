package com.wtu.mapper;

import com.wtu.entity.RoomType;

public interface RoomTypeMapper {
    //退房后 根据typeid 修改房间剩余数量rnums+1
    void quitRoomType(int typeid);
    //订房后 根据typeid 修改房间剩余数量rnums-1
    void orderRoomType(int typeid);
    //查询房间类型
    RoomType selectPrice(int typeid);
}
