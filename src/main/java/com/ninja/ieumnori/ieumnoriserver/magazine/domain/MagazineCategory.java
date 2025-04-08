package com.ninja.ieumnori.ieumnoriserver.magazine.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "magazine_category")
public class MagazineCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder.Default
    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted = false;

    @Column(name = "title", nullable = false)
    private String title;

    public void updateTitle(String newTitle) {
        this.title = newTitle;
    }

    public void markDeleted() {
        this.isDeleted = true;
    }
}