package com.hibernate.hibernateproject;
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;
@Entity  
@Table(name= "Empdetails")   
public class Empdetails {    
  
@Id

private int id;    
private String firstName,lastName,address,gender;    
    
public int getId() {    
    return id;    
}    
public void setId(int id) {    
    this.id = id;    
}    
public String getFirstName() {    
    return firstName;    
}    
public void setFirstName(String firstName) {    
    this.firstName = firstName;    
}    
public String getLastName() {    
    return lastName;    
}    
public void setLastName(String lastName) {    
    this.lastName = lastName;
    
    
} 
public String getaddress() {    
    return address;    
}    
public void setaddress(String address) {    
    this.address = address;    
}  
public String getgender() {    
    return gender;    
}    
public void setgender(String gender) {    
    this.gender = gender;    
}  
}   