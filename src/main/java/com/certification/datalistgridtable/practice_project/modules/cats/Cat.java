package com.certification.datalistgridtable.practice_project.modules.cats;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Cat {
    private String id;
    private String name;
    private int age;
    private String breed;
    private String gender;
    private double weight;
    private String fosterAddress;
    private String currentFoster;
    private List<String> fosterHistory;
    private String status;
}