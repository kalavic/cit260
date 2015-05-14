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
public class ship implements Serializable {
    
    //class instance variables
    private String name;
    private String description;
    private double xCoordinate;
    private double yCoordinate;
    private double shield;
    private double armor;
    private double weapon;

    public ship() {
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

    public double getShield() {
        return shield;
    }

    public void setShield(double shield) {
        this.shield = shield;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getWeapon() {
        return weapon;
    }

    public void setWeapon(double weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "ship{" + "name=" + name + ", description=" + description + ", xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + ", shield=" + shield + ", armor=" + armor + ", weapon=" + weapon + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.xCoordinate) ^ (Double.doubleToLongBits(this.xCoordinate) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.yCoordinate) ^ (Double.doubleToLongBits(this.yCoordinate) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.shield) ^ (Double.doubleToLongBits(this.shield) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.armor) ^ (Double.doubleToLongBits(this.armor) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.weapon) ^ (Double.doubleToLongBits(this.weapon) >>> 32));
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
        final ship other = (ship) obj;
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
        if (Double.doubleToLongBits(this.shield) != Double.doubleToLongBits(other.shield)) {
            return false;
        }
        if (Double.doubleToLongBits(this.armor) != Double.doubleToLongBits(other.armor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weapon) != Double.doubleToLongBits(other.weapon)) {
            return false;
        }
        return true;
    }
    
    
}
