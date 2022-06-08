package com.jadventure.game.entities;

import com.jadventure.game.items.Item;
import com.jadventure.game.items.Storage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.MAP;


public class EntityTest {
    private Entity entity;

    @BeforeEach
    public void setUp() {
        entity = new Player();
    }

    @AfterEach
    public void destroy() {
        entity = null;
    }

    @Test
    public void testCreation() {
        assertThat(entity).isInstanceOf(Entity.class);
    }

    @Test
    public void testType() {
        testInt(entity.getHealthMax());
        testInt(entity.getHealth());
        Object test = entity.getName();
        assertThat(test).isInstanceOf(String.class);
        testInt(entity.getLevel());
        testInt(entity.getStrength());
        testInt(entity.getIntelligence());
        testInt(entity.getDexterity());
        testInt(entity.getLuck());
        testInt(entity.getStealth());
        testInt(entity.getGold());
        test = entity.getDamage();
        assertThat(test).isInstanceOf(Double.class);
        test = entity.getWeapon();
        assertThat(test).isInstanceOf(String.class);
        test = entity.getEquipment();

    }

    @Test
    public void testSetters() {
        entity.setHealth(50);
        assertThat(entity.getHealth()).isEqualTo(50);
        assertThat(entity.getHealthMax()).isGreaterThan(entity.getHealth());

        entity.setGold(10);
        assertThat(entity.getGold()).isEqualTo(10);

        entity.setArmour(20);
        assertThat(entity.getArmour()).isEqualTo(20);

        entity.setHealthMax(30);
        assertThat(entity.getHealthMax()).isEqualTo(30);
        assertThat(entity.getHealth()).isLessThanOrEqualTo(entity.getHealthMax());

        entity.setLevel(3);
        assertThat((entity.getLevel())).isEqualTo(3);
    }

    @Test
    public void testStorage() {
        String id = "pmil1";
        String type = "food-liquid";
        String name = "milk"; 
        String description = "";
        Item item = new Item(id, type, name, description, 1, null);
        entity.setStorage(new Storage(300));
        entity.addItemToStorage(item);
        assertThat(entity.getStorage().getItems().get(0).getItem()).isEqualTo(item);
    }

    private void testInt(Object test) {
        assertThat(test).isInstanceOf(Integer.class);
    }
}
