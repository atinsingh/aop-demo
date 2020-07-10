package io.pragra.learning.aopdemo.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Person {
    private String name;
    private int age;
    private String address;


}
