package com.zero.timefold.solver.domain.entity;

import ai.timefold.solver.core.api.domain.lookup.PlanningId;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(scope = RoomEntity.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class RoomEntity {

    @PlanningId
    private String id;

    private String name;

    public RoomEntity() {
    }

    public RoomEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    // ************************************************************************
    // Getters and setters
    // ************************************************************************

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
