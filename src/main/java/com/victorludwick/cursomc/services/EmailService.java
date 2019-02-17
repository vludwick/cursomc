package com.victorludwick.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.victorludwick.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
