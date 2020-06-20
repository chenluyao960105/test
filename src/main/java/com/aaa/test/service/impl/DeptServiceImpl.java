package com.aaa.test.service.impl;

import com.aaa.test.entity.Dept;
import com.aaa.test.dao.DeptDao;
import com.aaa.test.service.DeptService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-19
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptDao, Dept> implements DeptService {

}
