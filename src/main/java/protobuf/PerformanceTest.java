package protobuf;

import com.emreguru.models.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;

import json.JPerson;

public class PerformanceTest {

	
	public static void main(String[] args) {
		
		
		// Json
		JPerson person = new JPerson();
		person.setName("sam");
		person.setAge(10);
		ObjectMapper mapper = new ObjectMapper();
		
		//lambda expression
		Runnable json = () -> {
			try { //Serialising person instance to bytes in json
				byte[] bytes = mapper.writeValueAsBytes(person);
				// Deserializationing the data 
				JPerson person1 = mapper.readValue(bytes, JPerson.class);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		
		// protobuf
		Person sam = Person.newBuilder()
				.setName("sam")
				.setAge(10)
				.build();
		
		
		Runnable proto = () -> {
			try {
				byte[] bytes = sam.toByteArray();
				Person sam1 = Person.parseFrom(bytes);
			} catch (InvalidProtocolBufferException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		for(int i=0; i<5; i++) {
			runPerfonmanceTest(json, "JSON");
			runPerfonmanceTest(proto, "PROTO");
		}
	
		
	}
	
	private static void runPerfonmanceTest(Runnable runnable, String method) {
		long time = System.currentTimeMillis();
		for(int i=0; i<5_000_000; i++) {
			runnable.run();
		}
		
		long time2 = System.currentTimeMillis();
		
		System.out.println(method +": "+ (time2 - time) + " ms");
	}
	
}
