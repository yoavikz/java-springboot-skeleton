package com.yoav.sample.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String name;
    private int height;
    private int weight;
    private double bmi;
}