package com.david.petclinicdemo.services;

import com.david.petclinicdemo.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
