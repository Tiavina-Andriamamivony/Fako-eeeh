package org.hei.presenceversion2.models;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Timer;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public class Delay extends Attendance implements Serializable {
    private Timestamp comingTime;

    public Delay(String attendanceId, Student student, Course course, Timestamp commingTime) {
        super(attendanceId, student, course);
        this.comingTime = commingTime;
    }
}
