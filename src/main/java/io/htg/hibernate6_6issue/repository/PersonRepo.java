package io.htg.hibernate6_6issue.repository;

import io.htg.hibernate6_6issue.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
