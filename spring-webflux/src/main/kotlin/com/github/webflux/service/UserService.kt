package com.github.webflux.service

import com.github.webflux.dao.UserDao
import com.github.webflux.entity.User
import kotlinx.coroutines.flow.Flow
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 *
 * @author HAN
 * @since 08-31-22:25
 * @version 1.0
 */
@Service
class UserService {

    val log = LoggerFactory.getLogger(UserService::class.java)!!

    @Autowired
    private lateinit var userDao: UserDao

    suspend fun getUserById(id: Long): User? {
        return userDao.findById(id)
    }

    @Transactional
    suspend fun saveUser(user: User): User {
        log.info("save first: $user")
        userDao.save(user)
        val user2 = User(null, "test2", 10)
        log.info("save second: $user2")
        val i = 1 / 0
        return user2

    }

    fun getUserPagination(current: Int, limit: Int): Flow<User> {
        return userDao.findBy(PageRequest.of(current, limit))
    }

    suspend fun getUserAll(): Flow<User> {
        return userDao.findAll()
    }
}
