package org.sid.immatriculation.service;
import org.sid.immatriculation.Mapper.OwnerMapper;
import org.sid.immatriculation.dto.OwnerRequestDTO;
import org.sid.immatriculation.dto.OwnerResponseDTO;
import org.sid.immatriculation.entities.Owner;
import org.sid.immatriculation.repository.OwnerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;
@Service
@Transactional

public class OwnerServiceImpl implements OwnerService {
    private OwnerRepository ownerRepository;
    private OwnerMapper ownerMapper;

    public OwnerServiceImpl(OwnerRepository ownerRepository, OwnerMapper ownerMapper) {
        this.ownerRepository = ownerRepository;
        this.ownerMapper = ownerMapper;
    }

    @Override
    public OwnerResponseDTO addOwner(OwnerRequestDTO owner) {
        Owner owner1 = Owner.builder()
                .id(UUID.randomUUID().toString())
                .name(owner.getName())
                .birthDate(System.currentTimeMillis())
                .email(owner.getEmail())
                .build();

         Owner ownersave = ownerRepository.save(owner1);
         OwnerResponseDTO ownerResponseDTO = ownerMapper.fromOwner(ownersave);
        return ownerResponseDTO;
    }

    @Override
    public OwnerResponseDTO updateOwner(String id, OwnerRequestDTO ownerRequestDTO) {
        Owner owner1 = Owner.builder()
                .id(id)
                .name(ownerRequestDTO.getName())
                .birthDate(System.currentTimeMillis())
                .email(ownerRequestDTO.getEmail())
                .build();

        Owner ownersave = ownerRepository.save(owner1);
        OwnerResponseDTO ownerResponseDTO = ownerMapper.fromOwner(ownersave);
        return ownerResponseDTO;
    }
    @Override
    public void deleteOwnere(String id) {
        ownerRepository.deleteById(id);

    }
}
