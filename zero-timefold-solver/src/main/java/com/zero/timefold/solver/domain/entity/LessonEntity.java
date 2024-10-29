package com.zero.timefold.solver.domain.entity;

import ai.timefold.solver.core.api.domain.entity.PlanningEntity;
import ai.timefold.solver.core.api.domain.lookup.PlanningId;
import ai.timefold.solver.core.api.domain.variable.PlanningVariable;
import com.fasterxml.jackson.annotation.JsonIdentityReference;

@PlanningEntity
public class LessonEntity {

    @PlanningId
    private String id;

    private String subject;
    private String teacher;
    private String studentGroup;

    @JsonIdentityReference
    @PlanningVariable
    private TimeslotEntity timeslotEntity;

    @JsonIdentityReference
    @PlanningVariable
    private RoomEntity roomEntity;

    public LessonEntity() {
    }

    public LessonEntity(String id, String subject, String teacher, String studentGroup) {
        this.id = id;
        this.subject = subject;
        this.teacher = teacher;
        this.studentGroup = studentGroup;
    }

    public LessonEntity(String id, String subject, String teacher, String studentGroup, TimeslotEntity timeslotEntity, RoomEntity roomEntity) {
        this(id, subject, teacher, studentGroup);
        this.timeslotEntity = timeslotEntity;
        this.roomEntity = roomEntity;
    }

    @Override
    public String toString() {
        return subject + "(" + id + ")";
    }

    // ************************************************************************
    // Getters and setters
    // ************************************************************************

    public String getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public TimeslotEntity getTimeslot() {
        return timeslotEntity;
    }

    public void setTimeslot(TimeslotEntity timeslotEntity) {
        this.timeslotEntity = timeslotEntity;
    }

    public RoomEntity getRoom() {
        return roomEntity;
    }

    public void setRoom(RoomEntity roomEntity) {
        this.roomEntity = roomEntity;
    }
}
