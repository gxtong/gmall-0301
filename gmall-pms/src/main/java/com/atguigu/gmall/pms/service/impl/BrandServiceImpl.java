package com.atguigu.gmall.pms.service.impl;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.mapper.BrandMapper;
import com.atguigu.gmall.pms.service.BrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-22
 */
@Service
@com.alibaba.dubbo.config.annotation.Service//这是dubbo的service注解，用来暴露服务
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
