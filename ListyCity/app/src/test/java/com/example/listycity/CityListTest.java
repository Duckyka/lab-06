package com.example.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Calgary", "Alberta");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Vancouver", "British Columbia");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        City city = new City("Toronto", "Ontario");
        cityList.add(city);
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testHasCity() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        City city = new City("San Diego", "California");
        cityList.add(city);
        assertTrue(cityList.hasCity(city));
        City city1 = new City("New York City", "New York");
        assertFalse(cityList.hasCity(city1));
    }

    @Test
    void testDeleteCity() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        City city = new City("Quebec City", "Quebec");
        cityList.add(city);
        assertTrue(cityList.hasCity(city));
        cityList.deleteCity(city);
        assertFalse(cityList.hasCity(city));
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.deleteCity(city);
        });
    }

    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        assertEquals(0, cityList.countCities());
        City city = new City("Victoria", "British Columbia");
        cityList.add(city);
        assertEquals(1, cityList.countCities());
    }
}
