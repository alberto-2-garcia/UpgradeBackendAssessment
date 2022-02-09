package com.atos.upgrade.backend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tbl_Profiles {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long idProfile;
  private String Profile;

  protected Tbl_Profiles() {}

  public Tbl_Profiles(String Profile) {
    this.Profile = Profile;
  }

  @Override
  public String toString() {
    return String.format(
      "Customer[id=%d, Profile='%s']",
      idProfile, Profile);
  }

  public Long getIdProfile() {
    return idProfile;
  }

  public String getProfile() {
    return Profile;
  }
}
