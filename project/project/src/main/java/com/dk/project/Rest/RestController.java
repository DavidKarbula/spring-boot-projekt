package com.dk.project.Rest;


import com.dk.project.Classes.Exercise;
import com.dk.project.Enum.Equipment;
import com.dk.project.Enum.MuscleList;
import com.dk.project.Services.ExerciseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Api/result")
public class RestController {

    private final ExerciseService exerciseService = new ExerciseService();

    @GetMapping("/Isolation")
    public List<Exercise> recommend(
            @RequestParam int maxComplexity,
            @RequestParam boolean safetyRequired,
            @RequestParam MuscleList primaryMuscle,
            @RequestParam List<Equipment> equipmentList
    ) {
        System.out.println("isolation works");
        return exerciseService.recommendationAlgorithmIsolation(
                maxComplexity,
                safetyRequired,
                primaryMuscle,
                equipmentList
        );
    }


    @GetMapping("/Compound")
    public List<Exercise> recommend_compound(
            @RequestParam int maxComplexity,
            @RequestParam boolean safetyRequired,
            @RequestParam MuscleList primaryMuscle,
            @RequestParam MuscleList secondaryMuscle,
            @RequestParam List<Equipment> equipmentList
    ) {
        System.out.println("compound works");
        return exerciseService.recommendationAlgorithmCompound(
                maxComplexity,
                safetyRequired,
                primaryMuscle,
                secondaryMuscle,
                equipmentList
        );

    }
}