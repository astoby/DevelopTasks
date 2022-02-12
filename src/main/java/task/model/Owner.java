package task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Owner {
    private int id;
    private String name;
    private String lastName;
    private Date birth;
    private List<Car> ownedCars = new ArrayList<>();

    private int maxOwnerId = 0;

    @Override
    public String toString() {
        StringBuilder cars = new StringBuilder();
        for (Car car:ownedCars) {
            cars.append(car.toString());
        }
        cars = new StringBuilder(cars.toString().equals("") ? "У владельца не привязаны машины" : cars.toString());
        return "ID: " + id +
                " Имя: '" + name + '\'' +
                ", Фамилия: '" + lastName + '\'' +
                ", Дата рождения: " + birth +
                ", \nМашины: " + cars;
    }

    public void AddCar(Car car){
        ownedCars.add(car);
    }

    public int getId() {
        return id;
    }

    public Owner(int id, String name, String lastName, Date birth) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
