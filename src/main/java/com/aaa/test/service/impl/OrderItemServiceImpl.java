package com.aaa.test.service.impl;

import com.aaa.test.entity.OrderItem;
import com.aaa.test.dao.OrderItemDao;
import com.aaa.test.service.OrderItemService;
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
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItem> implements OrderItemService {

}
