package com.atos.upgrade.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.atos.upgrade.backend.entities.Tbl_Profiles;
// import com.atos.upgrade.backend.repositories.ProfilesRepository;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UpgradeBackendAssessmentApplication {

	// private static final Logger log = LoggerFactory.getLogger(UpgradeBackendAssessmentApplication.class);

  // @Bean
  // public CommandLineRunner demo(ProfilesRepository repository) {
  //   return (args) -> {
  //     // save a few customers
  //     repository.save(new Tbl_Profiles("Jack"));
  //     repository.save(new Tbl_Profiles("Chloe"));
  //     repository.save(new Tbl_Profiles("Kim"));
  //     repository.save(new Tbl_Profiles("David"));
  //     repository.save(new Tbl_Profiles("Michelle"));

  //     // fetch all customers
  //     log.info("Customers found with findAll():");
  //     log.info("-------------------------------");
  //     for (Tbl_Profiles customer : repository.findAll()) {
  //       log.info(customer.toString());
  //     }
  //     log.info("");

  //     // fetch an individual customer by ID
  //     Tbl_Profiles customer = repository.findById(1L);
  //     log.info("Customer found with findById(1L):");
  //     log.info("--------------------------------");
  //     log.info(customer.toString());
  //     log.info("");
  //     // for (Customer bauer : repository.findByLastName("Bauer")) {
  //     //  log.info(bauer.toString());
  //     // }
  //     log.info("");
  //   };
  // }

	public static void main(String[] args) {
		SpringApplication.run(UpgradeBackendAssessmentApplication.class, args);
	}
}
