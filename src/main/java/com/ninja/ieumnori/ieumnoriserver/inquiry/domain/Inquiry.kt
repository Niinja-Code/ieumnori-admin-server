package com.ninja.ieumnori.ieumnoriserver.inquiry.domain

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "inquiry")
class Inquiry (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name="user_id", nullable = false)
    var userId: Long,
    @Column(nullable = false)
    var content: String,
    ): BaseEntity() {
    constructor(): this(0, 0, "")
}