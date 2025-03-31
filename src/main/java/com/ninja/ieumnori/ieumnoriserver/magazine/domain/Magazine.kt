package com.ninja.ieumnori.ieumnoriserver.magazine.domain

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "magazine")
class Magazine (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name="main_title", nullable = false)
    var mainTitle: String,
    @Column(name="sub_title", nullable = false)
    var subTitle: String,
    @Column(name="main_image", nullable = false)
    var mainImage: String,
    @Column(name="category_id", nullable = false)
    var categoryId: Long,
    @Transient // DB 컬럼에 반영되지 않음
    var cardNewsIdList: List<Long> = emptyList(),
    @Column(nullable = false)
    var content: String,
    @Column(name = "is_exposed", nullable = false)
    var isExposed: Boolean,

): BaseEntity() {
    constructor(): this(0, "", "", "", 0, emptyList<Long>(), "", false)
}