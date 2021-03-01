package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.SalaModel;

public interface SalaRepository extends JpaRepository<SalaModel, Integer>{
	
}
