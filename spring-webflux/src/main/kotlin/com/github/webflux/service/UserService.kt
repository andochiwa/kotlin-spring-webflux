package com.github.webflux.service

import com.github.webflux.dao.UserDao
import com.github.webflux.entity.User
import kotlinx.coroutines.flow.Flow
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

/**
 *
 * @author HAN
 * @since 08-31-22:25
 * @version 1.0
 */
@Service
class UserService {

    @Autowired
    private lateinit var userDao: UserDao

    suspend fun getUserById(id: Long): User? {
        return userDao.findById(id)
    }

    suspend fun saveUser(user: User): User {
        return userDao.save(user)
    }

    fun getUserPagination(current: Int, limit: Int): Flow<User> {
        return userDao.findBy(PageRequest.of(current, limit))
    }

    suspend fun getUserAll(): Flow<User> {
        return userDao.findAll()
    }
}
