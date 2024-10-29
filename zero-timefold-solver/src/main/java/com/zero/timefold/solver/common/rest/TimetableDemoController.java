package com.zero.timefold.solver.common.rest;

import com.zero.timefold.solver.domain.entity.LessonEntity;
import com.zero.timefold.solver.domain.entity.RoomEntity;
import com.zero.timefold.solver.domain.entity.TimeslotEntity;
import com.zero.timefold.solver.domain.entity.TimetableEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Tag(name = "Demo data", description = "Timefold-provided demo school timetable data.")
@RestController
@RequestMapping("/demo-data")
public class TimetableDemoController {

    public enum DemoData {
        SMALL,
        LARGE
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "List of demo data represented as IDs.",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = DemoData.class, type = "array")))})
    @Operation(summary = "List demo data.")
    @GetMapping()
    public DemoData[] list() {
        return DemoData.values();
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Unsolved demo timetable.",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = TimetableEntity.class)))})
    @Operation(summary = "Find an unsolved demo timetable by ID.")
    @GetMapping(value = "/{demoDataId}")
    public ResponseEntity<TimetableEntity> generate(@Parameter(description = "Unique identifier of the demo data.",
            required = true) @PathVariable("demoDataId") DemoData demoData) {
		demoData =  DemoData.LARGE;
        List<TimeslotEntity> timeslotEntities = new ArrayList<>(10);
        long nextTimeslotId = 0L;
        timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.MONDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
        timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.MONDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
        timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.MONDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
        timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.MONDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
        timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.MONDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));

        timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.TUESDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
        timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.TUESDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
        timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.TUESDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
        timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.TUESDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
        timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.TUESDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
        if (demoData == DemoData.LARGE) {
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.WEDNESDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.WEDNESDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.WEDNESDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.WEDNESDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.WEDNESDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.THURSDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.THURSDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.THURSDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.THURSDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.THURSDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.FRIDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.FRIDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.FRIDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId++), DayOfWeek.FRIDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
            timeslotEntities.add(new TimeslotEntity(Long.toString(nextTimeslotId), DayOfWeek.FRIDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
        }

        List<RoomEntity> roomEntities = new ArrayList<>(3);
        long nextRoomId = 0L;
        roomEntities.add(new RoomEntity(Long.toString(nextRoomId++), "Room A"));
        roomEntities.add(new RoomEntity(Long.toString(nextRoomId++), "Room B"));
        roomEntities.add(new RoomEntity(Long.toString(nextRoomId++), "Room C"));
        if (demoData == DemoData.LARGE) {
            roomEntities.add(new RoomEntity(Long.toString(nextRoomId++), "Room D"));
            roomEntities.add(new RoomEntity(Long.toString(nextRoomId++), "Room E"));
            roomEntities.add(new RoomEntity(Long.toString(nextRoomId), "Room F"));
        }

        List<LessonEntity> lessonEntities = new ArrayList<>();
        long nextLessonId = 0L;
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "9th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "9th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physics", "M. Curie", "9th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Chemistry", "M. Curie", "9th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Biology", "C. Darwin", "9th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "History", "I. Jones", "9th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "I. Jones", "9th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "I. Jones", "9th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Spanish", "P. Cruz", "9th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Spanish", "P. Cruz", "9th grade"));
        if (demoData == DemoData.LARGE) {
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "ICT", "A. Turing", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physics", "M. Curie", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Geography", "C. Darwin", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Geology", "C. Darwin", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "History", "I. Jones", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "I. Jones", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Drama", "I. Jones", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Art", "S. Dali", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Art", "S. Dali", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physical education", "C. Lewis", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physical education", "C. Lewis", "9th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physical education", "C. Lewis", "9th grade"));
        }

        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "10th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "10th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "10th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physics", "M. Curie", "10th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Chemistry", "M. Curie", "10th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "French", "M. Curie", "10th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Geography", "C. Darwin", "10th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "History", "I. Jones", "10th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "P. Cruz", "10th grade"));
        lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Spanish", "P. Cruz", "10th grade"));
        if (demoData == DemoData.LARGE) {
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "ICT", "A. Turing", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physics", "M. Curie", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Biology", "C. Darwin", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Geology", "C. Darwin", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "History", "I. Jones", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "P. Cruz", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "P. Cruz", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Drama", "I. Jones", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Art", "S. Dali", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Art", "S. Dali", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physical education", "C. Lewis", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physical education", "C. Lewis", "10th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physical education", "C. Lewis", "10th grade"));

            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "ICT", "A. Turing", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physics", "M. Curie", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Chemistry", "M. Curie", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "French", "M. Curie", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physics", "M. Curie", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Geography", "C. Darwin", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Biology", "C. Darwin", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Geology", "C. Darwin", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "History", "I. Jones", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "History", "I. Jones", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "P. Cruz", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "P. Cruz", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "P. Cruz", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Spanish", "P. Cruz", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Drama", "P. Cruz", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Art", "S. Dali", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Art", "S. Dali", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physical education", "C. Lewis", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physical education", "C. Lewis", "11th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physical education", "C. Lewis", "11th grade"));

            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Math", "A. Turing", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "ICT", "A. Turing", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physics", "M. Curie", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Chemistry", "M. Curie", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "French", "M. Curie", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physics", "M. Curie", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Geography", "C. Darwin", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Biology", "C. Darwin", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Geology", "C. Darwin", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "History", "I. Jones", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "History", "I. Jones", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "P. Cruz", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "P. Cruz", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "English", "P. Cruz", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Spanish", "P. Cruz", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Drama", "P. Cruz", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Art", "S. Dali", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Art", "S. Dali", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physical education", "C. Lewis", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId++), "Physical education", "C. Lewis", "12th grade"));
            lessonEntities.add(new LessonEntity(Long.toString(nextLessonId), "Physical education", "C. Lewis", "12th grade"));
        }
        return ResponseEntity.ok(new TimetableEntity(demoData.name(), timeslotEntities, roomEntities, lessonEntities));
    }

}
