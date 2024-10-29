package com.zero.timefold.solver.common.solver.justifications;

import ai.timefold.solver.core.api.score.stream.ConstraintJustification;
import com.zero.timefold.solver.domain.entity.LessonEntity;

public record StudentGroupSubjectVarietyJustification(String studentGroup, LessonEntity lessonEntity1, LessonEntity lessonEntity2, String description) implements ConstraintJustification {

    public StudentGroupSubjectVarietyJustification(String studentGroup, LessonEntity lessonEntity1, LessonEntity lessonEntity2) {
        this(studentGroup, lessonEntity1, lessonEntity2,
                "Student Group '%s' has two consecutive lessons on '%s' at '%s %s' and at '%s %s'"
                        .formatted(studentGroup, lessonEntity1.getSubject(), lessonEntity1.getTimeslot().getDayOfWeek(),
                                lessonEntity1.getTimeslot().getStartTime(), lessonEntity2.getTimeslot().getDayOfWeek(),
                                lessonEntity2.getTimeslot().getStartTime()));
    }
}
