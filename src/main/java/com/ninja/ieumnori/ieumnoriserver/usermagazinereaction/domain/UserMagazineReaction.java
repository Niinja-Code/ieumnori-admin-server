package com.ninja.ieumnori.ieumnoriserver.usermagazinereaction.domain;

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity;
import com.ninja.ieumnori.ieumnoriserver.magazine.domain.Magazine;
import com.ninja.ieumnori.ieumnoriserver.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user_magazine_reaction")
public class UserMagazineReaction extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "magazine_id", nullable = false)
    private Magazine magazine;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private ReactionType type;
}