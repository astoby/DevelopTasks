package task.service;

import task.model.Car;
import task.model.Owner;

import java.io.Flushable;
import java.util.*;

public class OwnerService {
    private static List<Owner> ownersList = new ArrayList<>();
    private static int maxOwnerId = 0;


    public static void CreateOwner(String name, String lastName, Date birth) {
        Owner owner = new Owner(maxOwnerId++, name, lastName, birth);
        ownersList.add(owner);
    }

    public static void DeleteOwnerByName(String name) {
        ownersList.forEach(owner -> {
            if (owner.getName().equals(name)) {
                ownersList.remove(owner);
            }
        });
    }

    public static void soutOwner(String name) {
        ownersList.forEach(owner -> {
            if (owner.getName().equals(name)) {
                System.out.println(owner.toString());
            }
        });
    }

    public static void setCarToOwner(Owner owner, Car car) {
        owner.AddCar(car);
    }

    public static List<Owner> getOwnersByName(String name) {
        List<Owner> listOfOwners = new ArrayList<>();
        for (Owner owner : ownersList) {
            if (owner.getName().equals(name)) {
                listOfOwners.add(owner);
            }
        }
        return listOfOwners;
    }

    public static List<Owner> getOwnersByLastName(String lastName) {
        List<Owner> listOfOwners = new ArrayList<>();
        for (Owner owner : ownersList) {
            if (owner.getLastName().equals(lastName)) {
                listOfOwners.add(owner);
            }
        }
        return listOfOwners;
    }

    public static Owner getOwnerById(int id) {
        for (Owner owner : ownersList) {
            if (owner.getId() == id) {
                return owner;
            }
        }
        return null;
    }

    public static List<Owner> sortByName(List<Owner> ownersList, boolean reverse) {
        ownersList.sort(Comparator.comparing(Owner::getName));
        if (reverse)
            Collections.reverse(ownersList);
        return ownersList;
    }

    public static List<Owner> sortByLastName(List<Owner> ownersList, boolean reverse) {
        ownersList.sort(Comparator.comparing(Owner::getName));
        if (reverse)
            Collections.reverse(ownersList);
        return ownersList;
    }
}
