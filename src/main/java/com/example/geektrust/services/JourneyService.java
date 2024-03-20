package com.example.geektrust.services;

public interface JourneyService {

    public Journey createJourney(String id, String passenger, String Station);

    public Journey getJourney(String id);

    public int getNumberOfJourneys(String id);

}
