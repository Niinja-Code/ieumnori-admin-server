package com.ninja.ieumnori.ieumnoriserver.user.domain

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "users")
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(nullable = false, unique = true)
    var nickname: String,
    @Column(name = "phone_number", nullable = false)
    var phoneNumber: String,
    ): BaseEntity() {
    constructor(): this(0, "", "")
}