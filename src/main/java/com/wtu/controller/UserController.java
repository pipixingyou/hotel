package com.wtu.controller;

import com.github.pagehelper.PageInfo;
import com.wtu.entity.User;
import com.wtu.service.RoomService;
import com.wtu.service.RoomTypeService;
import com.wtu.service.UserService;
import com.wtu.util.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user/all")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoomTypeService roomTypeService;
    @Autowired
    private RoomService roomService;



    @RequestMapping("/userlist")
    public ModelAndView userlist(Params params){
        ModelAndView mv = new ModelAndView();
        List<User> userList = userService.joinUserParams(params);
        PageInfo<User> pageInfo = new PageInfo<>(userList);

        mv.addObject("params",params);
        mv.addObject("pageInfo",pageInfo);

        mv.setViewName("manage/userlist");
        return mv;
    }

    @RequestMapping("/nullUserList")
    public ModelAndView nullUserList(Params params){
        ModelAndView mv = new ModelAndView();
        List<User> userList = userService.nullUserParams(params);
        PageInfo<User> pageInfo = new PageInfo<>(userList);

        mv.addObject("params",params);
        mv.addObject("pageInfo",pageInfo);

        mv.setViewName("manage/nulluserlist");
        return mv;
    }

    @RequestMapping("/adduser")
    public ModelAndView adduser(User user,String typeid){
        ModelAndView mv = new ModelAndView();


        // 房间状态 rstatus变为1  房间人数rcount+1
        roomService.resRoom(user.getRid());
        //房间状态为0时 添加客户 房间剩余数才-1
        if(roomService.selectRoomById(user.getRid()).getRstatus()==0){
            roomTypeService.orderRoomType(Integer.parseInt(typeid));
        }

        if(user.getUstatus()==null||user.getUstatus()==0){
            user.setUstatus(1);
        }

        //添加用户
        int i = userService.addUser(user);


        mv.setViewName("redirect:/user/all/userlist");
        return mv;
    }


    //查询用户信息回显 uid
    @RequestMapping("/selectUser")
    public ModelAndView selectUser(int uid){
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(uid);
        mv.addObject("user",user);
        mv.setViewName("manage/updateuser");
        return mv;
    }
    //修改用户信息
    @RequestMapping("/updateUser")
    public ModelAndView updateUser(User user){
        ModelAndView mv = new ModelAndView();
        userService.updateUser(user);
        mv.setViewName("redirect:/user/all/userlist");
        return mv;
    }

    //删除用户历史信息
    @RequestMapping("deleteUser")
    public ModelAndView deleteUser(int uid){
        ModelAndView mv = new ModelAndView();

        userService.deleteUser(uid);
        mv.setViewName("redirect:/user/all/nullUserList");
        return mv;
    }


    //查询已预定用户信息
    @RequestMapping("/ingUserList")
    public ModelAndView ingUserlist(Params params){
        ModelAndView mv = new ModelAndView();
        List<User> userList = userService.ingUserParams(params);
        PageInfo<User> pageInfo = new PageInfo<>(userList);

        mv.addObject("params",params);
        mv.addObject("pageInfo",pageInfo);

        mv.setViewName("manage/inguserlist");
        return mv;
    }

    //跳转添加用户界面
    @RequestMapping("/skpiupdateuser")
    public ModelAndView skpiupdateuser(Params params){
        ModelAndView mv = new ModelAndView();

        mv.addObject("params",params);

        mv.setViewName("manage/appinfoadd");
        return mv;
    }


    //跳转到预定页面
    @RequestMapping("/userInterface")
    public ModelAndView userInterface(int rid){
        ModelAndView mv = new ModelAndView();

        mv.addObject("rid",rid);
        mv.setViewName("user/book");
        return mv;
    }
}
