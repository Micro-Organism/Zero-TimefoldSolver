package com.zero.timefold.solver.domain.entity;

import ai.timefold.solver.core.api.domain.solution.PlanningEntityCollectionProperty;
import ai.timefold.solver.core.api.domain.solution.PlanningScore;
import ai.timefold.solver.core.api.domain.solution.PlanningSolution;
import ai.timefold.solver.core.api.domain.solution.ProblemFactCollectionProperty;
import ai.timefold.solver.core.api.domain.valuerange.ValueRangeProvider;
import ai.timefold.solver.core.api.score.buildin.hardsoft.HardSoftScore;
import ai.timefold.solver.core.api.solver.SolverStatus;

import java.util.List;

@PlanningSolution
public class TimetableEntity {

    private String name;

    @ProblemFactCollectionProperty
    @ValueRangeProvider
    private List<TimeslotEntity> timeslotEntities;
    @ProblemFactCollectionProperty
    @ValueRangeProvider
    private List<RoomEntity> roomEntities;
    @PlanningEntityCollectionProperty
    private List<LessonEntity> lessonEntities;

    @PlanningScore
    private HardSoftScore score;

    // Ignored by Timefold, used by the UI to display solve or stop solving button
    private SolverStatus solverStatus;

    // No-arg constructor required for Timefold
    public TimetableEntity() {
    }

    public TimetableEntity(String name, HardSoftScore score, SolverStatus solverStatus) {
        this.name = name;
        this.score = score;
        this.solverStatus = solverStatus;
    }

    public TimetableEntity(String name, List<TimeslotEntity> timeslotEntities, List<RoomEntity> roomEntities, List<LessonEntity> lessonEntities) {
        this.name = name;
        this.timeslotEntities = timeslotEntities;
        this.roomEntities = roomEntities;
        this.lessonEntities = lessonEntities;
    }

    // ************************************************************************
    // Getters and setters
    // ************************************************************************

    public String getName() {
        return name;
    }

    public List<TimeslotEntity> getTimeslots() {
        return timeslotEntities;
    }

    public List<RoomEntity> getRooms() {
        return roomEntities;
    }

    public List<LessonEntity> getLessons() {
        return lessonEntities;
    }

    public HardSoftScore getScore() {
        return score;
    }

    public SolverStatus getSolverStatus() {
        return solverStatus;
    }

    public void setSolverStatus(SolverStatus solverStatus) {
        this.solverStatus = solverStatus;
    }

}
