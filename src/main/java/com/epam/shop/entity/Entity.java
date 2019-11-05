package com.epam.shop.entity;

import com.epam.shop.singelton.IdGenerator;

import java.io.Serializable;
import java.util.Objects;

/**
 * Marked for class that will be at database
 */

public class Entity implements Serializable {
    private  int id;

    /**
     * Constructor that generate id
     */
    public Entity() {
        this.id = IdGenerator.getNewId();
    }

    /**
     * Getter for id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Do string from entity
     * @return information about entity
     */
    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                '}';
    }

    /**
     * Compare object with this entity
     * @param o object with which it will be compare
     * @return it will return true if objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return id == entity.id;
    }

    /**
     * Do hash code
     * @return hash code of entity
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
