package org.sid.immatriculation.Mapper;

import org.sid.immatriculation.dto.OwnerResponseDTO;
import org.sid.immatriculation.entities.Owner;
import org.sid.immatriculation.grpc.stub.Imt;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OwnerMapper {
    public OwnerResponseDTO fromOwner(Owner owner){
        OwnerResponseDTO ownerResponseDTO =new OwnerResponseDTO();
        BeanUtils.copyProperties(owner,ownerResponseDTO);
        return ownerResponseDTO;
    }
    public Imt.Owner fromOwners(Owner owner){
        Imt.Owner owner1= Imt.Owner.newBuilder()
                .setId(owner.getId())
                .setBirthDate(owner.getBirthDate())
                .setName(owner.getName())
                .setEmail(owner.getEmail())
                .build();
        return owner1;
    }

    public Owner fromGrpcOwner(Owner owner){
        Owner owner2=new Owner();
        owner2.setId(owner.getId());
        owner2.setName(owner.getName());
        owner2.setBirthDate(owner.getBirthDate());
        owner2.setEmail(owner.getEmail());
        return owner2;
    }
}
