package com.certification.datalistgridtable.fosterCareHub.modules.fosters;

import com.certification.datalistgridtable.fosterCareHub.modules.dogs.Dog;
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