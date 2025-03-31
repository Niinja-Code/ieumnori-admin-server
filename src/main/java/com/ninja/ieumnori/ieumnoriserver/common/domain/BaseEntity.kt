package com.ninja.ieumnori.ieumnoriserver.common.domain

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.PreUpdate
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseEntity (
    @Column(name = "is_deleted", nullable = false)
    var isDeleted: Boolean = false,

    @Column(name = "created_at", nullable = false, updatable = false)
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "modified_at", nullable = false)
    var modifiedAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "deleted_at", nullable = true)
    var deletedAt: LocalDateTime? = null
) {
    @PreUpdate
    fun preUpdate() {
        modifiedAt = LocalDateTime.now()
    }
}