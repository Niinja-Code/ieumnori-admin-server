package com.ninja.ieumnori.ieumnoriserver.banner.domain

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "banner")
class Banner (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name="title", nullable = false)
    var title: String,
    @Column(name="link", nullable = true)
    var link: String?,
    @Column(name="main_image", nullable = false)
    var mainImage: String,
    @Column(name = "is_exposed", nullable = false)
    var isExposed: Boolean,
): BaseEntity() {
    constructor(): this(0, "", "", "", false)
}