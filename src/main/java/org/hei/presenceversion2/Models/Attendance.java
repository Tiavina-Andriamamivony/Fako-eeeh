package org.hei.presenceversion2.models;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Attendance implements Serializable {
    private String attendanceId;
    private Student student;
    private Course course;
}
