package com.jadventure.game.conversation;

import com.jadventure.game.DeathException;
import com.jadventure.game.entities.NPC;
import com.jadventure.game.entities.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class ConversationManagerTest {
    ConversationManager cm;

    @BeforeEach
    public void setUp() {
        cm = ConversationManager.getInstance();
    }

    @Test
    public void testCreation() {
        assertNotNull(cm);
        assertTrue(cm instanceof ConversationManager);
    }

    @Test
    public void testAAA() throws DeathException {
        NPC npc = mock(NPC.class);
        Player player = mock(Player.class);

        cm.startConversation(npc, player);

    }
}
