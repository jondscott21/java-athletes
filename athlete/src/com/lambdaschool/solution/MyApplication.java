package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteService athlete;
    private CourtService court;

    public MyApplication(AthleteService athlete, CourtService court)
    {
        this.athlete = athlete;
        this.court = court;
    }

    @Override
    public void displayAthlete(String sport)
    {
        System.out.println("************");
        athlete.displayAthlete(sport + " Athlete");
        System.out.println("************\n");
    }

    @Override
    public void displayCourt(String field)
    {
        if(field.equals("Hockey"))
        {
            System.out.println("************");
            court.displayCourt(field + " Rink");
            System.out.println("************\n");
        } else
        {
            System.out.println("************");
            court.displayCourt(field + " Field");
            System.out.println("************\n");
        }
    }
}
