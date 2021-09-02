package com.github.webflux.entity

import cn.hutool.core.util.IdUtil
import com.fasterxml.jackson.annotation.JsonIgnore
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
    @get:JvmName("deprecate")
    var id: Long? = null,

    var name: String? = null,

    var age: Int? = null,

): Serializable, Persistable<Long> {
    @JsonIgnore
    override fun isNew(): Boolean {
        return if (id == null) {
            id = IdUtil.getSnowflake().nextId()
            true
        } else false
    }

    override fun getId(): Long? = id
}
