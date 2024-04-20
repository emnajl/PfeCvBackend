package com.example.admin.services;


import com.example.admin.entities.Email;
import com.example.admin.repositories.EmailRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

//@Service
//@Transactional
//@AllArgsConstructor
//public class EmailServiceImpl  implements EmailService{
    //private EmailRepository emailRepository;
    //private JavaMailSender javaMailSender;


    //@Override
    //public void sendAccountDetailsEmail(String email, String name, String password) throws MailException {
        //SimpleMailMessage mail = new SimpleMailMessage();
        //mail.setTo(email);
        //mail.setSubject("Votre compte a été créé avec succès !");
        //mail.setText("Bonjour,\n\nVotre compte a été créé avec succès. Voici vos informations de connexion :\n\n" +
                //"Nom d'utilisateur : " + name + "\n" +
              //  "Mot de passe : " + password + "\n\n" +
            //    "Vous pouvez maintenant vous connecter à votre compte.\n\n" +
          //      "Cordialement,\n\nL'équipe de gestion");
        //javaMailSender.send(mail);
    //}
  //  }

