package com.company.lesson1;

import java.util.Map;

public class RoadMap {
    private Map<CheckPoint, Integer> checkPointDistance;

    public RoadMap(Map<CheckPoint, Integer> checkPointDistance) {
        this.checkPointDistance = checkPointDistance;
    }

    public Map<CheckPoint, Integer> getCheckPointDistance() {
        return checkPointDistance;
    }
}
