//package org.isd.Immatriculation.web;
//
//import org.isd.Immatriculation.dto.OwnerRequestDTO;
//import org.isd.Immatriculation.dto.OwnerResponseDTO;
//import org.isd.Immatriculation.entities.Owner;
//import org.isd.Immatriculation.repository.OwnerRepository;
//import org.isd.Immatriculation.repository.VehicleRepository;
//import org.isd.Immatriculation.service.OwnerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebService;
//import java.util.List;
//
//@Component
//
//@WebService(serviceName = "immatriculations")
//
//public class ImmatriculationSopController {
//    @Autowired
//    private OwnerRepository ownerRepository;
//    @Autowired
//
//    private VehicleRepository vehicleRepository;
//    @Autowired
//
//    private OwnerService ownerService;
//
//    @WebMethod
//    public List<Owner> getAllOwner() {
//        return ownerRepository.findAll();
//    }
//
//    @WebMethod
//    public Owner owner(@WebParam(name = "id") String id){
//    return ownerRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("compte not found")));}
//
//    public OwnerResponseDTO saveOwner(@RequestBody OwnerRequestDTO ownerRequestDTO){
//
//        return ownerService.addOwner(ownerRequestDTO);
//    }
//
//}
