package com.ninja.ieumnori.ieumnoriserver.magazine.domain;

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity;
import com.ninja.ieumnori.ieumnoriserver.simulation.domain.Simulation;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "magazine")
public class Magazine extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder.Default
    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "simulation_id", nullable = false)
    private Simulation simulation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private MagazineCategory category;

    @Column(name = "main_title", nullable = false)
    private String mainTitle;

    @Column(name = "sub_title")
    private String subTitle;

    @Column(name = "thumbnail_image_url")
    private String thumbnailImageUrl;

    @Lob
    @Column(name = "content")
    private String content;

    @Builder.Default
    @Column(name = "view_count", nullable = false)
    private int viewCount = 0;

    public void increaseViewCount() {
        this.viewCount++;
    }

    public void update(String mainTitle, String subTitle, String thumbnailImageUrl, String content) {
        this.mainTitle = mainTitle;
        this.subTitle = subTitle;
        this.thumbnailImageUrl = thumbnailImageUrl;
        this.content = content;
    }
}