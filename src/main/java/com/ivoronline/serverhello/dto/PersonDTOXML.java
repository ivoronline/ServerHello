package com.ivoronline.serverhello.dto;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;   //For XML

@XmlRootElement(name="PersonDTOXML")               //Otherwise personDTOXML
public class PersonDTOXML {

  //PROPERTIES
  @XmlAttribute public Integer id;    //Serialize Property into XML Attribute
                public String  name;  //Serialize Property into XML Child Element (default)
                public Integer age;   //Serialize Property into XML Child Element (default)

}
