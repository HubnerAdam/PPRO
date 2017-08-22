package com.example.ppro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.ppro.model.Zamestnanec;

@Service
public class NotificationService {

	private JavaMailSender javaMailSender;
	
	@Autowired
	public NotificationService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	public void sendNotification(Zamestnanec zamestnanec) throws MailException {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(zamestnanec.getEmail());
		mail.setFrom("pproemail2017@gmail.com");
		mail.setSubject("Test");
		mail.setText("Zkouska mailu");
		
		javaMailSender.send(mail);
	}
}
