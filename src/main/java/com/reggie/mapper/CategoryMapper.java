package com.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zzc
 * @date 2022/10/22 10:51
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
