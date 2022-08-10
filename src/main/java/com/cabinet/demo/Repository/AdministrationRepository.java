package com.cabinet.demo.Repository;

import com.cabinet.demo.Entity.Administration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrationRepository  extends JpaRepository<Administration, String> {

}
