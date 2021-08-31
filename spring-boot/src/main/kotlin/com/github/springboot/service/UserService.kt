package com.github.springboot.service

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.github.springboot.entity.User
import com.github.springboot.mapper.UserMapper
import org.springframework.stereotype.Service

/**
 *
 * @author HAN
 * @since 08-31-18:45
 * @version 1.0
 */
@Service
class UserService : ServiceImpl<UserMapper, User>() {
    fun getUserByIdCustomize(id: Long): User {
        return super.getBaseMapper().getUserByIdCustomize(id)
    }
}
