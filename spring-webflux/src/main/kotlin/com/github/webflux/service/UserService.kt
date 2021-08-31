package com.github.webflux.service

import com.github.webflux.dao.UserDao
import com.github.webflux.entity.User
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.concurrent.TimeUnit

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

    fun saveUser(user: User): Mono<User> {
        return userDao.insert(user)
    }
}
