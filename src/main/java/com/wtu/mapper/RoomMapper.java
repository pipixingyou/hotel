package com.wtu.mapper;

import com.wtu.entity.Room;
import com.wtu.util.Params;

import java.util.List;

public interface RoomMapper {
    //已经入住房间
    List<Room> joinRoom();
    //查询空房间
    List<Room> nullRoom();
    //分页查询空房间
    List<Room> nullRoomParams(Params params);
    //退房 房间人数改为0 房间状态改为0
    void quitRoom(int rid);
    //查询 根据rid查询出房间
    Room selectRoomById(int rid);
    //分页查询有人住的房间
    List<Room> fullRoomParams(Params params);
    //线下订房
    void resRoom(int rid);
    //维修中的房间 3
    List<Room> fixRoom();
    //预定中的房间 2
    List<Room> ingRoom();
    //维修 状态改为3
    void badRoom(int rid);
    //查询空房数量
    int selectRoomCount();
    //更改room状态为2
    void bookRoom(int rid);
}
