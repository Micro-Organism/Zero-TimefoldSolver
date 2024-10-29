package com.zero.timefold.solver.common.solver.justifications;

import ai.timefold.solver.core.api.score.stream.ConstraintJustification;
import com.zero.timefold.solver.domain.entity.LessonEntity;

public record TeacherRoomStabilityJustification(String teacher, LessonEntity lessonEntity1, LessonEntity lessonEntity2, String description) implements ConstraintJustification {

    public TeacherRoomStabilityJustification(String teacher, LessonEntity lessonEntity1, LessonEntity lessonEntity2) {
        this(teacher, lessonEntity1, lessonEntity2,
                "Teacher '%s' has two lessons in different rooms: room '%s' at '%s %s' and room '%s' at '%s %s'"
                        .formatted(teacher, lessonEntity1.getRoom(), lessonEntity1.getTimeslot().getDayOfWeek(),
                                lessonEntity1.getTimeslot().getStartTime(), lessonEntity2.getRoom(), lessonEntity2.getTimeslot().getDayOfWeek(),
                                lessonEntity2.getTimeslot().getStartTime()));
    }
}
