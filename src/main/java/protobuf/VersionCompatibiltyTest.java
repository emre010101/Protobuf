package protobuf;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.emrek.models.Televison;

public class VersionCompatibiltyTest {
	
	public static void main(String[] args) throws IOException {
		
		Televison television = Televison.newBuilder()
			.setBrand("sony")
			.setYear(2015)
			.build();
		
		/*Televison television = Televison.newBuilder()
				.setBrand("sony")
				.setModel(2016)
				.setType(Type.OLED)
				.build();*/
			
		
		Path pathV1 = Paths.get("tv-v1");
		Files.write(pathV1, television.toByteArray());
		
		/*Path pathV2 = Paths.get("tv-v2");
		Files.write(pathV2, television.toByteArray());*/
		
		//Desiralising
		byte[] bytes = Files.readAllBytes(pathV1);
		System.out.println(
				Televison.parseFrom(bytes)
				);

	}
}
