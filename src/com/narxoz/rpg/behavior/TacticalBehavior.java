package com.narxoz.rpg.behavior;

public class TacticalBehavior implements AIBehavior {
    private String style;

    public TacticalBehavior(String style) {
        this.style = style;
    }

    @Override
    public void execute() {
        System.out.println(style + " AI: Uses positioning, stealth and hit-&-run tactics.");
    }

    @Override
    public String getDescription() {
        return style + " Tactical Style";
    }
}
