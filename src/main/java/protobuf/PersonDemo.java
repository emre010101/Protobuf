package protobuf;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.emrek.models.Person;
import java.nio.file.Files;

public class PersonDemo {

	public static void main(String[] args) throws IOException{
		
		/*Person sam = Person.newBuilder()
				.setName("sam")
				.setAge(10)
				.build();*/
		
		Path path = Paths.get("sam.ser");
		//Files.write(path, sam.toByteArray());
		
		byte[] bytes = Files.readAllBytes(path);
		Person newSam = Person.parseFrom(bytes);
		
		System.out.println(
				newSam
				);
		
		/*
		 * Person sam2 = Person.newBuilder() .setName("Sam") .setAge(10) .build();
		 * 
		 * System.out.println( sam1.equals(sam2) );
		 */
		 
	}
}
