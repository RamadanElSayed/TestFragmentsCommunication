package com.example.rse.testfragmentscommunication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RSE on 3/23/2018.
 */
public class AndroidImageAssets {

    // Lists for all AndroidMe images
    // Broken down into heads, bodies, legs, and all images

    private static final List<Integer> heads = new ArrayList<Integer>() {{
        add(R.drawable.body1);

        add(R.drawable.body10);
        add(R.drawable.body11);
    }};

    private static final List<Integer> bodies = new ArrayList<Integer>() {{
        add(R.drawable.body1);

        add(R.drawable.body10);
        add(R.drawable.body11);
    }};

    private static final List<Integer> legs = new ArrayList<Integer>() {{
        add(R.drawable.body1);

        add(R.drawable.body10);
        add(R.drawable.body11);
    }};

    private static final List<Integer> all = new ArrayList<Integer>() {{
        addAll(heads);
        addAll(bodies);
        addAll(legs);
    }};


    // Getter methods that return lists of all head images, body images, and leg images

    public static List<Integer> getHeads() {
        return heads;
    }

    public static List<Integer> getBodies() {
        return bodies;
    }

    public static List<Integer> getLegs() {
        return legs;
    }

    // Returns a list of all the images combined: heads, bodies, and legs in that order
    public static List<Integer> getAll() {
        return all;
    }
}