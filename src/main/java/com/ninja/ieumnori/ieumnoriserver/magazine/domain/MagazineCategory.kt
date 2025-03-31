package com.ninja.ieumnori.ieumnoriserver.magazine.domain

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "magazine_category")
class MagazineCategory (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name = "category_name", nullable = false)
    var categoryName: String,
): BaseEntity() {
    constructor(): this(0, "")
}