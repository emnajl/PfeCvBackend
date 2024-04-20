//package com.example.admin.web;


import com.example.admin.entities.Email;
//import com.example.admin.services.EmailService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//@RestController
//@AllArgsConstructor
//@Slf4j
//@CrossOrigin("*")
//public class EmailController {
    //private EmailService emailService;

    //@PostMapping("/email")
    //public ResponseEntity<Email> sendAccountDetailsEmail(@RequestBody Email request) {
        //try {
            //emailService.sendAccountDetailsEmail(request.getEmail(), request.getName(), request.getPassword());
          //  Email email = new Email();
        //    return ResponseEntity.ok(email);
      //  }catch(MailException e) {
    //        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
  //      }

//
    //}




//}
