package ir.maktab;

import java.util.LinkedList;
import java.util.Objects;

public class Road {
    private int id;
    private String name;
    private int origin;
    private int destination;
    private LinkedList<Integer> through;
    private int speedLimit;
    private int length;
    private boolean biDirectional;

    public Road() {
    }

    public Road(int id, String name, int origin, int destination, LinkedList<Integer> through, int speedLimit, int length, boolean biDirectional) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.destination = destination;
        this.through = through;
        this.speedLimit = speedLimit;
        this.length = length;
        this.biDirectional = biDirectional;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public LinkedList<Integer> getThrough() {
        return through;
    }

    public void setThrough(LinkedList<Integer> through) {
        this.through = through;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isBiDirectional() {
        return biDirectional;
    }

    public void setBiDirectional(boolean biDirectional) {
        this.biDirectional = biDirectional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Road road = (Road) o;
        return id == road.id && origin == road.origin && destination == road.destination && speedLimit == road.speedLimit && length == road.length && biDirectional == road.biDirectional && Objects.equals(name, road.name) && Objects.equals(through, road.through);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, origin, destination, through, speedLimit, length, biDirectional);
    }

    @Override
    public String toString() {
        return "Road{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", origin=" + origin +
                ", destination=" + destination +
                ", through=" + through +
                ", speedLimit=" + speedLimit +
                ", length=" + length +
                ", biDirectional=" + biDirectional +
                '}';
    }
}
