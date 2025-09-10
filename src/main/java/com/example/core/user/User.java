package com.example.core.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
@Data
public class User {

//    @Id
     Integer id;
     String name;
}
