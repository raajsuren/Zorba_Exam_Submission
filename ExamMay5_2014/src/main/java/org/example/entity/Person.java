package org.example.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "Person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "person_id")
    private Integer personId;

    @Column(name = "person_name", length = 150)
    private String personName;

    @Column(name = "person_email", length = 255)
    private String personEmail;

    @Column(name = "person_dob")
    private Timestamp personDob;

    @Column(name = "person_mobile", length = 10)
    private Integer personMobile;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "person_ticket_mapping",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "ticket_id")

    )
    private Set<TicketInfo> ticketInfos;


}
