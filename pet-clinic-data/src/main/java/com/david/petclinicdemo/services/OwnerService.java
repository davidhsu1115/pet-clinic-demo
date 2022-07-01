package com.david.petclinicdemo.services;

import com.david.petclinicdemo.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastname);

}
