package com.driveThruDepo.dodge;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;



public interface DodgeRepository extends JpaRepository<Dodge, Long> {
	
	void deleteDodgeById(Long id);
	Optional<Dodge> findDodgeById(Long id);

}
