package in.bushansirgur.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.service.EmailService;

@RestController
public class EmailController {
	
	@Autowired
    private EmailService emailService;

    @GetMapping(value = "/sendmail")
    public String sendmail() {

        emailService.sendMail("example@zohomail.in", "Test Subject", "Test mail");

        return "Success";
    }
}
