package com.github.webflux.entity

import org.springframework.data.annotation.Id
import java.io.Serializable

/**
 *
 * @author HAN
 * @since 08-31-22:19
 * @version 1.0
 */
data class User(
    @Id
    var id: Long? = null,

    var name: String? = null,

    var age: Int? = null
): Serializable
