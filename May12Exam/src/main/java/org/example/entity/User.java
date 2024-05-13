package org.example.entity;


import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name= "user")
public class User {

    @Column(name = "UserId")
    private Integer id;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "Email")
    private String email;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

}
