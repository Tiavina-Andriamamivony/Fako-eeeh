package org.hei.presenceversion2.models;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Group implements Serializable {
    private String groupId;
    private String name;
    private Level level;
}
