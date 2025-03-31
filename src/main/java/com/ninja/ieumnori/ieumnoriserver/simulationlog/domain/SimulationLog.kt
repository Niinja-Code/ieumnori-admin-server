package com.ninja.ieumnori.ieumnoriserver.simulationlog.domain

import com.ninja.ieumnori.ieumnoriserver.common.domain.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "simulation_log")
class SimulationLog (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name="user_id", nullable = false)
    var userId: Long,
    @Column(name = "simulation_id", nullable = false)
    var simulationId: Long,
    ): BaseEntity() {
    constructor(): this(0, 0,0)
}