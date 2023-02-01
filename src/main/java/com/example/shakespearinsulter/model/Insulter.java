package com.example.shakespearinsulter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Insulter {
    private int id;
    private String name;
    private String insult;
    private int rating;

}
