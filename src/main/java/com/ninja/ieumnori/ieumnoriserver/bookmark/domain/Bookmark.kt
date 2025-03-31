package com.ninja.ieumnori.ieumnoriserver.bookmark.domain

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "bookmark")
class Bookmark (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name="user_id", nullable = false)
    var userId: Long,
    @Column(name = "magazine_id", nullable = false)
    var magazineId: Long,
    ): BaseEntity() {
    constructor(): this(0, 0,0)
}