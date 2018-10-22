package myserver.model;

import lombok.*;

@Getter
@Setter
@ToString(exclude = "id")
//@Value
@AllArgsConstructor(staticName = "of")
public class Bar {
    private Long id;
    private String name;
    private String place;
//
//    private final String street;
//    private final String street2;
//    private final String street3;
}