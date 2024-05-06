package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.dialect.function.TruncFunction;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "TicketInfo")
@Data
public class TicketInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id", length = 100)
    private Integer ticketId;

    @Column(name = "ticket_type", length = 100)
    private String ticketType;

    @Column(name = "date_of_ticket")
    private Date dateOfTicket;

    @Column(name = "person_id")
    private Integer personId;

    @Column(name = "bus_id")
    private Integer busId;

    @ManyToMany(mappedBy = "ticket_id")
    private Set<Person> persons;

    @ManyToOne(fetch = FetchType.LAZY)
    private BusInfo busInfo;


}
