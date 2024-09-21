package org.hei.presenceversion2.models;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Justification implements Serializable {
    private String justId;
    private Timestamp sendedDay;
    private String body;
}
