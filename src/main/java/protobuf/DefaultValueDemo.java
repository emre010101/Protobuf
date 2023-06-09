package protobuf;

import com.emrek.models.Person;

public class DefaultValueDemo {

	public static void main(String[] args) {
		
		Person person = Person.newBuilder().build();
		/*There is none null value in proto file 
		 * eventough we haven't set the city property
		 * we will not receive exception*/
		System.out.println(
				"City : " + person.getAddress().getCity()
				);
		/*However proto file has this nice feture
		 * in which we can figure out if it's null or not
		 * has method only works on data type you give not on 
		 * primitive data types such as strings and integers
		 * hasName or hasAge wouldn't work*/
		System.out.println(
				person.hasAddress()
				);
	}
}
