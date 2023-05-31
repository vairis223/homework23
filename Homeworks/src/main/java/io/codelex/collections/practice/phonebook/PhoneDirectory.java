package io.codelex.collections.practice.phonebook;


import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<String, PhoneEntry> data;

    public PhoneDirectory() {
        data = new TreeMap<>();

    } private PhoneEntry find(String name) {
        return data.get(name);
    }

    public String getNumber(String name) {
        PhoneEntry entry = find(name);
        if (entry == null) {
            return null;
        } else {
            return entry.number;
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }

            PhoneEntry newEntry = new PhoneEntry();
            newEntry.name = name;
            newEntry.number = number;
            data.put(name, newEntry) ;

        }
    }

