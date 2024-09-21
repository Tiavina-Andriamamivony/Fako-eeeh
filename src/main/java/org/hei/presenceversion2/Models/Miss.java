package org.hei.presenceversion2.models;
import lombok.*;
@Getter
@Setter
@ToString
public class Miss extends Attendance{
    private Justification justification;

    public Miss(String attendanceId, Student student, Course course, Justification justification) {
        super(attendanceId, student, course);
        this.justification = justification;
    }
}
