package com.aaa.test.service.impl;

import com.aaa.test.entity.Product;
import com.aaa.test.dao.ProductDao;
import com.aaa.test.service.ProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductDao, Product> implements ProductService {

}
