package com.mx.mybatissample.dao;


import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import com.mx.mybatissample.vo.UserEntity;

@Mapper
public interface IUserDAO {
    public List<UserEntity> listUser();
}
