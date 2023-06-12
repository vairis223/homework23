package io.codelex.storageHouse.practice;

import io.codelex.oop.summary.generics.StorageHouse;
import org.junit.Test;

import java.util.Optional;

public class StorageHouseTest {

    @Test
    public void testStorageHouse() {

        StorageHouse<String> stringStorageHouse = new StorageHouse<>("Bear");
        stringStorageHouse.addMoreItems("Tiger");


        Optional<String> maybeFirstString = stringStorageHouse.getMaybeFirstItem();
        assert maybeFirstString.isPresent();
        assert maybeFirstString.get().equals("Bear");


        stringStorageHouse.printItems();


        StorageHouse<Integer> integerStorageHouse = new StorageHouse<>(35);
        integerStorageHouse.addMoreItems(35);


        Optional<Integer> maybeFirstInteger = integerStorageHouse.getMaybeFirstItem();
        assert maybeFirstInteger.isPresent();
        assert maybeFirstInteger.get() == 35;


        integerStorageHouse.printItems();
    }
}