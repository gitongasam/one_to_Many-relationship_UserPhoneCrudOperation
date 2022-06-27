package com.devSam.library.management.system.UserEntity;

import com.devSam.library.management.system.PhoneEntity.Phone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Phone> phone;

}
