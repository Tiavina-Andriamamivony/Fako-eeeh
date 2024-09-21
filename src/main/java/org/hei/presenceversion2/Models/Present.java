package org.hei.presenceversion2.models;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Present extends Attendance implements Serializable {

    public Present(String attendanceId, Student student, Course course) {
        super(attendanceId, student, course);
    }
}
