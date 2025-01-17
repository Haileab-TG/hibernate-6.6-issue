package io.htg.hibernate6_6issue;

import io.htg.hibernate6_6issue.model.Person;
import io.htg.hibernate6_6issue.repository.PersonRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private final PersonRepo personRepo;

    public Runner(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setName("John Doe");
        person.setVersion(1);
        person.setId(1L);
        personRepo.saveAndFlush(person);
        System.out.println("Person saved" + personRepo.findById(1L).get());
    }
}
