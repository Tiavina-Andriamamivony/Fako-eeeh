package org.hei.presenceversion2.models;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Professor {
    private String professorId;
    private String first_name;
    private String last_name;
}
