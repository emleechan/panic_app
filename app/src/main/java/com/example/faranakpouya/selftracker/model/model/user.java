package com.example.faranakpouya.selftracker.model.model;

/**
 * Created by faranakpouya on 2018-02-10.
 */

public class user {
    private int glass_of_water;
    private int water_goal;
    private int study_time;
    private int study_goal;
    private int exercise_time;
    private int exercise_time_goal;
    private int exersice_calory;
    private int getExersice_calory_goal;

    public int getGlass_of_water() {
        return glass_of_water;
    }

    public int getWater_goal() {
        return water_goal;
    }

    public int getStudy_time() {
        return study_time;
    }

    public int getStudy_goal() {
        return study_goal;
    }

    public int getExercise_time() {
        return exercise_time;
    }

    public int getExercise_time_goal() {
        return exercise_time_goal;
    }

    public int getExersice_calory() {
        return exersice_calory;
    }

    public int getGetExersice_calory_goal() {
        return getExersice_calory_goal;
    }

    public void setGlass_of_water(int water){
        this.glass_of_water = water;
    }

    public void setExercise_time(int exercise_time) {
        this.exercise_time = exercise_time;
    }

    public void setExercise_time_goal(int exercise_time_goal) {
        this.exercise_time_goal = exercise_time_goal;
    }

    public void setExersice_calory(int exersice_calory) {
        this.exersice_calory = exersice_calory;
    }

    public void setGetExersice_calory_goal(int getExersice_calory_goal) {
        this.getExersice_calory_goal = getExersice_calory_goal;
    }

    public void setStudy_goal(int study_goal) {
        this.study_goal = study_goal;
    }

    public void setStudy_time(int study_time) {
        this.study_time = study_time;
    }

    public void setWater_goal(int water_goal) {
        this.water_goal = water_goal;
    }
}
