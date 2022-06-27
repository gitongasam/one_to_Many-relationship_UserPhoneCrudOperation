package com.devSam.library.management.system.PhoneEntity;

import com.devSam.library.management.system.UserEntity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

  private String Type;
  private Long cost;
    @ManyToOne
    @JoinColumn(name = "User_Id")
  private User user;
}
