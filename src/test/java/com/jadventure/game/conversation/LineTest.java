package com.jadventure.game.conversation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {
    @Test
    public void createTest() {
        Line line = new Line(1, "Who are you?", "I am your guide.", ConditionType.NONE, "", null, ActionType.NO_ACTION);
        assertEquals(1, line.getId());
        assertEquals("Who are you?", line.getPlayerPrompt());
        assertEquals("I am your guide.", line.getText());
        assertEquals(ConditionType.NONE, line.getCondition());
        assertEquals(ActionType.NO_ACTION, line.getAction());
    }
}
