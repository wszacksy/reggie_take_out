package com.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.reggie.dto.SetmealDto;
import com.reggie.entity.Setmeal;

import java.util.List;

/**
 * @author zzc
 * @date 2022/10/22 11:24
 */
public interface SetmealService extends IService<Setmeal> {
    // 新增套餐，同时保存套餐与菜品关系
    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);
}
