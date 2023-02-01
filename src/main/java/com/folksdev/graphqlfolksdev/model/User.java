package com.folksdev.graphqlfolksdev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "`user`")
public class User extends BaseEntity {

  private String username;
  private String mail;

  @Enumerated(EnumType.STRING)
  private Role role;
}
