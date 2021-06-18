package com.utech.api.utechws.service;

import com.utech.api.utechws.model.Module;
import com.utech.api.utechws.repository.ModuleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepo moduleRepo;

    public List<Module> getAllModules(){
        List<Module> modules = new ArrayList<>();
        Iterable<Module> modulesFromDb = moduleRepo.findAll();
        modulesFromDb.forEach(
                modules::add
        );
        return modules;
    }
}
