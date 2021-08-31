package com.github.webflux.controller

import com.github.webflux.entity.User
import com.github.webflux.service.UserService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
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

    private val log: Logger = LoggerFactory.getLogger(UserController::class.java)

    @GetMapping("{id}")
    suspend fun getUserById(@PathVariable("id") id: Long) : User? {
        log.info("webflux start")
        val user = userService.getUserById(id)
        log.info("webflux stop")
        return user
    }
}
