package com.aaa.test.service.impl;

import com.aaa.test.entity.Role;
import com.aaa.test.dao.RoleDao;
import com.aaa.test.service.RoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {

}
