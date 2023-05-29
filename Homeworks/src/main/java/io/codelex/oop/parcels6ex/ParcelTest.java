package io.codelex.oop.parcels6ex;

public class ParcelTest {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(60, 70, 80,14.0f, true);
        if (parcel1.validate()) {
            System.out.println("Parcel 1 is valid!");
        }else{
            System.out.println("Parcel 1 is not valid!");
        }
        System.out.println();

        Parcel parcel2 = new Parcel(50,45,60,35.0f,false);
        if (parcel2.validate()) {
            System.out.println("Parcel 2 is valid!");
        }else{
            System.out.println("Parcel 2 is not valid!");
        }
    }
}
