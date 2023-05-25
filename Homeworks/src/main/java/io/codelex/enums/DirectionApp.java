package io.codelex.enums;



public class DirectionApp {
    public static void main(String[] args) {
        for (Directions direction : Directions.values()) {
            switch (direction) {
                case NORTH -> System.out.println(direction.getName() + ": " + direction.getDirection() + " : " + direction.getNum());
                case SOUTH -> System.out.println(direction.getName() + ": " + direction.getDirection() + " : " + direction.getNum());
                case EAST -> System.out.println(direction.getName() + ": " + direction.getDirection() + " : " + direction.getNum());
                case WEST -> System.out.println(direction.getName() + ": " + direction.getDirection() + " : " + direction.getNum());
            }
        }
    }
}
