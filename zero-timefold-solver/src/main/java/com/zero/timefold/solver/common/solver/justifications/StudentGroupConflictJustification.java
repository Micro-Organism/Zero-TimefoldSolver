package com.zero.timefold.solver.common.solver.justifications;

import ai.timefold.solver.core.api.score.stream.ConstraintJustification;
import com.zero.timefold.solver.domain.entity.LessonEntity;

public record StudentGroupConflictJustification(String studentGroup, LessonEntity lessonEntity1, LessonEntity lessonEntity2, String description) implements ConstraintJustification {
    public StudentGroupConflictJustification(String studentGroup, LessonEntity lessonEntity1, LessonEntity lessonEntity2) {
        this(studentGroup, lessonEntity1, lessonEntity2,
                "Student group '%s' has lesson '%s' and lesson '%s' at '%s %s'"
                        .formatted(studentGroup, lessonEntity1.getSubject(), lessonEntity2.getSubject(),
                                lessonEntity1.getTimeslot().getDayOfWeek(), lessonEntity1.getTimeslot().getStartTime()));
    }
}
