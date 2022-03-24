package com.hfad.workout;

import java.util.ArrayList;

public class Workout {
    private  String name;
    private  String description;
    public static final Workout[] workouts = {
            new Workout("One type","One type description"),
            new Workout("Two type","Two type description"),
            new Workout("Tree type","Tree type description"),
            new Workout("Four type","Four type description"),
    };

    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return this.name;
    }
}
