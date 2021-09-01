package com.github.webflux.controller

import com.github.webflux.entity.User
import com.github.webflux.service.UserService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

/**
 *
 * @author HAN
 * @since 08-31-22:25
 * @version 1.0
 */
@RestController
@RequestMapping("kotlin")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping("{id}")
    suspend fun getUserById(@PathVariable("id") id: Long) : User? {
        return userService.getUserById(id)
    }

    @PostMapping
    suspend fun saveUser(@RequestBody user: User): User {
        return userService.saveUser(user)
    }
}
