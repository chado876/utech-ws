package com.utech.api.utechws.service;

import com.utech.api.utechws.model.Module;
import com.utech.api.utechws.model.Tutor;
import com.utech.api.utechws.repository.ModuleRepo;
import com.utech.api.utechws.repository.TutorRepo;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SeederService {
    private final ModuleRepo moduleRepo;
    private final TutorRepo tutorRepo;

    public SeederService(ModuleRepo moduleRepo, TutorRepo tutorRepo){
        this.moduleRepo = moduleRepo;
        this.tutorRepo = tutorRepo;
    }

    @PostConstruct
    @Transactional
    public void seedData(){

        Tutor tutor1 = new Tutor(
                "John",
                "Doe"
        );

        Tutor tutor2 = new Tutor(
                "Jane",
                "Doe"
        );

        Module module1 = new Module(
                "CIT4004",
                "Analysis of Programming Languages",
                4,
                47200,
                tutor2
        );
        Module module2 = new Module(
                "CMP4011",
                "Artificial Intelligence",
                4,
                47200,
                tutor2
        );
        Module module3 = new Module(
                "CIT3006",
                "Theory of Computation",
                4,
                47200,
                tutor1
        );
        Module module4 = new Module(
                "CIT3003",
                "Analysis of Algorithms",
                4,
                47200,
                tutor1
        );

        tutorRepo.save(tutor1);
        tutorRepo.save(tutor2);

        moduleRepo.save(module1);
        moduleRepo.save(module2);
        moduleRepo.save(module3);
        moduleRepo.save(module4);

    }

}
