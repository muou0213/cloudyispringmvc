package com.ncepu.yun.mapper;

import java.util.List;

import com.ncepu.yun.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    List<User> selectAllUser();
}
