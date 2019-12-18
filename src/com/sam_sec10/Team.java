package com.sam_sec10;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> { //one team can have only one type of players;
    private String name;
    private ArrayList<T> members;
    private int tied = 0;
    private int won = 0;
    private int lost = 0;
    private int gamesPlayed = 0;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int numPlayers() {
        return this.members.size();
    }

    public boolean addPlayer(T member) { // add type T of members, which must reflect this class object type as well
        if (members.contains(member)) {
            System.out.println(member.getName() + " is already in the team");
            return false;
        } else {
            System.out.println(member.getName() + " added to the team.");
            members.add(member);
            return true;
        }
    }

    public void checkResult(Team<T> opponent, int ourScore, int theirScore) {
        String msg = "";
        if (ourScore > theirScore) {
            this.won++;
            msg = " beat ";
        } else if (ourScore == theirScore) {
            this.tied++;
            msg = " drew with ";
        } else {
            this.lost++;
            msg = " lost to ";
        }
        this.gamesPlayed++;
        if (opponent != null) {
            opponent.checkResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (this.won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking())
            return 1;
        else
            return 0;
    }


}
