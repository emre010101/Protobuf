package protobuf;

import com.emrek.models.BodyStyle;
import com.emrek.models.Car;
import com.emrek.models.Dealer;

public class MapDemo {
	
	public static void main(String[] args) {
	
	
	Car accord =Car.newBuilder()
			.setMake("Honda")
			.setModel("Accord")
			.setBodyStyle(BodyStyle.COUPE)
			.setYear(2020)
			.build();
		
		Car civic =Car.newBuilder()
				.setMake("Honda")
				.setModel("Civic")
				.setBodyStyleValue(0)
				.setYear(2005)
				.build();
		
		Dealer dealer = Dealer.newBuilder()
				.putModel(2005, civic)
				.putModel(2020, accord)
				.build();
		
		//System.out.println(dealer.getModelOrThrow(2020));
		//System.out.println(dealer.getModelOrThrow(2005));
		//System.out.println(dealer.getModelOrDefault(2000, accord));
		
		System.out.println(
				dealer.getModelOrThrow(2020).getBodyStyle()
				);
	}
}
