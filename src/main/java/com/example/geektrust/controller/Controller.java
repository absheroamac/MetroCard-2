package com.example.geektrust.controller;

import java.util.List;

public interface Controller {

    /**
     * This method start the Program with the input and call readInput method and
     * distributeInput methods.
     * 
     * @param input The file name where input is located
     */
    public void start(String input);

    /**
     * 
     * @param input
     * @return List of list of input strings splitted by space
     */
    public List<List<String>> readInput(String input);

    /**
     * Call appropriate methods based on the Input
     * 
     * @param input
     */
    public void distributeInput(List<String> input);

    /**
     * Create MetroCard Object.
     * 
     * @param id     Id of the MetroCard
     * @param amount Amount to be added to the Metro card initially
     */
    public void createMetroCard(String id, String amount);

    /**
     * Create Journey Object
     * 
     * @param id        Id of the metroCard using
     * @param passenger Passenger type
     * @param station   Station type
     */
    public void createJourney(String id, String passenger, String station);

    /**
     * Print Final Summary in the form
     * TOTAL_COLLECTION CENTRAL collectedAmount totalDiscount
     * PASSENGER_TYPE_SUMMARY
     * type count -> Sort based on the count
     * 
     */
    public void printSummary();

}
