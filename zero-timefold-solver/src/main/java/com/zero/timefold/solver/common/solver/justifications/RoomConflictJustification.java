package com.zero.timefold.solver.common.solver.justifications;

import ai.timefold.solver.core.api.score.stream.ConstraintJustification;
import com.zero.timefold.solver.domain.entity.LessonEntity;
import com.zero.timefold.solver.domain.entity.RoomEntity;

public record RoomConflictJustification(RoomEntity roomEntity, LessonEntity lessonEntity1, LessonEntity lessonEntity2, String description) implements ConstraintJustification {

    public RoomConflictJustification(RoomEntity roomEntity, LessonEntity lessonEntity1, LessonEntity lessonEntity2) {
        this(roomEntity, lessonEntity1, lessonEntity2,
                "Room '%s' is used for lesson '%s' for student group '%s' and lesson '%s' for student group '%s' at '%s %s'"
                        .formatted(roomEntity, lessonEntity1.getSubject(), lessonEntity1.getStudentGroup(), lessonEntity2.getSubject(),
                                lessonEntity2.getStudentGroup(), lessonEntity1.getTimeslot().getDayOfWeek(),
                                lessonEntity1.getTimeslot().getStartTime()));
    }
}
