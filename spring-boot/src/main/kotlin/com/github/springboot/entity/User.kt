package com.github.springboot.entity

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import java.io.Serializable

/**
 *
 * @author HAN
 * @since 08-31-18:43
 * @version 1.0
 */
data class User(
    @TableId(type = IdType.ASSIGN_ID)
    var id: Long?,

    var name: String?,

    var age: Int?
) : Serializable
