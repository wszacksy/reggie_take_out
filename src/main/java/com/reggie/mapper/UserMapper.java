package com.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zzc
 * @date 2022/10/23 9:18
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
