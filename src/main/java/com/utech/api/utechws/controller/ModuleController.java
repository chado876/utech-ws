package com.utech.api.utechws.controller;

import com.utech.api.utechws.model.Module;
import com.utech.api.utechws.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ModuleController {

    @Autowired
    ModuleService moduleService;

    @GetMapping("/modules")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<?> getAllModules() {
        List<Module> modules;

        try{
            modules = moduleService.getAllModules();
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), ex);
        }

        return new ResponseEntity<>(modules, HttpStatus.OK);
    }

    @GetMapping("/modules/{code}")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<?> getAllModules(@PathVariable String code) {

        Module module;
        try{
            module = moduleService.getModuleByCode(code);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), ex);
        }

        return new ResponseEntity<>(module, HttpStatus.OK);
    }

    @GetMapping("/module")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<?> getModuleByName(@RequestParam String name) {

        Module module;
        try{
            module = moduleService.getModuleByName(name);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), ex);
        }

        return new ResponseEntity<>(module, HttpStatus.OK);
    }

}
