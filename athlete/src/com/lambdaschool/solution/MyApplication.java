package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteService athlete;

    public MyApplication(AthleteService athlete)
    {
        this.athlete = athlete;
    }

    @Override
    public void displayAthlete(String sport)
    {
        System.out.println("************");
        athlete.displayAthlete(sport + " Athlete");
        System.out.println("************\n");
    }

    @Override
    public String readAthlete()
    {
        return "Not Implemented";
    }
}
