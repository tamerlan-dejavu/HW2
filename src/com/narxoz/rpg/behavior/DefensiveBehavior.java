package com.narxoz.rpg.behavior;

public class DefensiveBehavior implements AIBehavior {
    private String style;

    public DefensiveBehavior(String style) {
        this.style = style;
    }

    @Override
    public void execute() {
        System.out.println(style + " AI: Prioritizes defense, crowd-control and survivability.");
    }

    @Override
    public String getDescription() {
        return style + " Defensive Style";
    }
}
