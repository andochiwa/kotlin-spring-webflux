package com.github.webflux.dao

import com.github.webflux.entity.User
import kotlinx.coroutines.flow.Flow
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

/**
 *
 * @author HAN
 * @since 08-31-22:20
 * @version 1.0
 */
interface UserDao: CoroutineCrudRepository<User, Long> {

    fun findBy(pageable: Pageable): Flow<User>
}
