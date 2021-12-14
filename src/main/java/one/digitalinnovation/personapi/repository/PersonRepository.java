package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//Classe que vai gerenciar banco de dados usando padrão DAO

public interface PersonRepository extends JpaRepository<Person, Long> {
}
