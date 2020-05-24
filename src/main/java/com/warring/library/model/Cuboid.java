package com.warring.library.model;

import com.warring.library.utils.RegionUtils;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Cuboid {

    private Location primary, second;

    public Cuboid(Location primary, Location secondary) {
        this.second = secondary;
        this.primary = primary;
    }

    public Location getPrimary() {
        return primary;
    }

    public Location getSecond() {
        return second;
    }

    public boolean playerInCuboid(Player p) {
        return RegionUtils.isWithinCuboid(p.getLocation(), primary, second);
    }
}