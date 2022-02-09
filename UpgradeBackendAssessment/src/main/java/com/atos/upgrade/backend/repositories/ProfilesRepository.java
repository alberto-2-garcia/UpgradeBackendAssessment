package com.atos.upgrade.backend.repositories;

import java.util.List;

import com.atos.upgrade.backend.entities.Tbl_Profiles;

import org.springframework.data.repository.CrudRepository;

public interface ProfilesRepository extends CrudRepository<Tbl_Profiles, Long> {
}
