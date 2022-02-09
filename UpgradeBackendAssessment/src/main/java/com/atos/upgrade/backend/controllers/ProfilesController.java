package com.atos.upgrade.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.atos.upgrade.backend.entities.Tbl_Profiles;
import com.atos.upgrade.backend.services.ProfilesService;

@RestController
public class ProfilesController {
  @Autowired
  private ProfilesService profilesService;

  @RequestMapping("/")
  public List<Tbl_Profiles> getAll() {
    return profilesService.getAll();
  }
  @RequestMapping(value="/add-profiles", method=RequestMethod.POST)
  public void addUser(@RequestBody Tbl_Profiles profileRecord) {
    profilesService.addUser(profileRecord);
  }
}
