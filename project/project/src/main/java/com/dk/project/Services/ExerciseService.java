package com.dk.project.Services;

import com.dk.project.Classes.Exercise;
import com.dk.project.Enum.Equipment;
import com.dk.project.Enum.MuscleList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExerciseService {


    private static final List<Exercise> exercises = List.of(



            //  Bicep
            new Exercise("Bicep Curl", 2, 8, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Cable Curl", 2, 8, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Cables)),

            new Exercise("Bayesian Curl", 4, 9, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Cables)),

            new Exercise("Cheat Curl", 1, 8, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Barbell Curl", 2, 6, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Barbells)),

            new Exercise("Hammer Curl", 2, 8, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Dumbbell Preacher Curl", 3, 9, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Barbell Preacher Curl", 3, 9, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Barbells, Equipment.Bench)),

            new Exercise("Incline Dumbbell Curl", 4, 9, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Spider Curl", 3, 8, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Concentration Curl", 2, 8, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Cable Hammer Curl", 3, 8, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Cables)),

            new Exercise("EZ Bar Curl", 2, 8, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Barbells)),

            new Exercise("Reverse Curl", 3, 7, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Barbells)),

            new Exercise("Cross Body Hammer Curl", 2, 8, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Cable Preacher Curl", 4, 9, true,
                    MuscleList.Biceps,
                    List.of(Equipment.Cables, Equipment.Bench)),


            // tricep
            new Exercise("Dumbbell French Press", 3, 8, true,
                    MuscleList.Triceps,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Overhead Cable Tricep Extension", 4, 9, true,
                    MuscleList.Triceps,
                    List.of(Equipment.Cables)),

            new Exercise("Bar Tricep Press-down", 3, 7, true,
                    MuscleList.Triceps,
                    List.of(Equipment.Cables)),

            new Exercise("Dumbbell Tricep Press-down", 4, 7, true,
                    MuscleList.Triceps,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Barbell Skull Crusher", 4, 8, true,
                    MuscleList.Triceps,
                    List.of(Equipment.Barbells, Equipment.Bench)),

            new Exercise("Cable Tricep Pressdown", 2, 9, true,
                    MuscleList.Triceps,
                    List.of(Equipment.Cables)),

            new Exercise("Rope Tricep Pressdown", 2, 9, true,
                    MuscleList.Triceps,
                    List.of(Equipment.Cables)),

            new Exercise("Close Grip Bench Press", 5, 8, true,
                    MuscleList.Triceps,
                    MuscleList.Chest,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Barbells, Equipment.Bench)),

            new Exercise("Dumbbell Skull Crusher", 3, 8, true,
                    MuscleList.Triceps,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Cable Skull Crusher", 4, 8, true,
                    MuscleList.Triceps,
                    List.of(Equipment.Cables)),

            new Exercise("Bench Dips", 2, 6, true,
                    MuscleList.Triceps,
                    MuscleList.Chest,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Bench)),

            new Exercise("Diamond Push-ups", 2, 8, true,
                    MuscleList.Triceps,
                    MuscleList.Chest,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Single Arm Cable Extension", 3, 8, true,
                    MuscleList.Triceps,
                    List.of(Equipment.Cables)),


            // chest
            new Exercise("Push-ups", 1, 8, true,
                    MuscleList.Chest,
                    MuscleList.Triceps,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Barbell Bench Press", 6, 9, false,
                    MuscleList.Chest,
                    MuscleList.Front_Delts,
                    MuscleList.Triceps,
                    List.of(Equipment.Barbells, Equipment.Bench, Equipment.Rack)),

            new Exercise("Incline Dumbbell Press", 4, 8, true,
                    MuscleList.Chest,
                    MuscleList.Front_Delts,
                    MuscleList.Triceps,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Dips", 3, 7, true,
                    MuscleList.Chest,
                    MuscleList.Front_Delts,
                    MuscleList.Triceps,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Cable Chest Fly", 5, 7, true,
                    MuscleList.Chest,
                    List.of(Equipment.Cables)),

            new Exercise("Dumbbell Chest Fly", 6, 6, true,
                    MuscleList.Chest,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Chest Fly Machine", 2, 8, true,
                    MuscleList.Chest,
                    List.of(Equipment.Machines)),

            new Exercise("Reverse Floor Press", 5, 7, true,
                    MuscleList.Chest,
                    MuscleList.Triceps,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Decline Dumbbell Bench Press", 5, 7, true,
                    MuscleList.Chest,
                    MuscleList.Triceps,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Incline Bench Press", 5, 9, false,
                    MuscleList.Chest,
                    MuscleList.Front_Delts,
                    MuscleList.Triceps,
                    List.of(Equipment.Barbells, Equipment.Bench, Equipment.Rack)),

            new Exercise("Decline Bench Press", 5, 8, false,
                    MuscleList.Chest,
                    MuscleList.Triceps,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Barbells, Equipment.Bench)),

            new Exercise("Dumbbell Bench Press", 4, 9, true,
                    MuscleList.Chest,
                    MuscleList.Triceps,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Incline Machine Press", 3, 8, true,
                    MuscleList.Chest,
                    MuscleList.Front_Delts,
                    MuscleList.Triceps,
                    List.of(Equipment.Machines)),

            new Exercise("Chest Press Machine", 2, 8, true,
                    MuscleList.Chest,
                    MuscleList.Triceps,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Machines)),

            new Exercise("Low Cable Fly", 4, 8, true,
                    MuscleList.Chest,
                    List.of(Equipment.Cables)),

            new Exercise("High Cable Fly", 4, 8, true,
                    MuscleList.Chest,
                    List.of(Equipment.Cables)),


            // front delts
            new Exercise("Seated Barbell Overhead Press", 2, 7, true,
                    MuscleList.Front_Delts,
                    MuscleList.Triceps,
                    MuscleList.Side_Delts,
                    List.of(Equipment.Barbells, Equipment.Bench)),

            new Exercise("Overhead Press", 2, 7, true,
                    MuscleList.Front_Delts,
                    MuscleList.Triceps,
                    MuscleList.Side_Delts,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Machine Shoulder Press", 2, 9, true,
                    MuscleList.Front_Delts,
                    MuscleList.Triceps,
                    MuscleList.Side_Delts,
                    List.of(Equipment.Machines)),

            new Exercise("Arnold Press", 4, 8, true,
                    MuscleList.Front_Delts,
                    MuscleList.Side_Delts,
                    MuscleList.Triceps,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Dumbbell Front Raise", 2, 6, true,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Cable Front Raise", 3, 7, true,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Cables)),

            new Exercise("Push Press", 6, 7, false,
                    MuscleList.Front_Delts,
                    MuscleList.Triceps,
                    MuscleList.Quads,
                    List.of(Equipment.Barbells)),


            // side delts
            new Exercise("Cable Lat Raise", 4, 10, true,
                    MuscleList.Side_Delts,
                    List.of(Equipment.Cables)),

            new Exercise("Lean-in Dumbbell Lat Raise", 4, 8, true,
                    MuscleList.Side_Delts,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Standing Dumbbell Lat Raise", 3, 7, true,
                    MuscleList.Side_Delts,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Machine Lateral Raise", 2, 9, true,
                    MuscleList.Side_Delts,
                    List.of(Equipment.Machines)),

            new Exercise("Seated Dumbbell Lateral Raise", 2, 8, true,
                    MuscleList.Side_Delts,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Cable Y Raise", 4, 8, true,
                    MuscleList.Side_Delts,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Cables)),

            new Exercise("Behind The Back Cable Lateral Raise", 4, 9, true,
                    MuscleList.Side_Delts,
                    List.of(Equipment.Cables)),


            // back delts
            new Exercise("Reverse Cable Crossover", 4, 10, true,
                    MuscleList.Back_Delts,
                    MuscleList.Back,
                    List.of(Equipment.Cables)),

            new Exercise("Face Pulls", 4, 7, true,
                    MuscleList.Back_Delts,
                    MuscleList.Back,
                    List.of(Equipment.Cables)),

            new Exercise("Reverse Pec Deck", 2, 8, true,
                    MuscleList.Back_Delts,
                    MuscleList.Back,
                    List.of(Equipment.Machines)),

            new Exercise("Dumbbell Reverse Fly", 3, 8, true,
                    MuscleList.Back_Delts,
                    MuscleList.Back,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Chest Supported Reverse Fly", 3, 9, true,
                    MuscleList.Back_Delts,
                    MuscleList.Back,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Cable Rear Delt Fly", 4, 9, true,
                    MuscleList.Back_Delts,
                    MuscleList.Back,
                    List.of(Equipment.Cables)),

            new Exercise("Incline Y Raise", 4, 7, true,
                    MuscleList.Back_Delts,
                    MuscleList.Back,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),


            // back
            new Exercise("Chin-up", 6, 8, true,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    MuscleList.Back,
                    List.of(Equipment.Bar)),

            new Exercise("Cable Row", 3, 9, true,
                    MuscleList.Back,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    List.of(Equipment.Cables)),

            new Exercise("Machine Pull Downs", 3, 8, true,
                    MuscleList.Lats,
                    MuscleList.Back,
                    MuscleList.Biceps,
                    List.of(Equipment.Machines)),

            new Exercise("Chest Supported Row", 2, 8, true,
                    MuscleList.Back,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    List.of(Equipment.Machines)),

            new Exercise("Dumbbell Pullover", 2, 6, true,
                    MuscleList.Lats,
                    MuscleList.Chest,
                    MuscleList.Triceps,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Pull-ups", 6, 9, true,
                    MuscleList.Lats,
                    MuscleList.Back,
                    MuscleList.Biceps,
                    List.of(Equipment.Bar)),

            new Exercise("Cable Overhand Row", 5, 7, true,
                    MuscleList.Back,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    List.of(Equipment.Cables)),

            new Exercise("Y Backs", 5, 7, true,
                    MuscleList.Back,
                    MuscleList.Back_Delts,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Lat Pulldown", 2, 9, true,
                    MuscleList.Lats,
                    MuscleList.Back,
                    MuscleList.Biceps,
                    List.of(Equipment.Machines)),

            new Exercise("Close Grip Lat Pulldown", 3, 8, true,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    MuscleList.Back,
                    List.of(Equipment.Machines)),

            new Exercise("Single Arm Cable Row", 3, 9, true,
                    MuscleList.Back,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    List.of(Equipment.Cables)),

            new Exercise("Dumbbell Row", 3, 9, true,
                    MuscleList.Back,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Barbell Row", 5, 8, false,
                    MuscleList.Back,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    List.of(Equipment.Barbells)),

            new Exercise("T-Bar Row", 4, 9, true,
                    MuscleList.Back,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    List.of(Equipment.Machines)),

            new Exercise("Machine Row", 2, 8, true,
                    MuscleList.Back,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    List.of(Equipment.Machines)),

            new Exercise("Straight Arm Cable Pulldown", 3, 9, true,
                    MuscleList.Lats,
                    MuscleList.Back,
                    List.of(Equipment.Cables)),

            new Exercise("Inverted Row", 4, 8, true,
                    MuscleList.Back,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    List.of(Equipment.Bar)),

            new Exercise("Meadows Row", 5, 8, true,
                    MuscleList.Back,
                    MuscleList.Lats,
                    MuscleList.Biceps,
                    List.of(Equipment.Barbells)),


            // quads
            new Exercise("Hack Squat", 3, 10, true,
                    MuscleList.Quads,
                    MuscleList.Glutes,
                    List.of(Equipment.Machines)),

            new Exercise("Smith Machine Squat", 3, 8, true,
                    MuscleList.Quads,
                    MuscleList.Glutes,
                    MuscleList.Hamstrings,
                    List.of(Equipment.Machines)),

            new Exercise("Leg Extension", 1, 9, true,
                    MuscleList.Quads,
                    List.of(Equipment.Machines)),

            new Exercise("Lunge", 2, 6, true,
                    MuscleList.Quads,
                    MuscleList.Glutes,
                    MuscleList.Hamstrings,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Barbell Squat", 5, 9, false,
                    MuscleList.Quads,
                    MuscleList.Glutes,
                    MuscleList.Hamstrings,
                    List.of(Equipment.Barbells, Equipment.Rack)),

            new Exercise("Goblet Squat", 2, 8, true,
                    MuscleList.Quads,
                    MuscleList.Glutes,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Bulgarian Split Squat", 4, 10, true,
                    MuscleList.Quads,
                    MuscleList.Glutes,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Leg Press", 2, 9, true,
                    MuscleList.Quads,
                    MuscleList.Glutes,
                    List.of(Equipment.Machines)),

            new Exercise("Front Squat", 6, 8, false,
                    MuscleList.Quads,
                    MuscleList.Glutes,
                    List.of(Equipment.Barbells, Equipment.Rack)),

            new Exercise("Step Up", 3, 7, true,
                    MuscleList.Quads,
                    MuscleList.Glutes,
                    List.of(Equipment.Dumbbells, Equipment.Bench)),

            new Exercise("Sissy Squat", 4, 7, true,
                    MuscleList.Quads,
                    List.of(Equipment.Bodyweight)),


            // hamstring and glutes
            new Exercise("Deadlift", 6, 8, false,
                    MuscleList.Glutes,
                    MuscleList.Hamstrings,
                    MuscleList.Back,
                    List.of(Equipment.Barbells)),

            new Exercise("Lying Leg Curl", 3, 7, true,
                    MuscleList.Hamstrings,
                    List.of(Equipment.Machines)),

            new Exercise("Romanian Deadlift", 6, 9, true,
                    MuscleList.Hamstrings,
                    MuscleList.Glutes,
                    List.of(Equipment.Barbells)),

            new Exercise("Glute Bridge", 3, 5, true,
                    MuscleList.Glutes,
                    MuscleList.Hamstrings,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Seated Leg Curl", 2, 9, true,
                    MuscleList.Hamstrings,
                    List.of(Equipment.Machines)),

            new Exercise("Nordic Hamstring Curl", 7, 10, true,
                    MuscleList.Hamstrings,
                    MuscleList.Glutes,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Good Morning", 5, 7, false,
                    MuscleList.Hamstrings,
                    MuscleList.Glutes,
                    MuscleList.Back,
                    List.of(Equipment.Barbells)),

            new Exercise("Hip Thrust", 3, 10, true,
                    MuscleList.Glutes,
                    MuscleList.Hamstrings,
                    List.of(Equipment.Barbells, Equipment.Bench)),

            new Exercise("Cable Pull Through", 3, 8, true,
                    MuscleList.Glutes,
                    MuscleList.Hamstrings,
                    List.of(Equipment.Cables)),

            new Exercise("Single Leg Romanian Deadlift", 5, 8, true,
                    MuscleList.Hamstrings,
                    MuscleList.Glutes,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Reverse Lunge", 3, 8, true,
                    MuscleList.Glutes,
                    MuscleList.Quads,
                    MuscleList.Hamstrings,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Cable Glute Kickback", 3, 8, true,
                    MuscleList.Glutes,
                    MuscleList.Hamstrings,
                    List.of(Equipment.Cables)),


            // calves
            new Exercise("Standing Calf Raise", 3, 7, true,
                    MuscleList.Calves,
                    List.of(Equipment.Machines)),

            new Exercise("Seated Calf Raise", 3, 6, true,
                    MuscleList.Calves,
                    List.of(Equipment.Machines)),

            new Exercise("Leg Press Calf Raise", 3, 5, true,
                    MuscleList.Calves,
                    List.of(Equipment.Machines)),

            new Exercise("Tip-Toe Farmer's Carry", 3, 5, true,
                    MuscleList.Calves,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Single Leg Calf Raise", 2, 8, true,
                    MuscleList.Calves,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Dumbbell Calf Raise", 2, 8, true,
                    MuscleList.Calves,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Donkey Calf Raise", 3, 8, true,
                    MuscleList.Calves,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Smith Machine Calf Raise", 3, 9, true,
                    MuscleList.Calves,
                    List.of(Equipment.Machines)),


            // abs
            new Exercise("Cable Crunch", 3, 8, true,
                    MuscleList.Abs,
                    List.of(Equipment.Cables)),

            new Exercise("Hanging Leg Raises", 6, 8, true,
                    MuscleList.Abs,
                    List.of(Equipment.Bar)),

            new Exercise("Plank", 3, 7, true,
                    MuscleList.Abs,
                    MuscleList.Obliques,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Decline Sit-up", 3, 8, true,
                    MuscleList.Abs,
                    MuscleList.Obliques,
                    List.of(Equipment.Bench)),

            new Exercise("Crunch", 1, 7, true,
                    MuscleList.Abs,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Reverse Crunch", 2, 8, true,
                    MuscleList.Abs,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Ab Wheel Rollout", 5, 10, true,
                    MuscleList.Abs,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Dead Bug", 2, 7, true,
                    MuscleList.Abs,
                    List.of(Equipment.Bodyweight)),

            new Exercise("V-up", 4, 8, true,
                    MuscleList.Abs,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Mountain Climber", 2, 6, true,
                    MuscleList.Abs,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Bodyweight)),

            new Exercise("L-Sit", 7, 9, true,
                    MuscleList.Abs,
                    MuscleList.Triceps,
                    MuscleList.Front_Delts,
                    List.of(Equipment.Bodyweight)),


            // oblique
            new Exercise("Russian Twist", 3, 7, true,
                    MuscleList.Obliques,
                    MuscleList.Abs,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Side Plank", 3, 8, true,
                    MuscleList.Obliques,
                    MuscleList.Abs,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Standing Dumbbell Side Bend", 3, 5, true,
                    MuscleList.Obliques,
                    List.of(Equipment.Dumbbells)),

            new Exercise("Cable Woodchopper", 4, 9, true,
                    MuscleList.Obliques,
                    MuscleList.Abs,
                    List.of(Equipment.Cables)),

            new Exercise("Hanging Knee Twist", 6, 8, true,
                    MuscleList.Obliques,
                    MuscleList.Abs,
                    List.of(Equipment.Bar)),

            new Exercise("Bicycle Crunch", 2, 7, true,
                    MuscleList.Obliques,
                    MuscleList.Abs,
                    List.of(Equipment.Bodyweight)),

            new Exercise("Pallof Press", 3, 8, true,
                    MuscleList.Obliques,
                    MuscleList.Abs,
                    List.of(Equipment.Cables)),

            new Exercise("Side Crunch", 2, 7, true,
                    MuscleList.Obliques,
                    List.of(Equipment.Bodyweight))


    );


    public List<Exercise> recommendationAlgorithmIsolation (int max_Complexity, boolean safety_Required, MuscleList primary_Muscle, List<Equipment> equipmentList) {

        List<Exercise> valid_Exercises = new ArrayList<>();
        List<Exercise> shown_Exercises = new ArrayList<>();
        System.out.println("isolation start works");
        for (Exercise exercise : exercises) {
            if ( exercise.getPrimary_Muscle() == primary_Muscle && exercise.getComplexity() <= max_Complexity && equipmentList.containsAll(exercise.getEquipment())  ) {

                if (safety_Required && !exercise.getSolo_Safety()) {
                    continue;
                }
                else {
                    valid_Exercises.add(exercise);
                    System.out.println("isolation loop works");
                }
            }
        }

        valid_Exercises.sort(Comparator.comparingInt(Exercise::getRating).reversed());
        return valid_Exercises;
    }


    public List<Exercise> recommendationAlgorithmCompound(int max_Complexity, boolean safety_Required, MuscleList primary_Muscle, MuscleList secondary_Muscle , List<Equipment> equipmentList) {

        List<Exercise> valid_Exercises = new ArrayList<>();
        List<Exercise> shown_Exercises = new ArrayList<>();
        System.out.println("compound start works");
        for (Exercise exercise : exercises) {
            if ( exercise.getPrimary_Muscle() == primary_Muscle && exercise.getSecondary_Muscle() == secondary_Muscle && exercise.getComplexity() <= max_Complexity && equipmentList.containsAll(exercise.getEquipment())  ) {

                if (safety_Required && !exercise.getSolo_Safety()) {
                    continue;
                }
                else {
                    valid_Exercises.add(exercise);
                    System.out.println("compound loop works");
                }
            }
        }

        valid_Exercises.sort(Comparator.comparingInt(Exercise::getRating).reversed());
        return valid_Exercises;
    }



}
