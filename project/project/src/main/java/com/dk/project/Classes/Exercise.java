package com.dk.project.Classes;

import com.dk.project.Enum.Equipment;
import com.dk.project.Enum.MuscleList;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {

    private String name;
    private Integer complexity;
    private Integer rating;
    private Boolean solo_Safety;
    private MuscleList primary_Muscle;
    private MuscleList secondary_Muscle;
    private MuscleList tertiary_Muscle;
    private List<Equipment> equipment;

    public Exercise(String name, Integer complexity, Integer rating, Boolean solo_Safety, MuscleList primary_Muscle, MuscleList secondary_Muscle, List<Equipment> equipment) {
        this.name = name;
        this.complexity = complexity;
        this.rating = rating;
        this.solo_Safety = solo_Safety;
        this.primary_Muscle = primary_Muscle;
        this.secondary_Muscle = secondary_Muscle;
        this.equipment = equipment;
    }

    public Exercise(String name, Integer complexity, Integer rating, Boolean solo_Safety, MuscleList primary_Muscle, List<Equipment> equipment) {
        this.name = name;
        this.complexity = complexity;
        this.rating = rating;
        this.solo_Safety = solo_Safety;
        this.primary_Muscle = primary_Muscle;
        this.equipment = equipment;
    }
}
