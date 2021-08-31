package com.github.springboot.controller

import com.github.springboot.entity.User
import com.github.springboot.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 *
 * @author HAN
 * @since 08-31-18:45
 * @version 1.0
 */
@RestController
@RequestMapping("kotlin")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping("{id}")
    fun getUserById(@PathVariable("id") id: Long): User {
        return userService.getById(id)
    }

    @PostMapping
    fun saveUser(@RequestBody user: User) {
        userService.save(user)
    }

    @GetMapping("test/{id}")
    fun getUserByIdCustomize(@PathVariable("id") id: Long): User {
        return userService.getUserByIdCustomize(id)
    }
}
