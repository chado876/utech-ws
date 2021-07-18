package com.utech.api.utechws.exception;

import com.utech.api.utechws.model.Module;

public class ModuleNotFoundException extends RuntimeException{
    public ModuleNotFoundException(String exception) { super(exception);}
}
