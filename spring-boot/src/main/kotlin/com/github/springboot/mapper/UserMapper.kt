package com.github.springboot.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.github.springboot.entity.User
import org.apache.ibatis.annotations.Mapper

/**
 *
 * @author HAN
 * @since 08-31-18:46
 * @version 1.0
 */
@Mapper
interface UserMapper : BaseMapper<User> {
    fun getUserByIdCustomize(id: Long): User
}
