package com.aaa.test.service.impl;

import com.aaa.test.entity.Order;
import com.aaa.test.dao.OrderDao;
import com.aaa.test.service.OrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {

}
