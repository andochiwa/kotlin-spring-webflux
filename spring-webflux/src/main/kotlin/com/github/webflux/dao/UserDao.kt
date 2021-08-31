package com.github.webflux.dao

import com.github.webflux.entity.User
import org.springframework.data.r2dbc.core.R2dbcEntityOperations
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

/**
 *
 * @author HAN
 * @since 08-31-22:20
 * @version 1.0
 */
interface UserDao: CoroutineCrudRepository<User, Long> {
}
