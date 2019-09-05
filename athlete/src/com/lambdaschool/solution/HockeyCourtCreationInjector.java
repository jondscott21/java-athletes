package com.lambdaschool.solution;

public class HockeyCourtCreationInjector implements CourtCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(null, new HockeyCourtCreationImpl());
    }
}
