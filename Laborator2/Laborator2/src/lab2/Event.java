/*
 * FII JAVA 2022
 */
package lab2;

import java.util.Objects;

/**
 * Clasa Eveniment.
 *
 * @author Adm
 */
public class Event {

    private String name;
    private int size;
    private int startTime;
    private int endTime;

    public Event() {
    }

    public Event(String name) {
        this.name = name;
    }

    /**
     *
     * @return Numele evenimentului
     */
    public Event(String name, int size, int startTime, int endTime) {
        this.name = name;
        this.size = size;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size > 0");
        }
        this.size = size;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Event{" + "name=" + name + ", size=" + size + ", startTime=" + startTime + ", endTime=" + endTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Event other = (Event) obj;
        return Objects.equals(this.name, other.name);
    }

}
