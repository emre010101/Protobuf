package protobuf;

import com.emrek.models.Credentials;
import com.emrek.models.EmailCredentials;
import com.emrek.models.PhoneOTP;

public class OneofDemo {

	public static void main(String[] args) {
		
		EmailCredentials emailCredentials = EmailCredentials.newBuilder()
			.setEmail("emrekavak3938@gmail.com")
			.setPassword("admin123")
			.build();
		
		PhoneOTP phone = PhoneOTP.newBuilder()
			.setNumber(2609862)
			.setCode(89)
			.build();
		
		Credentials credentials = Credentials.newBuilder()
		/*As we used oneof if we choose both of the mode
		 * the last one we choose will be the only one set*/
				.setEmailMode(emailCredentials)
				.setPhoneMode(phone) 
				.build();
		
		login(credentials);
	}
	
	private static void login(Credentials credentials) {
		/*Switch statement can be used to see which mode has been set
		 * getModeCase will be used to see the case*/
		switch(credentials.getModeCase()) {
		case EMAILMODE:
			System.out.println(credentials.getEmailMode());
			break;
		
		case PHONEMODE:
			System.out.println(credentials.getPhoneMode());
			break;
		}
		
	}
	
}
