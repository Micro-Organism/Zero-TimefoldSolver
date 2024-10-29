package com.zero.timefold.solver.common.solver.justifications;

import ai.timefold.solver.core.api.score.stream.ConstraintJustification;
import com.zero.timefold.solver.domain.entity.LessonEntity;

public record TeacherTimeEfficiencyJustification(String teacher, LessonEntity lessonEntity1, LessonEntity lessonEntity2, String description) implements ConstraintJustification {

    public TeacherTimeEfficiencyJustification(String teacher, LessonEntity lessonEntity1, LessonEntity lessonEntity2) {
        this(teacher, lessonEntity1, lessonEntity2,
                "Teacher '%s' has 2 consecutive lessons: lesson '%s' for student group '%s' at '%s %s' and lesson '%s' for student group '%s' at '%s %s' (gap)"
                        .formatted(teacher, lessonEntity1.getSubject(), lessonEntity1.getStudentGroup(),
                                lessonEntity1.getTimeslot().getDayOfWeek(), lessonEntity1.getTimeslot().getStartTime(),
                                lessonEntity2.getSubject(), lessonEntity2.getStudentGroup(), lessonEntity2.getTimeslot().getDayOfWeek(),
                                lessonEntity2.getTimeslot().getStartTime()));
    }
}
