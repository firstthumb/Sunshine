package com.ekocaman.sunshine.data;

public class City {

    public static class Coordinate {
        public float lon;
        public float lat;

        @Override
        public String toString() {
            return "Coordinate{" +
                    "lon=" + lon +
                    ", lat=" + lat +
                    '}';
        }
    }

    private String id;
    private String name;
    private String country;
    private int population;
    private Coordinate coord;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Coordinate getCoord() {
        return coord;
    }

    public void setCoord(Coordinate coord) {
        this.coord = coord;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", coord=" + coord +
                '}';
    }
}
