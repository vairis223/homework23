package io.codelex.oop.parcels6ex;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength > 300) {
            System.out.println("Error, exceeds 300!");
            return false;
        }
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Error, too less size!");
            return false;
        }
        if (!isExpress && weight > 30.0) {
            System.out.println("Error, weight exceeds 30.0! ");
            return false;
        }
        if (isExpress && weight > 15.0) {
            System.out.println("Error, weight exceeds 15.0! ");
            return false;
        }
        return true;
    }
}
