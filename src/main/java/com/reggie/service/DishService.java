package com.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.reggie.dto.DishDto;
import com.reggie.entity.Dish;

/**
 * @author zzc
 * @date 2022/10/22 11:23
 */
public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，操作两张表：dish,dish_flavor
    void saveWithFlavor(DishDto dishDto);

    // 根据id查询菜品信息和口味信息
    DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
