package javacamp.hrms.emailService;

import org.springframework.stereotype.Service;

@Service
public class EmailSendManager {
	public void emailSending(String email) {
		System.out.println("'"+email+"' mail adresine doğrulama maili gönderildi.");
	}
}
