package com.ivoronline.serverhello.dto;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;   //For XML

@XmlRootElement(name="PersonDTOXML")               //Otherwise personDTOXML
public class PersonDTOXML {

  //PROPERTIES
  @XmlAttribute public Integer id;
  @XmlAttribute public String  name;
  @XmlAttribute public Integer age;

}
