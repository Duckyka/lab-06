package com.example.listycity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not already exist.
     * @param city
     *      This is a candidate city to add.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Getter function for the CityList object.
     * @return
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns true or false depending on if a given city is contained in the cityList.
     * @param city
     * @return
     */
    public boolean hasCity(City city) {
        return this.getCities().contains(city);
    }

    /**
     * This function deletes the given city from the cityList if it is present.
     * If the city is not in the list, throws an IllegalArgumentException.
     * @param city
     */
    public void deleteCity(City city) {
        if (this.getCities().contains(city)) {
            this.getCities().remove(city);
        } else {
            throw new IllegalArgumentException("City is not in the list!");
        }
    }

    /**
     * This function returns an integer count of the number of city objects in the cityList.
     * @return
     */
    public int countCities() {
        return this.getCities().size();
    }
}
