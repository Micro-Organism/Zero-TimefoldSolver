package com.zero.timefold.solver.common.solver.justifications;

import ai.timefold.solver.core.api.score.stream.ConstraintJustification;
import com.zero.timefold.solver.domain.entity.LessonEntity;

public record TeacherConflictJustification(String teacher, LessonEntity lessonEntity1, LessonEntity lessonEntity2, String description) implements ConstraintJustification {

    public TeacherConflictJustification(String teacher, LessonEntity lessonEntity1, LessonEntity lessonEntity2) {
        this(teacher, lessonEntity1, lessonEntity2,
                "Teacher '%s' needs to teach lesson '%s' for student group '%s' and lesson '%s' for student group '%s' at '%s %s'"
                        .formatted(teacher, lessonEntity1.getSubject(), lessonEntity1.getStudentGroup(), lessonEntity2.getSubject(),
                                lessonEntity2.getStudentGroup(), lessonEntity1.getTimeslot().getDayOfWeek(),
                                lessonEntity1.getTimeslot().getStartTime()));
    }
}
