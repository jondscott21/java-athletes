package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        CourtCreationInjector courtInjector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Track");

        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Hockey");


        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Rugby");

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Baseball");

        // Create Track Field
        courtInjector = new TrackCourtCreationInjector();
        app = courtInjector.getProcess();
        app.displayCourt("Track");

        // Create Hockey Field
        courtInjector = new HockeyCourtCreationInjector();
        app = courtInjector.getProcess();
        app.displayCourt("Hockey");

        // Create Rugby Field
        courtInjector = new RugbyCourtCreationInjector();
        app = courtInjector.getProcess();
        app.displayCourt("Rugby");

        // Create Baseball Field
        courtInjector = new BaseballCourtCreationInjector();
        app = courtInjector.getProcess();
        app.displayCourt("Baseball");

    }
}
