package com.aaa.test.service.impl;

import com.aaa.test.entity.Type;
import com.aaa.test.dao.TypeDao;
import com.aaa.test.service.TypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeDao, Type> implements TypeService {

}
