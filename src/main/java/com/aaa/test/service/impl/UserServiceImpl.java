package com.aaa.test.service.impl;

import com.aaa.test.entity.User;
import com.aaa.test.dao.UserDao;
import com.aaa.test.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
