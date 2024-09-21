package org.hei.presenceversion2.models;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Level implements Serializable {
    private String levelId;
    private String name;
}
