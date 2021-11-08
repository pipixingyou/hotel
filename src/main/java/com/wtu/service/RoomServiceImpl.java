package com.wtu.service;

import com.github.pagehelper.PageHelper;
import com.wtu.entity.Room;
import com.wtu.mapper.RoomMapper;
import com.wtu.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public List<Room> nullRoom() {
        return roomMapper.nullRoom();
    }

    @Override
    public List<Room> nullRoom(Params params) {

        if(params.getPageNum()==0){
            params.setPageNum(1);
        }
        PageHelper.startPage(params.getPageNum(),params.getPageSize());

        return roomMapper.nullRoomParams(params);
    }

    @Override
    public List<Room> fullRoom(Params params) {
        if(params.getPageNum()==0){
            params.setPageNum(1);
        }
        PageHelper.startPage(params.getPageNum(),params.getPageSize());

        return roomMapper.fullRoomParams(params);
    }

    @Override
    public void resRoom(int rid) {
        roomMapper.resRoom(rid);
    }

    @Override
    public Room selectRoomById(int rid) {
        return roomMapper.selectRoomById(rid);
    }

    @Override
    public List<Room> fixRoom(Params params) {
        if(params.getPageNum()==0){
            params.setPageNum(1);
        }
        PageHelper.startPage(params.getPageNum(),params.getPageSize());

        return roomMapper.fixRoom();
    }

    @Override
    public List<Room> ingRoom(Params params) {
        if(params.getPageNum()==0){
            params.setPageNum(1);
        }
        PageHelper.startPage(params.getPageNum(),params.getPageSize());

        return roomMapper.ingRoom();
    }

    @Override
    public void badRoom(int rid) {
        roomMapper.badRoom(rid);
    }

    @Override
    public void quitRoom(int rid) {
        roomMapper.quitRoom(rid);
    }

    @Override
    public int selectRoomCount() {
        return roomMapper.selectRoomCount();
    }

    @Override
    public void bookRoom(int rid) {
        roomMapper.bookRoom(rid);
    }


}
