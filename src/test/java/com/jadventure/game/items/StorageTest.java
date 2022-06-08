package com.jadventure.game.items;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;


class StorageTest {

    @DisplayName("기존에 아이템을 30개 가지고, 추가로 30개 획득시 테스트")
    @Test
    void addItemTest(){
        //given
        ArrayList<ItemStack> itemList = new ArrayList<ItemStack>();
        String id = "pmil1";
        String type = "food-liquid";
        String name = "milk";
        String description = "";
        Item item = new Item(id, type, name, description, 1, null);
        ItemStack itemStack = new ItemStack(30, item);
        itemList.add(itemStack);
        Storage storage = new Storage(300D, itemList);

        //when
        itemStack = new ItemStack(30, item);
        storage.addItem(itemStack);

        //then
        assertThat(storage.getItems().get(0).getAmount()).isEqualTo(60);
    }

    @DisplayName("기존에 아이템을 30개 가지고, 5개 제거시 테스트")
    @Test
    void removeItemTest(){
        //given
        ArrayList<ItemStack> itemList = new ArrayList<ItemStack>();
        String id = "pmil1";
        String type = "food-liquid";
        String name = "milk";
        String description = "";
        Item item = new Item(id, type, name, description, 1, null);
        ItemStack itemStack = new ItemStack(30, item);
        itemList.add(itemStack);
        Storage storage = new Storage(300D, itemList);

        //when
        storage.removeItem(itemStack, 5);

        //then
        assertThat(storage.getItems().get(0).getAmount()).isEqualTo(25);

    }

}