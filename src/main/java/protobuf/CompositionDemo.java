package protobuf;

import java.util.ArrayList;
import java.util.List;

import com.emreguru.models.Address;
import com.emreguru.models.Car;
import com.emreguru.models.Person;

public class CompositionDemo {
	
	public static void main(String[] args) {
		
		Address address = Address.newBuilder()
			.setPostbox(123)
			.setStreet("main street")
			.setCity("Atlanta")
			.build();
		
		Car accord =Car.newBuilder()
			.setMake("Honda")
			.setModel("Accord")
			.setYear(2020)
			.build();
		
		Car civic =Car.newBuilder()
				.setMake("Honda")
				.setModel("Civic")
				.setYear(2005)
				.build();
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(accord);
		cars.add(civic);
		
		Person sam = Person.newBuilder()
			.setName("sam")
			.setAge(25)
			/*.addCar(civic)
			.addCar(accord) if we were are adding them by one by*/
			.addAllCar(cars)
			.setAddress(address)
			.build();
		
		System.out.println(sam);
	}
}
