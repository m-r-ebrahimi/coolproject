package ir.maktab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Manage {
    private ArrayList<City> cities = new ArrayList<City>();
    private ArrayList<Road> roads = new ArrayList<Road>();


    public void addCity(City city) {
        cities.add(city);
    }

    public void addRoad(Road road) {
        roads.add(road);
    }

    public boolean deleteCity(int id) {
        Iterator<City> it = cities.iterator();
        while (it.hasNext()) {
            City temp = it.next();
            if (temp.equals(findCityById(id))) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public City findCityById(int id) {
        Iterator<City> it = cities.iterator();
        while (it.hasNext()) {
            City temp = it.next();
            if (temp.equals(new City(id))) {
                return temp;
            }
        }
        return null;
    }

    public boolean deleteRoad(int id) {
        Iterator<Road> it = roads.iterator();
        while (it.hasNext()) {
            Road temp = it.next();
            if (temp.equals(findCityById(id))) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public Road findRoadById(int id) {
        Iterator<Road> it = roads.iterator();
        while (it.hasNext()) {
            Road temp = it.next();
            if (temp.equals(new Road(id))) {
                return temp;
            }
        }
        return null;
    }

    public ArrayList<String> getPaths(int originId, int destinationId) {
        ArrayList<Road> tempRoads = new ArrayList<Road>();
        for (var road : roads) {
            if (road.getOrigin() == originId)
                tempRoads.add(road);
        }
        ArrayList<String> tempPath = new ArrayList<String>();
        for (var roads : tempRoads) {
            tempPath.add(getDestination(roads, destinationId));
        }
        ArrayList<String> result = new ArrayList<String>();
        for (var path:tempPath) {
            String[] roadId=path.split(" ");
            if(findRoadById(Integer.parseInt(roadId[roadId.length-1])).getDestination()==destinationId)
                result.add(path);
        }
        return result;
    }

    public String getDestination(Road road, int destinationId) {
        if (road.getDestination() == destinationId)
            return road.getId() + " ";
        else {

            ArrayList<Road> tempRoads = new ArrayList<Road>();
            for (var tmpRoad : roads) {
                if (tmpRoad.getOrigin() == road.getDestination())
                    tempRoads.add(tmpRoad);
            }
            for (var r : tempRoads) {
                return road.getId()+" " + getDestination(r, destinationId);
            }
        }
        return "";
    }
}
