package org.hei.presenceversion2.models;

import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Course implements Serializable {
    private String courseId;
    private String name;
    private Timestamp presentationDate;
    private Professor professor;
    private Level level;
}
