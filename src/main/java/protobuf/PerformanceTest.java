package protobuf;

import com.emrek.models.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Int32Value;
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
				System.out.println("jsonLength: " + bytes.length);
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
				.setAge(Int32Value.newBuilder().setValue(15).build())
				.build();
		
		
		Runnable proto = () -> {
			try {
				byte[] bytes = sam.toByteArray();
				Person sam1 = Person.parseFrom(bytes);
				System.out.println("protoLength: " + bytes.length);
			} catch (InvalidProtocolBufferException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		for(int i=0; i<1; i++) {
			//change iteration to 5
			runPerfonmanceTest(json, "JSON");
			runPerfonmanceTest(proto, "PROTO");
		}
	
		
	}
	
	private static void runPerfonmanceTest(Runnable runnable, String method) {
		long time = System.currentTimeMillis();
		for(int i=0; i<1; i++) {
			//change i to bigger 
			runnable.run();
		}
		
		long time2 = System.currentTimeMillis();
		
		System.out.println(method +": "+ (time2 - time) + " ms");
	}
	
}
