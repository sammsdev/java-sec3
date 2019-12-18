package com.sam_sec10;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> { // One league can have only one type of teams;
    private String name;
    private ArrayList<T> teams = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) { //receive any T object
        if (teams.contains(team)) {
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }

    public void SortTeams() {
        Collections.sort(teams);
        for(T team : teams){
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }



}
