package com.ninja.ieumnori.ieumnoriserver.simulation.domain;

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity;
import com.ninja.ieumnori.ieumnoriserver.magazine.domain.MagazineCategory;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "simulation")
public class Simulation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private MagazineCategory category;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "thumbnail_image_url")
    private String thumbnailImageUrl;

    public void update(String title, String thumbnailImageUrl) {
        this.title = title;
        this.thumbnailImageUrl = thumbnailImageUrl;
    }

    public void markDeleted() {
        this.isDeleted = true;
    }
}