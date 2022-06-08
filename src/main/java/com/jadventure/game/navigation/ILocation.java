package com.jadventure.game.navigation;

import com.jadventure.game.entities.NPC;
import com.jadventure.game.items.Item;
import com.jadventure.game.items.ItemStack;
import com.jadventure.game.monsters.Monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This interface maps all the properties and methods that 
 * pertain to a specific location.
 */
public interface ILocation {
    Coordinate getCoordinate();
    String getTitle();
    String getDescription();
    LocationType getLocationType();

    Map<Direction, ILocation> getExits();

    List<Item> getItems();
    void removePublicItem(String itemID);
    void addPublicItem(String itemID);

    void addPublicItems(ArrayList<ItemStack> items);

    List<NPC> getNPCs();

    List<Monster> getMonsters();
    void addMonster(Monster monster);
    void removeMonster(Monster monster);

    void print();
    int getDangerRating();
    void setDangerRating(int dangerRating);
}

