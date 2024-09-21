package org.hei.presenceversion2.models;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Student implements Serializable {
    private String STD;
    private String firstName;
    private String lastName;
    private Group group;
    private List<Miss> missList;
    private List<Delay> delayList;
    private  List<Present> presentList;
}
//Une table commune qui prend la liste des delay , presence et absence vita