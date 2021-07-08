package com.utech.api.utechws.service;

import com.utech.api.utechws.exception.ModuleNotFoundException;
import com.utech.api.utechws.model.Module;
import com.utech.api.utechws.repository.ModuleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Module getModuleByCode(String code){
        Optional<Module> optionalModule = moduleRepo.findByModuleCode(code);

        if(optionalModule.isPresent()){
            Module module = optionalModule.get();
            return module;
        }

        throw new ModuleNotFoundException("No module found with code " + code);
    }

    public Module getModuleByName(String name){
        Optional<Module> optionalModule = moduleRepo.findByName(name);

        if(optionalModule.isPresent()){
            Module module = optionalModule.get();
            return module;
        }

        throw new ModuleNotFoundException("No module found with name " + name);
    }
}
