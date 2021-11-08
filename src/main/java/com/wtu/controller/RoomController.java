package com.wtu.controller;

import com.github.pagehelper.PageInfo;
import com.wtu.entity.Room;
import com.wtu.entity.User;
import com.wtu.service.RoomService;
import com.wtu.service.RoomTypeService;
import com.wtu.service.UserService;
import com.wtu.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/manager/backend/app")
public class RoomController {

    @Autowired
    private RoomService roomService;
    @Autowired
    private RoomTypeService roomTypeService;
    @Autowired
    private UserService userService;

/*    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        List<Room> rooms = roomService.nullRoom();



        mv.addObject("rooms",rooms);
        mv.setViewName("manage/nullroom");
        return mv;
    }*/


    //显示所有房间
    @RequestMapping("/list")
    public ModelAndView list(Params params){
        ModelAndView mv = new ModelAndView();
        List<Room> rooms = roomService.nullRoom(params);

        PageInfo<Room> pageInfo = new PageInfo<>(rooms);
        //查询剩余空房
        int count = roomService.selectRoomCount();

        mv.addObject("count",count);
        mv.addObject("params",params);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("manage/nullroom");
        return mv;
    }

    @RequestMapping("/fulllist")
    public ModelAndView fulllist(Params params){
        ModelAndView mv = new ModelAndView();
//        System.out.println(params);
        List<Room> rooms = roomService.fullRoom(params);

        PageInfo<Room> pageInfo = new PageInfo<>(rooms);

        mv.addObject("params",params);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("manage/fullroom");
        return mv;
    }


    @RequestMapping("/appinfoadd")
    public ModelAndView appinfoadd(int rid){
        ModelAndView mv = new ModelAndView();

        mv.addObject("rid",rid);
        mv.setViewName("manage/appinfoadd");
        return mv;
    }

//    维修中的房间 3
//    List<Room> fixRoom();
//    预定中的房间 2
//    List<Room> ingRoom();

    //显示维修房间
    @RequestMapping("/fixRoom")
    public ModelAndView fixRoom(Params params){
        ModelAndView mv = new ModelAndView();
        List<Room> rooms = roomService.fixRoom(params);

        PageInfo<Room> pageInfo = new PageInfo<>(rooms);

        mv.addObject("params",params);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("manage/fixroom");
        return mv;
    }

    //显示预定房间
    @RequestMapping("/ingRoom")
    public ModelAndView ingRoom(Params params){
        ModelAndView mv = new ModelAndView();
        List<Room> rooms = roomService.ingRoom(params);

        PageInfo<Room> pageInfo = new PageInfo<>(rooms);

        mv.addObject("params",params);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("manage/ingroom");
        return mv;
    }

    //修好的房间
    @RequestMapping("finishRoom")
    public ModelAndView finishRoom(int rid,int typeid){
        ModelAndView mv = new ModelAndView();

        roomService.quitRoom(rid);
        roomTypeService.quitRoomType(typeid);
        mv.setViewName("redirect:fixRoom");
        return mv;
    }

    //维修房间 点击维修 状态变为3  房间数-1
    @RequestMapping("/goodRoom")
    public ModelAndView goodhRoom(int rid,int typeid){
        ModelAndView mv = new ModelAndView();

        roomService.badRoom(rid);
        roomTypeService.orderRoomType(typeid);
        mv.setViewName("redirect:fixRoom");
        return mv;
    }

    //取消预定房间
    @RequestMapping("/cancelRoom")
    public ModelAndView cancelRoom(int rid){
        ModelAndView mv = new ModelAndView();

        roomService.quitRoom(rid);
        Room room = roomService.selectRoomById(rid);
        roomTypeService.quitRoomType(room.getTypeid());

        userService.quitRoom(rid);
        mv.setViewName("redirect:list");
        return mv;
    }

    //退房结算价钱
    @RequestMapping("/checkOutRoom")
    public ModelAndView checkOutRoom(int rid){
        ModelAndView mv = new ModelAndView();

        //房间状态清0 人数清0
        roomService.quitRoom(rid);
        Room room = roomService.selectRoomById(rid);
        //房间剩余数+1
        roomTypeService.quitRoomType(room.getTypeid());

        //由rid查询出房间日价钱
        double money = (roomTypeService.selectPrice(room.getTypeid())).getPrice();

        //计算价钱

        Calendar calendar = Calendar.getInstance();
        List<User> userList = userService.selectIngUser(rid);
        User user = userList.get(0);
        Date date1 =user.getFromtime();

        calendar.set(date1.getYear(),date1.getMonth(),date1.getDay());
        long time1 = calendar.getTimeInMillis();
        Date date2 = new Date();
        calendar.set(date2.getYear(),date2.getMonth(),date2.getDay());
        long time2 = calendar.getTimeInMillis();
        long space = (time2-time1)/(1000*60*60*24);

        double price = space*money;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date3 = sdf.format(date2);

        userService.updateDateUser(rid,date3);



        //房间内所有人状态变为0
        userService.ustatusUser(rid);


        mv.addObject("date",date3);
        mv.addObject("rid",rid);
        mv.addObject("space",space);
        mv.addObject("price",price);
        mv.setViewName("manage/bill");
        return mv;
    }

    //预定查看房间
    @RequestMapping("lookRoom")
    public ModelAndView lookRoom(){
        ModelAndView mv = new ModelAndView();
        List<Room> rooms = roomService.nullRoom();

        mv.addObject("rooms",rooms);
        mv.setViewName("user/rlistForuser");
        return mv;
    }


    //预定房间
    @RequestMapping("/bookroom")
    public ModelAndView bookroom(User user){
        ModelAndView mv = new ModelAndView();
        user.setUstatus(2);
        userService.addUser(user);
        roomService.bookRoom(user.getRid());
        Room room = roomService.selectRoomById(user.getRid());
        roomTypeService.orderRoomType(room.getTypeid());

        mv.setViewName("user/yes");
        return mv;
    }
}
