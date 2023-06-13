package com.example.userdata.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.print.DocFlavor;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class entity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long userid;
    private String firstname;
    private String lastname;
    private String password;
    private String email;


}
