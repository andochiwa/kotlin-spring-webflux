package com.github.webflux.entity

import org.springframework.data.annotation.Id
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Table
import java.io.Serializable

/**
 *
 * @author HAN
 * @since 08-31-22:19
 * @version 1.0
 */
@Table("user")
data class User(
    @Id
    var id: Long? = null,

    var name: String? = null,

    var age: Int? = null,

): Serializable
