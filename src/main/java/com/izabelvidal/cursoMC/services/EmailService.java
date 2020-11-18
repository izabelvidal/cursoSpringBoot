package com.izabelvidal.cursoMC.services;

import org.springframework.mail.SimpleMailMessage;

import com.izabelvidal.cursoMC.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
