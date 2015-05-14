/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package path.of.the.jedi;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author kayla
 */
public class Room implements Serializable {
    
    //class instances
    private String name;
    private String description;
    private double xCoordinate;
    private double yCoordinate;

    public Room() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    @Override
    public String toString() {
        return "Room{" + "name=" + name + ", description=" + description + ", xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.xCoordinate) ^ (Double.doubleToLongBits(this.xCoordinate) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.yCoordinate) ^ (Double.doubleToLongBits(this.yCoordinate) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Room other = (Room) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.xCoordinate) != Double.doubleToLongBits(other.xCoordinate)) {
            return false;
        }
        if (Double.doubleToLongBits(this.yCoordinate) != Double.doubleToLongBits(other.yCoordinate)) {
            return false;
        }
        return true;
    }
    
    
    
}
