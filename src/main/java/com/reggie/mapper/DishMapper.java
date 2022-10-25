package com.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zzc
 * @date 2022/10/22 11:22
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
