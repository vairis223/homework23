package io.codelex.enums;

public enum Directions {
    NORTH("North", "up", 0),
    SOUTH("South", "down", 1),
    EAST("East", "right", 2),
    WEST("West", "left", 3);

    private final String name;
    private final String direction;
    private final int num;

    Directions(String name, String direction, int num) {
        this.name = name;
        this.direction = direction;
        this.num = num;
    }
    public String getName () {
            return name;
        }

        public int getNum () {
            return num;
        }

        public String getDirection () {
            return direction;
        }

    }





