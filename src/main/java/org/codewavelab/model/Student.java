package org.codewavelab.model;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    String firstName;
    String lastName;
    String age;
    String contactNumber;
}
