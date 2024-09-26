package com.certification.datalistgridtable.practice_project.modules.fosters;

import com.certification.datalistgridtable.practice_project.modules.dogs.Dog;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Foster {
    private String id;
    private String name;
    private String contactInfo;
    private List<Dog> dogsFostered;
}