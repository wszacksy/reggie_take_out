package com.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.reggie.entity.Category;

/**
 * @author zzc
 * @date 2022/10/22 10:52
 */
public interface CategoryService extends IService<Category> {

    void remove(Long id);
}
