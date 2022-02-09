package com.atos.upgrade.backend.services;

import java.util.List;

import com.atos.upgrade.backend.entities.Tbl_Profiles;
import com.atos.upgrade.backend.repositories.ProfilesRepository;

import java.util.ArrayList;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service;

@Service
public class ProfilesService {
  @Autowired    
  private ProfilesRepository profilesRepository;

  public List<Tbl_Profiles> getAll() {    
    List<Tbl_Profiles> profilesRecords = new ArrayList<>();
    profilesRepository.findAll().forEach(profilesRecords::add);
    return profilesRecords;
  }    
  public void addUser(Tbl_Profiles profilesRecord) {    
    profilesRepository.save(profilesRecord);    
  }   
}
