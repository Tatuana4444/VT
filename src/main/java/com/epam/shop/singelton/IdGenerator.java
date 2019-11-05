package com.epam.shop.singelton;

/**
 * Class that generate new id
 */
public class IdGenerator {
    private static Integer id;

    private IdGenerator() {
    }

    /**
     * Generate new id
     * @return new id
     */
    public static Integer getNewId() {
        if (id == null){
            id = 100;
        }
        return ++id;
    }
    

}
