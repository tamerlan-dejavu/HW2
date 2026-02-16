package com.narxoz.rpg.behavior;

public class AggressiveBehavior implements AIBehavior {
    private String style;

    public AggressiveBehavior(String style) {
        this.style = style;
    }

    @Override
    public void execute() {
        System.out.println(style + " AI: Focuses on maximum damage and offensive abilities!");
    }

    @Override
    public String getDescription() {
        return style + " Aggressive Style";
    }
}