package org.hei.presenceversion2.models;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.*;
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Cor implements Serializable {
    private String id;
    private Student student;
    private status status;
    private Timestamp action_date;
    private String description;
}
