package com.cydeo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CourseDTO {

    private Long id;
    private String name;
    private String category;
    private int rating;
    private String description;

}


