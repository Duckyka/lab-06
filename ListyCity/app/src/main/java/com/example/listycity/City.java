package com.example.listycity;

/**
 * This is a class that defines a city.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructor function for a city object.
     * @param city
     * @param province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Getter function for the city object's name parameter.
     * @return
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Getter function for the city object's province parameter.
     * @return
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Override of the compareTo function to compare city objects together.
     * @param o
     * @return
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}
