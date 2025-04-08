package com.ninja.ieumnori.ieumnoriserver.usersimulationlog.domain;

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity;
import com.ninja.ieumnori.ieumnoriserver.simulation.domain.Simulation;
import com.ninja.ieumnori.ieumnoriserver.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user_simulation_log")
public class UserSimulationLog extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "simulation_id", nullable = false)
    private Simulation simulation;

    @Column(name = "last_accessed_at", nullable = false)
    private Long lastAccessedAt;

    @Column(name = "step", nullable = false)
    private int step;

    @Builder.Default
    @Column(name = "is_completed", nullable = false)
    private boolean isCompleted = false;

    public void updateStep(int step, Long accessedAt) {
        this.step = step;
        this.lastAccessedAt = accessedAt;
    }

    public void markComplete() {
        this.isCompleted = true;
    }
}