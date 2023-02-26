package test.java;

import main.java.appForTests.Ammunition.*;
import main.java.appForTests.AmmunitionShop.ActionWithAmmunition;
import main.java.appForTests.AmmunitionShop.Shop;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class ActionWithAmmunitionTest {


    Shop getShop() {
        List<MotorcycleHelmet> motorcycleHelmetList = new ArrayList<MotorcycleHelmet>();
        List<MotorcycleGloves> motorcycleGlovesList = new ArrayList<MotorcycleGloves>();
        List<MotorcycleJacket> motorcycleJacketList = new ArrayList<MotorcycleJacket>();
        List<MotorcycleTrousers> motorcycleTrousersList = new ArrayList<MotorcycleTrousers>();
        List<MotorcycleBoots> motorcycleBootsList = new ArrayList<MotorcycleBoots>();

        motorcycleHelmetList.add(new MotorcycleHelmet("cool helmet", "nike", 1499, 12, "selicon", "wooden"));
        motorcycleGlovesList.add(new MotorcycleGloves("cool gloves", "nike", 499, 3, "34", "stone"));
        motorcycleJacketList.add(new MotorcycleJacket("cool jacket", "nike", 1999, 9, "L", "blue", "leather"));
        motorcycleTrousersList.add(new MotorcycleTrousers("cool trousers", "nike", 999, 4, "M", "black", "selicon"));
        motorcycleBootsList.add(new MotorcycleBoots("cool boots", "nike", 999, 6, 42, "air", "red"));
        return new Shop(motorcycleHelmetList, motorcycleGlovesList, motorcycleJacketList, motorcycleTrousersList, motorcycleBootsList);
    }
    @Test
    void getEmptyShop() {
        Shop shop = new Shop(new ArrayList<MotorcycleHelmet>(),
                new ArrayList<MotorcycleGloves>(),
                new ArrayList<MotorcycleJacket>(),
                new ArrayList<MotorcycleTrousers>(),
                new ArrayList<MotorcycleBoots>());
        ActionWithAmmunition actions = new ActionWithAmmunition(shop);
        assertEquals(shop, actions.getShop());
    }

    @Test
    void getNotEmptyShop() {
        List<MotorcycleHelmet> motorcycleHelmetList = new ArrayList<MotorcycleHelmet>();
        List<MotorcycleGloves> motorcycleGlovesList = new ArrayList<MotorcycleGloves>();
        List<MotorcycleJacket> motorcycleJacketList = new ArrayList<MotorcycleJacket>();
        List<MotorcycleTrousers> motorcycleTrousersList = new ArrayList<MotorcycleTrousers>();
        List<MotorcycleBoots> motorcycleBootsList = new ArrayList<MotorcycleBoots>();

        motorcycleHelmetList.add(new MotorcycleHelmet("cool helmet", "nike", 1499, 12, "selicon", "wooden"));
        motorcycleGlovesList.add(new MotorcycleGloves("cool gloves", "nike", 499, 3, "34", "stone"));
        motorcycleJacketList.add(new MotorcycleJacket("cool jacket", "nike", 1999, 9, "L", "blue", "leather"));
        motorcycleTrousersList.add(new MotorcycleTrousers("cool trousers", "nike", 999, 4, "M", "black", "selicon"));
        motorcycleBootsList.add(new MotorcycleBoots("cool boots", "nike", 999, 6, 42, "air", "red"));
        Shop shop = new Shop(motorcycleHelmetList, motorcycleGlovesList, motorcycleJacketList, motorcycleTrousersList, motorcycleBootsList);
        ActionWithAmmunition actionWithAmmunition = new ActionWithAmmunition((shop));
        assertEquals(shop, actionWithAmmunition.getShop());

    }
    @Test
    void setShop() {
        Shop shop = new Shop(new ArrayList<MotorcycleHelmet>(),
                new ArrayList<MotorcycleGloves>(),
                new ArrayList<MotorcycleJacket>(),
                new ArrayList<MotorcycleTrousers>(),
                new ArrayList<MotorcycleBoots>());

        ActionWithAmmunition actions = new ActionWithAmmunition(shop);

        List<MotorcycleHelmet> motorcycleHelmetList = new ArrayList<MotorcycleHelmet>();
        List<MotorcycleGloves> motorcycleGlovesList = new ArrayList<MotorcycleGloves>();
        List<MotorcycleJacket> motorcycleJacketList = new ArrayList<MotorcycleJacket>();
        List<MotorcycleTrousers> motorcycleTrousersList = new ArrayList<MotorcycleTrousers>();
        List<MotorcycleBoots> motorcycleBootsList = new ArrayList<MotorcycleBoots>();

        motorcycleHelmetList.add(new MotorcycleHelmet("cool helmet", "nike", 1499, 12, "selicon", "wooden"));
        motorcycleGlovesList.add(new MotorcycleGloves("cool gloves", "nike", 499, 3, "34", "stone"));
        motorcycleJacketList.add(new MotorcycleJacket("cool jacket", "nike", 1999, 9, "L", "blue", "leather"));
        motorcycleTrousersList.add(new MotorcycleTrousers("cool trousers", "nike", 999, 4, "M", "black", "selicon"));
        motorcycleBootsList.add(new MotorcycleBoots("cool boots", "nike", 999, 6, 42, "air", "red"));

        Shop shop2 = new Shop(motorcycleHelmetList, motorcycleGlovesList, motorcycleJacketList, motorcycleTrousersList, motorcycleBootsList);

        actions.setShop(shop2);
        assertEquals(shop2, actions.getShop());

    }

    @Test
    void showItemsInfo() {
    }

    @Test
    void isAmmunitionListNotEmpty() {
    }

    @Test
    void inputIndexValue() {
    }

    @Test
    void isInputIndexValidationTrue() {
    }

    @Test
    void parseValue() {
    }

    @Test
    void inputYesNoValue() {
    }

    @Test
    void isYesNoValidationTrue() {
    }

    @Test
    void isInputIndexNumberBeInRangeListSize() {
    }

    @Test
    void isDenial() {
    }

    @Test
    void isYesOrNo() {
    }

    @Test
    void selectAmmunition() {
    }

    @Test
    void sortByWeight() {
    }

    @Test
    void inputMaxMinValue() {
    }

    @Test
    void isMaxMinValidationTrue() {
    }

    @Test
    void findAndShowItemsInRangePrice() {
    }
}