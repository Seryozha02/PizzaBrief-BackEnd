package com.example.pizzamaker.model;

import lombok.*;

import java.util.Objects;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Ingredient {

    private int id;
    private String name;

}
