package org.sid.immatriculation.web;
import org.sid.immatriculation.dto.OwnerRequestDTO;
import org.sid.immatriculation.dto.OwnerResponseDTO;
import org.sid.immatriculation.entities.Owner;
import org.sid.immatriculation.entities.Vehicle;
import org.sid.immatriculation.repository.OwnerRepository;
import org.sid.immatriculation.repository.VehicleRepository;
import org.sid.immatriculation.service.OwnerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/immatriculations")
public class ImmatriculationRestController {

        private OwnerRepository ownerRepository;

        private VehicleRepository vehicleRepository;

        private OwnerService ownerService;

    public ImmatriculationRestController(OwnerRepository ownerRepository, VehicleRepository vehicleRepository, OwnerService ownerService) {
        this.ownerRepository = ownerRepository;
        this.vehicleRepository = vehicleRepository;
        this.ownerService = ownerService;
    }
    @GetMapping("/owners/{id}/vehicles")
    public List<Vehicle> getVehiclesForOwner(@PathVariable String id) {
        Owner owner = ownerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Owner not found"));

        return owner.getVehicles();
    }


    @GetMapping("/owners")
    public List<Owner> getAllOwner() {
        return ownerRepository.findAll();
    }

    @GetMapping("/owners/{id}")
    public Owner owner(@PathVariable String id){
        return ownerRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("compte not found")));
    }
    @PostMapping("/owners")

    public OwnerResponseDTO saveOwner(@RequestBody OwnerRequestDTO ownerRequestDTO){

        return ownerService.addOwner(ownerRequestDTO);
    }
    @PutMapping("/owners/{id}")
    public OwnerResponseDTO updateCompte( @PathVariable String id ,@RequestBody OwnerRequestDTO ownerRequestDTO){

        return ownerService.updateOwner(id ,ownerRequestDTO);
    }
    @DeleteMapping("/comptes/{id}")
    public boolean deleteCopmte(@PathVariable String id){
        ownerService.deleteOwnere(id);
        return true;
    }
    @GetMapping("/vehicles")
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

}
