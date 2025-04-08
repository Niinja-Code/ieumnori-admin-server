package com.ninja.ieumnori.ieumnoriserver.user.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity;

import jakarta.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder.Default
    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;

    @Column(name = "phone_number", nullable = false, unique = true)
    private String phoneNumber;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "profile_image", nullable = true)
    private String profileImage;

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public void updateNickname(String newNickname) {
        checkNotDeleted();
        this.nickname = newNickname;
    }

    public void updatePhoneNumber(String newPhoneNumber) {
        checkNotDeleted();
        this.phoneNumber = newPhoneNumber;
    }

    public void updateProfileImage(String newProfileImage) {
        checkNotDeleted();
        this.profileImage = newProfileImage;
    }

    private void checkNotDeleted() {
        if (this.isDeleted) {
            throw new IllegalStateException("탈퇴한 유저의 정보는 수정할 수 없습니다.");
        }
    }
}