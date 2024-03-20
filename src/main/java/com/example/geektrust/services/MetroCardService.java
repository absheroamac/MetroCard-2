package com.example.geektrust.services;

import com.example.geektrust.entities.MetroCard;

public interface MetroCardService {

    /**
     * Create MetroCard Object with Id and Balance
     * 
     * @param id      ID of the MetroCard
     * @param balance Balance of the MetroCard
     * @return newly created MetroCard Object
     */
    public MetroCard createMetroCard(String id, String balance);

    /**
     * return the requested MetroCard from the Map
     * 
     * @param id Id of the requested MetroCard
     * @return request MetroCard
     */
    public MetroCard getMetroCard(String id);

    /**
     * recharge the requested MetroCard using the id with the inputed amount
     * 
     * @param id     id of the the metroCard to be recharged
     * @param amount to be added to the MetroCard
     * @return RechargeSummary object which contains MetroCard and ServiceCharge
     */
    public RechargeSummary rechargeMetroCard(String id, int amount);

    /**
     * deduct Amount from the MetroCard
     * 
     * @param id     id of the the metrocard
     * @param amount amount to be deducted
     * @return Updated MetroCard
     */
    public MetroCard deductAmount(String id, int amount);

}
