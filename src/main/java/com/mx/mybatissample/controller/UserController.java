package com.mx.mybatissample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.mybatissample.dao.IUserDAO;
import com.mx.mybatissample.vo.UserEntity;


@Controller
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserDAO userDAO;

    @RequestMapping("/user")
    public @ResponseBody Map<String, Object> news() throws Exception {
        Map<String, Object> rtnObj = new HashMap<> ();

        List<UserEntity> userList = userDAO.listUser();
        logger.info("news->" + userList.toString());

        rtnObj.put("news_list", userList);
        return rtnObj;
    }
}