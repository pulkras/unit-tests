package main.java.appForTests.AmmunitionShop;

import main.java.appForTests.Ammunition.*;
import main.java.appForTests.Ammunition.MotorcycleGloves;

import java.util.List;
import java.util.Objects;

public class Shop {

    private List<MotorcycleHelmet> motorcycleHelmetList;
    private List<MotorcycleGloves> motorcycleGlovesList;
    private List<MotorcycleJacket> motorcycleJacketList;
    private List<MotorcycleTrousers> motorcycleTrousersList;
    private List<MotorcycleBoots> motorcycleBootsList;

    public Shop(List<MotorcycleHelmet> motorcycleHelmetList, List<MotorcycleGloves> motorcycleGlovesList, List<MotorcycleJacket> motorcycleJacketList,
                List<MotorcycleTrousers> motorcycleTrousersList, List<MotorcycleBoots> motorcycleBootsList) {
        this.motorcycleHelmetList = motorcycleHelmetList;
        this.motorcycleGlovesList = motorcycleGlovesList;
        this.motorcycleJacketList = motorcycleJacketList;
        this.motorcycleTrousersList = motorcycleTrousersList;
        this.motorcycleBootsList = motorcycleBootsList;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Shop shop)) return false;
        return motorcycleHelmetList.equals(shop.motorcycleHelmetList) && motorcycleGlovesList.equals(shop.motorcycleGlovesList) && motorcycleJacketList.equals(shop.motorcycleJacketList) && motorcycleTrousersList.equals(shop.motorcycleTrousersList) && motorcycleBootsList.equals(shop.motorcycleBootsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motorcycleHelmetList, motorcycleGlovesList, motorcycleJacketList, motorcycleTrousersList, motorcycleBootsList);
    }

    public List<MotorcycleHelmet> getMotorcycleHelmetList() {
        return motorcycleHelmetList;
    }

    public List<MotorcycleGloves> getMotorcycleGlovesList() {
        return motorcycleGlovesList;
    }

    public List<MotorcycleJacket> getMotorcycleJacketList() {
        return motorcycleJacketList;
    }

    public List<MotorcycleTrousers> getMotorcycleTrousersList() {
        return motorcycleTrousersList;
    }

    public List<MotorcycleBoots> getMotorcycleBootsList() {
        return motorcycleBootsList;
    }

    @Override
    public String toString() {
        return "Shop: " +
                "motorcycleHelmetList=" + motorcycleHelmetList + "\n" +
                " motorcycleGlovesList=" + motorcycleGlovesList + "\n" +
                " motorcycleJacketList=" + motorcycleJacketList + "\n" +
                " motorcycleTrousersList=" + motorcycleTrousersList + "\n" +
                " motorcycleBootsList=" + motorcycleBootsList;
    }
}

