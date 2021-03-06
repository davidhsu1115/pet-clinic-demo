package com.david.petclinicdemo.bootstrap;

import com.david.petclinicdemo.model.Owner;
import com.david.petclinicdemo.model.Vet;
import com.david.petclinicdemo.services.OwnerService;
import com.david.petclinicdemo.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jay");
        owner2.setLastName("King");

        ownerService.save(owner2);
        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Ramon");
        vet1.setLastName("Wood");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Cannon");
        vet2.setLastName("Woody");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
