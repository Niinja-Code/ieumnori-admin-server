package com.ninja.ieumnori.ieumnoriserver.user.domain

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "phone_auth")
class PhoneAuth (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(nullable = false)
    val phoneNumber: String,
    @Column(name = "auth_number", nullable = false)
    var authNumber: String,
    @Column(name = "expired_at", nullable = false)
    var expiredAt: LocalDateTime,
): BaseEntity() {
    constructor(): this(0, "", "", LocalDateTime.now().plusMinutes(5))
}