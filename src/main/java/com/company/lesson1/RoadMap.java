package com.company.lesson1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoadMap {
    private Map<CheckPoint, Integer> checkPointDistance;

    public RoadMap(List<CheckPoint> checkPoints) {
        this.checkPointDistance = calculateDistances(checkPoints);
    }

    private Map<CheckPoint, Integer> calculateDistances(List<CheckPoint> checkPoints) {
        Map<CheckPoint, Integer> checkPointDistance = new HashMap<>();

        for (int index = 0; index < checkPoints.size() - 1; index++) {
            CheckPoint current = checkPoints.get(index);
            CheckPoint next = checkPoints.get(index + 1);

            int distance = Math.abs(current.getX() - next.getX()) + Math.abs(current.getY() - next.getY());
            checkPointDistance.put(current, distance);
        }

        if(checkPoints.size() > 0) {
            checkPointDistance.put(checkPoints.get(checkPoints.size() - 1), 0);
        }

        return checkPointDistance;
    }

    public Map<CheckPoint, Integer> getCheckPointDistance() {
        return checkPointDistance;
    }

    public Integer getDistanceToNextCheckPoint(CheckPoint current) {
        return checkPointDistance.get(current);
    }
}
