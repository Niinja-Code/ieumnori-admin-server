package com.ninja.ieumnori.ieumnoriserver.banner.domain;

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "banner")
public class Banner extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder.Default
    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "redirect_url", nullable = false)
    private String redirectUrl;

    public void update(String title, String imageUrl, String redirectUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.redirectUrl = redirectUrl;
    }

    public void deactivate() {
        this.isActive = false;
    }
}