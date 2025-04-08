package com.ninja.ieumnori.ieumnoriserver.userbookmark.domain;

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity;
import com.ninja.ieumnori.ieumnoriserver.user.domain.User;
import com.ninja.ieumnori.ieumnoriserver.magazine.domain.Magazine;
import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user_magazine_book_mark")
public class UserMagazineBookmark extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "magazine_id", nullable = false)
    private Magazine magazine;

    public static UserMagazineBookmark create(User user, Magazine magazine) {
        return UserMagazineBookmark.builder()
                .user(user)
                .magazine(magazine)
                .build();
    }
}