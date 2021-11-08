package com.wtu.service;

import com.wtu.entity.Room;
import com.wtu.util.Params;

import java.util.List;

public interface RoomService {
    //查询空房间
    List<Room> nullRoom();
    //分页查询空房间
    List<Room> nullRoom(Params params);
    //分页查询满房间
    List<Room> fullRoom(Params params);
    //线下订房
    void resRoom(int rid);
    //查询 根据rid查询出房间
    Room selectRoomById(int rid);

    //显示维修中的房间 3
    List<Room> fixRoom(Params params);
    //显示预定中的房间 2
    List<Room> ingRoom(Params params);
    //维修 状态改为3
    void badRoom(int rid);
    //退房，维修好了 状态改为0
    void quitRoom(int rid);

    int selectRoomCount();
    //更改room状态为2
    void bookRoom(int rid);
}
