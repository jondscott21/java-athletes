package com.lambdaschool.solution;

public class TrackAthleteCreationImpl implements AthleteService
{
    @Override
    public void displayAthlete(String sport)
    {
        System.out.println(sport);
    }

    @Override
    public String readAthlete()
    {
        return "Not Implemented";
    }
}