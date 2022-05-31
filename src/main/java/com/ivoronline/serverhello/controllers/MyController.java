package com.ivoronline.serverhello.controllers;

import com.ivoronline.serverhello.dto.PersonDTO;
import com.ivoronline.serverhello.dto.PersonDTOXML;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //==============================================================
  // SEND REQUEST
  //==============================================================
  @RequestMapping("SendRequest")
  String sendRequest() {
    return "Hello from Controller";
  }

  //==============================================================
  // SEND REQUEST PARAMETERS
  //==============================================================
  @RequestMapping("SendRequestParameters")
  String sendRequestParameters(@RequestParam String name, @RequestParam Integer age) {
    return name + " is " + age + " years old";
  }

  //==============================================================
  // SEND REQUEST HEADERS
  //==============================================================
  @RequestMapping("SendRequestHeaders")
  String sendRequestHeaders(@RequestHeader String username, @RequestHeader String authorization) {
    return username + " - " + authorization;
  }

  //==============================================================
  // SEND BODY TEXT
  //==============================================================
  @RequestMapping("SendBodyText")
  String sendBodyText(@RequestBody String body) {
    return "Received body: " + body;
  }

  //================================================================
  // SEND BODY JSON
  //================================================================
  @RequestMapping("SendBodyJSON")
  public String sendBodyJSON(@RequestBody PersonDTO personDTO) {
    return personDTO.name + " is " + personDTO.age + " years old";
  }

  //================================================================
  // SEND BODY XML
  //================================================================
  @RequestMapping("SendBodyXML")
  public String sendBodyXML(@RequestBody PersonDTOXML personDTOXML) {
    //System.out.println(string);
    //return string;
    return personDTOXML.name + " is " + personDTOXML.age + " years old";
  }

  //==============================================================
  // RECEIVE BODY TEXT
  //==============================================================
  @RequestMapping("ReceiveBodyText")
  String receiveBodyText() {
    return "Hello from Controller";
  }

  //================================================================
  // RECEIVE BODY JSON
  //================================================================
  @RequestMapping("ReceiveBodyJSON")
  public PersonDTO receiveBodyJSON() {

    //CREATE INSTANCE
    PersonDTO personDTO      = new PersonDTO();
              personDTO.id   = 1;
              personDTO.name = "John";
              personDTO.age  = 20;

    //RETURN INSTANCE AS JSON
    return personDTO;

  }

  //================================================================
  // RECEIVE BODY XML
  //================================================================
  @RequestMapping(value = "ReceiveBodyXML", produces = { "application/JSON" })
  public PersonDTOXML receiveBodyXML() {

    //CREATE INSTANCE
    PersonDTOXML personDTOXML      = new PersonDTOXML();
                 personDTOXML.id   = 1;
                 personDTOXML.name = "John";
                 personDTOXML.age  = 20;

    //RETURN INSTANCE AS JSON
    return personDTOXML;

  }

}
