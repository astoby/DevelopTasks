import task.model.Car;
import task.model.Owner;
import task.service.CarSerive;
import task.service.OwnerService;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world");
        OwnerService.CreateOwner("Владимир","Абв", new Date());
        OwnerService.CreateOwner("Владимир","Бвд", new Date());
        OwnerService.CreateOwner("Иннокентий","Гдз", new Date());
//        OwnerService.soutOwner("Тест");

        CarSerive.createCar("Tesla","Tesla", "112356");

        List<Car> cars = CarSerive.getCarsByModel("Tesla");
        Owner owner = OwnerService.getOwnerById(0);
        OwnerService.setCarToOwner(owner, cars.get(0));
        OwnerService.setCarToOwner(owner, cars.get(0));
//        OwnerService.soutOwner("Тест");

        System.out.println("--------------------------------------------------------------------------------------------");
        List<Owner> ownersByLastName = OwnerService.getOwnersByLastName("Тестович");
        ownersByLastName.forEach(ownerByLastName -> System.out.println(ownerByLastName.toString()));

        System.out.println("--------------------------------------------------------------------------------------------");
        List<Owner> ownersByName = OwnerService.getOwnersByName("Владимир");
        ownersByName = OwnerService.sortByLastName(ownersByName,false);
        ownersByName.forEach(ownerByLastName -> System.out.println(ownerByLastName.toString()));

        System.out.println("--------------------------------------------------------------------------------------------");
        Owner ownerById = OwnerService.getOwnerById(0);



    }
}
