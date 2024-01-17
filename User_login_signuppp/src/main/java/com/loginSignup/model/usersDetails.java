package com.loginSignup.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class usersDetails {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;
private String FullName;
private String email;
private String Address;
private String Qualification	;
private String Password;
private String role;
}
