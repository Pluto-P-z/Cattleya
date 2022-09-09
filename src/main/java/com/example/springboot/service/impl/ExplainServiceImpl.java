package com.example.springboot.service.impl;

import com.example.springboot.entity.Explain;
import com.example.springboot.mapper.ExplainMapper;
import com.example.springboot.service.IExplainService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pluto
 * @since 2022-07-10
 */
@Service
public class ExplainServiceImpl extends ServiceImpl<ExplainMapper, Explain> implements IExplainService {

}
