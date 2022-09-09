package com.example.springboot.service.impl;

import com.example.springboot.entity.Movie;
import com.example.springboot.mapper.MovieMapper;
import com.example.springboot.service.IMovieService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pluto
 * @since 2022-06-04
 */
@Service
public class MovieServiceImpl extends ServiceImpl<MovieMapper, Movie> implements IMovieService {

}
